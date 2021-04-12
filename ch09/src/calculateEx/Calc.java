package calculateEx;

public interface Calc {
	
	double PI = 3.14;
	//public static final double PI = 3.14;
	int ERROR = -999999999;
	
	//인터페이스에서의 메서드 표현방식
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	//public String stringAdd(String s1, String s2); 일반 메서드의 경우 표현방식
	
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
		myMethod();
	}
	
	static int total(int[] arr) {
		int total = 0;
		
		for(int i: arr) {
			total += i;
		}
		mystaticMethod();
		return total;
	}
	
	// 오류의 원인은 java 1.8에서는 제공되지 않기 때문이다.
	private void myMethod() {
		System.out.println("private method");
	}
	
	private static void mystaticMethod() {
		System.out.println("private static method");
	}

}
