package classEx;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, 
			IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		Person person = new Person("James");
		System.out.println(person);
		
		Class c1 = Class.forName("classEx.Person");
		Person person1 = (Person)c1.newInstance();
		System.out.println(person1); //null 출력, 파라미터값을 넣지 않았기 때문임
		
		Class[] parameterTypes = {String.class}; //파라미터 타입을 입력
		Constructor cons = c1.getConstructor(parameterTypes);
		
		Object[] initargs = {"김유신"}; //파라미터 값을 입력
		Person personKim = (Person)cons.newInstance(initargs);
		System.out.println(personKim);

	}

}
