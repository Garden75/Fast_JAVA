package ch02;

public class IntegerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte bs = -128; //-128 ~ 127���� ǥ���� ������
		System.out.println(bs);
		
		//int iVal = 12345678900; // out of range
		long lVal = 12345678900L;
		System.out.println(lVal);
		// JAVA�� ���������� ���ڸ� 4����Ʈ int������ �޾Ƶ��� = ���ͷ�
		// int���� long������ �����ϱ� ���� +L�� �߰����ش�.
	}

}
