package operator;

public class OperatorEx5 {

	public static void main(String[] args) {
		
		int num1 = 0B00001010; //10
		int num2 = 0B00000101; //5
		
		System.out.println(num1 & num2); //0
		System.out.println(num1 | num2); //15
		System.out.println(num1 ^ num2); //15
		
		System.out.println(num2 << 1); //10 (2�� �����¸�ŭ ���Ѵ�)
		System.out.println(num2 >> 2);//1
		System.out.println(num2 >> 1); //2
		//����Ʈ ������ ����� ������ �����Ϸ��� ���մ��Կ����ڸ� ���� ���ָ�ȴ�.
		System.out.println(num2 <<= 2); //20
	}
}
