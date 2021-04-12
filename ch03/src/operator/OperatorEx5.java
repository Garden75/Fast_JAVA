package operator;

public class OperatorEx5 {

	public static void main(String[] args) {
		
		int num1 = 0B00001010; //10
		int num2 = 0B00000101; //5
		
		System.out.println(num1 & num2); //0
		System.out.println(num1 | num2); //15
		System.out.println(num1 ^ num2); //15
		
		System.out.println(num2 << 1); //10 (2의 지수승만큼 곱한다)
		System.out.println(num2 >> 2);//1
		System.out.println(num2 >> 1); //2
		//시프트 연산의 결과를 변수에 대입하려면 복합대입연산자를 같이 써주면된다.
		System.out.println(num2 <<= 2); //20
	}
}
