package operator;

public class OperatorEx3 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		
		//boolean value = ((num1 += 10) < 10) && ((i += 2) < 10);
		//boolean value2 = ((num1 += 10) < 10) || ((i += 2) < 10);
		//boolean value3 = ((num1 += 10) > 10) || ((i += 2) < 10);
		boolean value4 = ((num1 += 10) > 10) && ((i += 2) < 10);
		
		System.out.println(num1);
		System.out.println(i); // value���� ������ ���� ������ num1�� ���� �̹� false�� ���� ����Ǿ��� ������ �򰡵��� ����
							   // value3���� �̹� num1�� ���� true�̱� ������ �ڿ� ���� ����� ���� ����
		System.out.println(value4);
		
		
	}
}
