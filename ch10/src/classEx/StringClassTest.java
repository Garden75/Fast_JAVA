package classEx;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class c1 = String.class;
		
		String str = new String();
		Class c2 = str.getClass();
		
		Class c3 = Class.forName("java.lang.String");
		
		//동적 로딩한 라이브러리 생성자 출력
		Constructor[] cons = c3.getConstructors();
		for(Constructor con : cons) {
			System.out.println(con);
		}
		
		System.out.println();
		
		//동적 로딩한 라이브러리 메소드 출력
		Method[] methods = c3.getMethods();
		for(Method method : methods) {
			System.out.println(method);
		}

	}

}
