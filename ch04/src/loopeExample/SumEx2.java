package loopeExample;

import java.util.Scanner;

public class SumEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt(); //초기 수행문
		int sum = 0;
		
		while (input != 0) {
			sum += input; //초기 수행문을 일단 더해주고 나서 반복문 수행 후 더 해지는 구문
			input = scan.nextInt(); // 반복문 수행문
		}
		
		System.out.println(sum);
	}

}
