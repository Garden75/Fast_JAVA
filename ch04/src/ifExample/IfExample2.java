package ifExample;

import java.util.Scanner;

public class IfExample2 {

	public static void main(String[] args) {
		
		//직접 값을 입력받는 기능
		Scanner scan = new Scanner(System.in);
		
		//int age = 10;
		int age = scan.nextInt();
		int charge;
		
		if(age < 8 ) {
			charge = 1000;
			System.out.println("유아");
		} else if(age < 14) {
			charge = 1500;
			System.out.println("초등생");
		} else if(age < 20) {
			charge = 2000;
			System.out.println("중고등생");
		} else {
			charge = 3000;
			System.out.println("성인");
		}
		
		System.out.println("나이 : " + age );
		System.out.println("요금 : " + charge);

	}

}
