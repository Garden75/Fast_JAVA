package chapter2;

public class Variable2 {

	public static void main(String[] args) {
		byte b1 = -128;
		//byte b2 = 128; //��� ������ �ʰ��� �������� ���� �����̴�.
		System.out.println(b1);
		
		short sVal = 10;
		byte bVal = 20;
		System.out.println(sVal + bVal);
		/*
		 * �� ������ ���ϱ� ���� �� ������ ��� int������ ��ȯ�ǰ� ���� ������� int������ ����ȴ�. �� ������ �⺻���� int���̰�
		 * byte���̳� short���� ��ǻ�Ͱ� ������ ���ϰ� �Ϸ��� ���������� int������ ��ȯ
		 */
		
		//int num1 = 12345678900; //int ������ �ʰ���
		//long num2 = 12345678900; //�ڹٴ� ��� ���� ���� �⺻���� int������ ó���ϱ� �����̴�. Ÿ���� �ĺ��� �ʿ�!
		long num3 = 12345678900l;
		System.out.println(num3);
		
		long num4 = 1002; //int���� ������ �� �ȿ� ������ �ڵ� long������ ��ȯ�Ǹ� �ĺ��ڰ� �ʿ����!
	}

}
