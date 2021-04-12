package practice;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char operator = '+';
		int num1 = 10;
		int num2 = 5;
		
		int result = 0;
		
		if(operator == '+') {
			result = num1 + num2;
		} else if(operator == '-') {
			result = num1 - num2;
		} else if(operator == '*') {
			result = num1 * num2;
		} else if(operator == '/') {
			result = num1 / num2;
		} else {
			System.out.println("Error");
		}
		
		System.out.println("연산자는 " + operator + "이고 결과는 " + result + "입니다.");
		
		
		switch(operator) {
			case '+':
				result = num1 + num2;
				System.out.println("연산자는 " + operator + "이고 결과는 " + result + "입니다.");
				break;
			case '-':
				result = num1 - num2;
				System.out.println("연산자는 " + operator + "이고 결과는 " + result + "입니다.");
				break;
			case '*':
				result = num1 * num2;
				System.out.println("연산자는 " + operator + "이고 결과는 " + result + "입니다.");
				break;
			case '/':
				result = num1 / num2;
				System.out.println("연산자는 " + operator + "이고 결과는 " + result + "입니다.");
				break;
			default:
				System.out.println("Error");
		}
	}

}
