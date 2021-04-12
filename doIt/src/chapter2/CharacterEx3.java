package chapter2;

public class CharacterEx3 {

	public static void main(String[] args) {
		int a = 65;
		int b = -66;
		
		char a2 = 65;
		//char b2 = -66; //문자형 변수에 음수를 넣으면 자료타입이 맞지않음
		
		System.out.println((char)a);
		System.out.println((char)b); //?는 알 수 없는 문자라는 의미
		System.out.println(a2);
		System.out.println((int)a2);

	}

}
