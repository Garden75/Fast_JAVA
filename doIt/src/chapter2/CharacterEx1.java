package chapter2;

public class CharacterEx1 {

	public static void main(String[] args) {
		//char ch1 = 'A';
		char ch1 = 'Z';
		System.out.println(ch1);
		System.out.println((int)ch1); //해당 문자의 정수 값인 아스키코드값으로 출력
		
		//char ch2 = 66;
		char ch2 = 38;
		System.out.println(ch2);
		System.out.println((char)ch2);
		System.out.println((int)ch2); //문자형을 정수형으로 출력할 때
		//위 두 개의 출력문은 모두 ch2에 저장된 변수 값을 아스키코드값으로 저장했기 때문에 결과값을 B로 출력했다.
		
		//int ch3 = 67;
		int ch3 = 97;
		System.out.println(ch3); //문자 정수 값 출력
		System.out.println((char)ch3); //정수 값에 해당하는 문자 출력
	}

}
