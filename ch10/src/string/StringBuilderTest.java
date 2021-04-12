package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder buffer = new StringBuilder(java); //가변적임
		System.out.println(System.identityHashCode(buffer)); //366712642
		buffer.append("android");
		
		java = buffer.toString();
		System.out.println(System.identityHashCode(buffer)); //366712642
		
		System.out.println(java);
	}

}
