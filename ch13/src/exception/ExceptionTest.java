package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a.txt");
			System.out.println("������ ����˴ϴ�.");
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println(e);
			return; //���ϵǾ��� ������ "���α׷� ����"�� ������� ����
		} finally {
			try {
				fis.close();
			} catch (Exception e) { //���� null�̱� ������ Exception ó��
				//e.printStackTrace();
				System.out.println(e);
				System.out.println("finally");
			}
			
		}
		System.out.println("���α׷� ����");
		
	}

}
