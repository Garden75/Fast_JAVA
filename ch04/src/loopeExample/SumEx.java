package loopeExample;

import java.util.Scanner;

public class SumEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int input;
		int sum = 0;
		
		do {
			input = scan.nextInt(); //�ʱ� �� �ݺ� ���๮
			sum += input;
		} while(input != 0);
		
		System.out.println(sum);
	}

}
