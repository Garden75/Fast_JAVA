package chapter2;

public class Variable2 {

	public static void main(String[] args) {
		byte b1 = -128;
		//byte b2 = 128; //허용 범위를 초과한 정수값이 들어갔기 때문이다.
		System.out.println(b1);
		
		short sVal = 10;
		byte bVal = 20;
		System.out.println(sVal + bVal);
		/*
		 * 두 정수를 더하기 전에 두 정수는 모두 int형으로 변환되고 더한 결과값도 int형으로 저장된다. 즉 정수의 기본형은 int형이고
		 * byte형이나 short형은 컴퓨터가 연산을 편리하게 하려고 내부적으로 int형으로 변환
		 */
		
		//int num1 = 12345678900; //int 허용범위 초과함
		//long num2 = 12345678900; //자바는 모든 정부 값을 기본으로 int형으로 처리하기 때문이다. 타입의 식별자 필요!
		long num3 = 12345678900l;
		System.out.println(num3);
		
		long num4 = 1002; //int형의 허용범위 값 안에 있으면 자동 long형으로 전환되며 식별자가 필요없음!
	}

}
