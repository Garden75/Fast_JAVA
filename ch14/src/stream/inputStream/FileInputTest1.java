package stream.inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream fis = null; //전역변수로 선언
		
		try {
			fis = new FileInputStream("input.txt");
			
			// 한 바이트씩 읽기
			int i = fis.read();
			System.out.println((char)i);
			i = fis.read();
			System.out.println((char)i);
			i = fis.read();
			System.out.println((char)i);
			
			System.out.println("=============================");
			// 파일의 끝까지 읽기
			int j;
			while((j = fis.read()) != -1) {
				System.out.print((char)j);
			}
			
		} catch (IOException e) { //FileNotFoundException를 포함한 상위 exception
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("end");
	}

}
