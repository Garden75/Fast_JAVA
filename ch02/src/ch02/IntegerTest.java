package ch02;

public class IntegerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte bs = -128; //-128 ~ 127까지 표현이 가능함
		System.out.println(bs);
		
		//int iVal = 12345678900; // out of range
		long lVal = 12345678900L;
		System.out.println(lVal);
		// JAVA는 내부적으로 숫자를 4바이트 int형으로 받아들임 = 리터럴
		// int형을 long형으로 변경하기 위해 +L를 추가해준다.
	}

}
