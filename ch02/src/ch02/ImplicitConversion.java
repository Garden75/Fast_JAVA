package ch02;

public class ImplicitConversion {
	
	public static void main(String[] args) {
		
		byte bNum = 10;
		int iNum = bNum; //������ �� ��ȯ�� �Ͼ, ���� �� ���� ū ������ ��
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2; //��� ������ �Ǽ��� �� ��ȯ�� �� ����
		
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum; //������ �켱����
		//���� iNum�� float�� �ٲ�� ������ ���� double�� �� ��ȯ�� 
		
		System.out.println(dNum);
	}

}
