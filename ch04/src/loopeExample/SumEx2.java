package loopeExample;

import java.util.Scanner;

public class SumEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt(); //�ʱ� ���๮
		int sum = 0;
		
		while (input != 0) {
			sum += input; //�ʱ� ���๮�� �ϴ� �����ְ� ���� �ݺ��� ���� �� �� ������ ����
			input = scan.nextInt(); // �ݺ��� ���๮
		}
		
		System.out.println(sum);
	}

}
