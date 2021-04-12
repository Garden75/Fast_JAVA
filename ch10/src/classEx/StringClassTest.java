package classEx;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class c1 = String.class;
		
		String str = new String();
		Class c2 = str.getClass();
		
		Class c3 = Class.forName("java.lang.String");
		
		//���� �ε��� ���̺귯�� ������ ���
		Constructor[] cons = c3.getConstructors();
		for(Constructor con : cons) {
			System.out.println(con);
		}
		
		System.out.println();
		
		//���� �ε��� ���̺귯�� �޼ҵ� ���
		Method[] methods = c3.getMethods();
		for(Method method : methods) {
			System.out.println(method);
		}

	}

}