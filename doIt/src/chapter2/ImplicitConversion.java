package chapter2;

public class ImplicitConversion {

	public static void main(String[] args) {
		byte bNum = 10;
		int iNum = bNum; //byte���� int������ ���Ե�
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println(iNum2);
		System.out.println(fNum);
		
		int iNum3 = 20;
		float fNum2 = iNum3;
		double dNum;
		dNum = fNum2 + iNum3; //fNum2 + iNum3�� float���� dNum�� double���̹Ƿ� �� ������ �ڷ������� ��ȯ��
		
		System.out.println(dNum);

	}

}
