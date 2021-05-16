package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a.txt");
			System.out.println("파일이 실행됩니다.");
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println(e);
			return; //리턴되었기 때문에 "프로그램 종료"가 실행되지 않음
		} finally {
			try {
				fis.close();
			} catch (Exception e) { //값이 null이기 때문에 Exception 처리
				//e.printStackTrace();
				System.out.println(e);
				System.out.println("finally");
			}
			
		}
		System.out.println("프로그램 종료");
		
	}

}
