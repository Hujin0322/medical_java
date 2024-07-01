package p0701;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Inputstream {

	public static void main(String[] args) {

		// 기본적인 InputStream 형태 - 입력
		try {
			FileInputStream fis = new FileInputStream("c:/save/aaa.txt");
			int read = 0;
			while ((read = fis.read()) != -1) {
				System.out.println(read);
			}
		}catch(Exception e) {e.printStackTrace();}
		
//		try {
//			FileInputStream fis = new FileInputStream("c:/save/aaa2.txt");
//			int read = 0;
//			try {
//				while ((read = fis.read()) != -1) {
//					System.out.println(read);
//				}
//	
//			} catch (IOException e) {e.printStackTrace();} 
//		}catch(FileNotFoundException e) {e.printStackTrace();}
		
//		byte[] b = new byte[1024];
//		
//		try {
//			FileInputStream fis =  new FileInputStream("c:/save/aaa.txt");
//			fis.read(b); //파일 읽어오기
//			System.out.println(new String(b));
//			
//		} catch (FileNotFoundException e) {e.printStackTrace();}
		
		}
	}


