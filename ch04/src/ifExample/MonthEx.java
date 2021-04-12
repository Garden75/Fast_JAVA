package ifExample;

import java.util.Scanner;

public class MonthEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		int day;
		
		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				day = 31;
				break;
			case 2:
				day = 28;
				break;
			case 4: case 6: case 9: case 11:
				day = 30;
				break;
			default:
				day = 0;
				System.out.println("error");
		}
		
		System.out.println(month + "월은 " + day + "일입니다.");
		
	}

}
