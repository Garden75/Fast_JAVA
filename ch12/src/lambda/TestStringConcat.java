package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		
		StringConImpl impl = new StringConImpl();
		impl.makeString("hello", "world");
		
		StringConcat concat = (s, v) -> System.out.println(s + ", " + v);
		concat.makeString("hello", "world");
		
		//내부적으로 람다식이 어떻게 돌아가는지 알아보자
		//익명클래스로 익명 객체를 생성하여 람다식이 사용된다.
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + ", " + s2);
			}
		};
		
		concat2.makeString("hello", "world");
	}

}
