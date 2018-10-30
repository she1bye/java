package qrcode;

public class Test {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
			
			//生成带logo 的二维码 
			String text = "https://qingguozth.github.io/";
			Qrcode1.encode(text, "D:\\WPS\\11.JPG", "d:/WPS", true);
			 
			//生成不带logo 的二维码
			String textt = "https://qingguozth.github.io/";
			Qrcode1.encode(textt,"","d:/WPS",true);
			
			//指定二维码图片，解析返回数据
			System.out.println("解析的结果为：");
			System.out.println(Qrcode1.decode("D:/WPS/74152956.jpg"));
	}

}
