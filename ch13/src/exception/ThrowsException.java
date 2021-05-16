package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream(fileName);
		Class cls = Class.forName(className);
		return cls;
	}

	public static void main(String[] args) {
		
		ThrowsException exp = new ThrowsException();
		
		try {
			//exp.loadClass("b.txt", "java.lang.string");
			//exp.loadClass("a.txt", "java.lang.string");
			exp.loadClass("a.txt", "java.lang.String");
		} catch (FileNotFoundException | ClassNotFoundException e) {
			//e.printStackTrace();
			System.out.println(e);
		} catch (Exception e) { //�ֻ��� exception Ŭ����, �������� ��ġ�ؾ� ��
			System.out.println(e);
		}
		System.out.println("���α׷� ����");
		
	}

}
