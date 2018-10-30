package qrcode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import javax.imageio.ImageIO;
import javax.swing.filechooser.FileSystemView;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import org.apache.log4j.*;

public class QrCode {
	private static Logger logger = Logger.getLogger(QrCode.class);
	/*private static final int BLACK = 0xFF000000;
    private static final int WHITE = 0xFFFFFFFF;*/
    private static final String CHARSET = "utf-8";
	private static final String FORMAT_NAME = "JPG";
 // 二维码尺寸
 	private static final int QRCODE_SIZE = 320;
    // LOGO宽度
 	private static final int WIDTH = 60;
 	// LOGO高度
 	private static final int HEIGHT = 60; 
	
	/*public static String createQrCode(String url, String path, String fileName) {
		try {
            Map<EncodeHintType, Object> hints = new HashMap<EncodeHintType, Object>();            
            hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");          
            hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);

            BitMatrix bitMatrix = new MultiFormatWriter().encode(url, BarcodeFormat.QR_CODE, 320, 320, hints);
 //           QRCodeWriter().encode(contents, BarcodeFormat.QR_CODE, 320, 320, hints);

            File file = new File(path, fileName);
            if (file.exists() || ((file.getParentFile().exists() || file.getParentFile().mkdirs()) && file.createNewFile())) {
                writeToFile(bitMatrix, "png", file);
                logger.info("生成图片：" + file);
            }
 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }*/
 
    /*public static void writeToFile(BitMatrix matrix, String format, File file) throws IOException {
        BufferedImage image = toBufferedImage(matrix);
        
        if (!ImageIO.write(image, format, file)) {
            throw new IOException("Could not write an image of format " + format + " to " + file);
        }
    }*/
 
   /* public static void writeToStream(BitMatrix matrix, String format, OutputStream stream) throws IOException {
        BufferedImage image = toBufferedImage(matrix);
        if (!ImageIO.write(image, format, stream)) {
            throw new IOException("Could not write an image of format " + format);
        }
    }*/
    
    /*private static BufferedImage toBufferedImage(BitMatrix matrix) {
        int width = matrix.getWidth();
        int height = matrix.getHeight();
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                image.setRGB(x, y, matrix.get(x, y) ? BLACK : WHITE); 
            }
        }
        String imgPath;
		QrCode.insertImage(image, imgPath, needCompress);
        return image;
        
    }*/
 	
 	/**
	 * 生成二维码
	 * @param content	源内容
	 * @param imgPath	生成二维码保存的路径
	 * @param needCompress	是否要压缩
	 * @return		返回二维码图片
	 * @throws Exception
	 */
 	
 	private static BufferedImage createImage(String content, String imgPath, boolean needCompress) throws Exception {
		Hashtable hints = new Hashtable();
		hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
		hints.put(EncodeHintType.CHARACTER_SET, CHARSET);
		hints.put(EncodeHintType.MARGIN, 1);
		BitMatrix bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, QRCODE_SIZE, QRCODE_SIZE,
				hints);
		int width = bitMatrix.getWidth();
		int height = bitMatrix.getHeight();
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				image.setRGB(x, y, bitMatrix.get(x, y) ? 0xFF000000 : 0xFFFFFFFF);
			}
		}
		if (imgPath == null || "".equals(imgPath)) {
			return image;
		}
		// 插入图片
		QrCode.insertImage(image, imgPath, needCompress);
		return image;
	}
 	
 	/**
	 * 在生成的二维码中插入图片
	 * @param source
	 * @param imgPath
	 * @param needCompress
	 * @throws Exception
	 */
    
    private static void insertImage(BufferedImage source, String imgPath, boolean needCompress) throws Exception {
		File file = new File(imgPath);
		if (!file.exists()) {
			System.err.println("" + imgPath + "   该文件不存在！");
			return;
		}
		Image src = ImageIO.read(new File(imgPath));
		int width = src.getWidth(null);
		int height = src.getHeight(null);
		if (needCompress) { // 压缩LOGO
			if (width > WIDTH) {
				width = WIDTH;
			}
			if (height > HEIGHT) {
				height = HEIGHT;
			}
			Image image = src.getScaledInstance(width, height, Image.SCALE_SMOOTH);
			BufferedImage tag = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			Graphics g = tag.getGraphics();
			g.drawImage(image, 0, 0, null); // 绘制缩小后的图
			g.dispose();
			src = image;
		}
		// 插入LOGO
		Graphics2D graph = source.createGraphics();
		int x = (QRCODE_SIZE - width) / 2;
		int y = (QRCODE_SIZE - height) / 2;
		graph.drawImage(src, x, y, width, height, null);
		Shape shape = new RoundRectangle2D.Float(x, y, width, width, 6, 6);
		graph.setStroke(new BasicStroke(3f));
		graph.draw(shape);
		graph.dispose();
	}
    
    
		
    public static void main(String[] args) {
    	String url = "https://qingguozth.github.io/";
    	String path = "C:\\Users\\admin\\Desktop\\测试QrCode";
    	String fileName = "demo.png";
//    	String string = createQrCode(url,path,fileName);
    	
    } 
}
