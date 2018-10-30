package stringtest;
import java.util.Scanner;
import org.apache.log4j.*;

public class StringMethodDemo {
	private static Logger logger = Logger.getLogger(StringMethodDemo.class);
	public static String reverse01(String s) {
		String str = "";
		for(int i = s.length() - 1; i>=0; i-- ){	
			str += s.charAt(i);
		}
		return str;
	}
	static String reverse02(String s ) {
		String str = "";
		char[] ch = s.toCharArray();
		for(int i = s.length()-1; i >= 0; i--) {
			str += ch[i];
		}
		
		return str;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		logger.info("请输入要反转的字符串：");
		String str = input.nextLine();
		String str01 = reverse01(str);
		logger.info(str01);
		String str02 = reverse02(str);
		logger.info(str02);
		//StringBuffer对象的创建
		StringBuffer s = new StringBuffer("tset");
		s.deleteCharAt(1);
		logger.info(s);
		s.insert(2,"jk");
		logger.info(s);
		s.setCharAt(2, 'D');
		logger.info(s);
		s.reverse();
		logger.info(s);
		s.trimToSize();
		
	}

}
