package operator;

public class OperatorEx2 {

	public static void main(String[] args) {
		
		int num1 = 5%3;
		int num2 = 10%3;
		
		System.out.println(num1);
		System.out.println(num2);
		//나머지의 범위 값은 0~n-1이며 위 num1과 num2에서는 0~ 3-1까지이다.
		
		int num3 = 10;
		num3 += 2; // 복합 대입연산자
		
		System.out.println(num3);
	}
}
