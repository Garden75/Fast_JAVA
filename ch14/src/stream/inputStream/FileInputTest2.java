package stream.inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(FileInputStream fis = new FileInputStream("input.txt")){ //try �ȿ� ����, �̶� finally ���� �ʿ����
			int j;
			while((j = fis.read()) != -1) {
				System.out.print((char)j);
			}
			
		} catch (IOException e) { //FileNotFoundException�� ������ ���� exception
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
