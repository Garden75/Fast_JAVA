package calculateEx;

public interface Calc {
	
	double PI = 3.14;
	//public static final double PI = 3.14;
	int ERROR = -999999999;
	
	//�������̽������� �޼��� ǥ�����
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	//public String stringAdd(String s1, String s2); �Ϲ� �޼����� ��� ǥ�����
	
	default void description() {
		System.out.println("���� ���⸦ �����մϴ�.");
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
	
	// ������ ������ java 1.8������ �������� �ʱ� �����̴�.
	private void myMethod() {
		System.out.println("private method");
	}
	
	private static void mystaticMethod() {
		System.out.println("private static method");
	}

}
