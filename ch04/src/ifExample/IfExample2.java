package ifExample;

import java.util.Scanner;

public class IfExample2 {

	public static void main(String[] args) {
		
		//���� ���� �Է¹޴� ���
		Scanner scan = new Scanner(System.in);
		
		//int age = 10;
		int age = scan.nextInt();
		int charge;
		
		if(age < 8 ) {
			charge = 1000;
			System.out.println("����");
		} else if(age < 14) {
			charge = 1500;
			System.out.println("�ʵ��");
		} else if(age < 20) {
			charge = 2000;
			System.out.println("�߰���");
		} else {
			charge = 3000;
			System.out.println("����");
		}
		
		System.out.println("���� : " + age );
		System.out.println("��� : " + charge);

	}

}
