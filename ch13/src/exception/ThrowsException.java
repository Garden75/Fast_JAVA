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
		} catch (Exception e) { //최상위 exception 클래스, 마지막에 위치해야 함
			System.out.println(e);
		}
		System.out.println("프로그램 종료");
		
	}

}
