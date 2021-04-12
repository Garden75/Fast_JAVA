package ch02;

public class CharTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch = 'A';
		
		System.out.println(ch);
		System.out.println((int)ch); //타입캐스팅
		
		int iCh = 66;
		
		System.out.println(iCh); //내부적으로 정수값을 가지고 있음
		System.out.println((char)iCh);
		
		//char ch2 = -66; //음수값은 들어갈 수 없음
		
		char hangul = '\uAC00'; //유니코드 값 사용
		
		System.out.println(hangul);
		
		char ch2 = '한';
		
		System.out.println(ch2);
	}

}
