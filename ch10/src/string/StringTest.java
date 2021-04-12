package string;

public class StringTest {

	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2); //힙 메모리에 저장되어 다른 주소값을 가진다.
		
		String str3 = "abc";
		String str4 = "abc";
		
		System.out.println(str3 == str4); //상수풀에 저장되어 같은 주소값을 가르킨다.
	}

}
