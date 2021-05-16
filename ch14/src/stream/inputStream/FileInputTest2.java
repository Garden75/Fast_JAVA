package stream.inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(FileInputStream fis = new FileInputStream("input.txt")){ //try 안에 선언가, 이때 finally 구문 필요없음
			int j;
			while((j = fis.read()) != -1) {
				System.out.print((char)j);
			}
			
		} catch (IOException e) { //FileNotFoundException를 포함한 상위 exception
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
