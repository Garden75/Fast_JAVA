package classpart;

public class FunctionTest {

	//사칙연산
	public static int addNum(int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;
	}
	
	public static int minusNum(int num1, int num2) {
		int result;
		result = num1 - num2;
		return result;
	}
	
	public static int multiNum(int num1, int num2) {
		int result;
		result = num1 * num2;
		return result;
	}
	
	public static int diviNum(int num1, int num2) {
		int result;
		result = num1 / num2;
		return result;
	}
	
	//void
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	
	//total
	public static int calcSum() {
		int sum = 0;
		int i;
		
		for(i = 0; i <= 100; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 = 10;
		int n2 = 40;
		
		int addtotal = addNum(n1, n2);
		int minustotal = minusNum(n1, n2);
		int multitotal = multiNum(n1, n2);
		int divitotal = diviNum(n1, n2);
		
		sayHello("안녕하세요.");
		int num = calcSum();
		
		System.out.println("addtotal = " + addtotal);
		System.out.println("minustotal = " + minustotal);
		System.out.println("multitotal = " + multitotal);
		System.out.println("divitotal = " + divitotal);
		System.out.println("num = " + num);
	}

}
