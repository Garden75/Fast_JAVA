package stream.inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream fis = null; //���������� ����
		
		try {
			fis = new FileInputStream("input.txt");
			
			// �� ����Ʈ�� �б�
			int i = fis.read();
			System.out.println((char)i);
			i = fis.read();
			System.out.println((char)i);
			i = fis.read();
			System.out.println((char)i);
			
			System.out.println("=============================");
			// ������ ������ �б�
			int j;
			while((j = fis.read()) != -1) {
				System.out.print((char)j);
			}
			
		} catch (IOException e) { //FileNotFoundException�� ������ ���� exception
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
