package ch02;

public class ExplicitConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1000;
		byte bNum = (byte)i; //4����Ʈ�� 1����Ʈ�� ����, �������� ������ �߻��� �� ����
		
		System.out.println(bNum); //���� �߷��� ������ ���� ����
		
		double dNum = 1.2;
		float fNum = 0.9F;
		
		//����� �� ��ȯ �ʿ�
		int iNum1 = (int)dNum + (int)fNum; //truncate�� 1 + 0 = 1
		int iNum2 = (int)(dNum + fNum); // 1.2 + 0.9 = 2
		
		System.out.println(iNum1);
		System.out.println(iNum2);
	}

}
