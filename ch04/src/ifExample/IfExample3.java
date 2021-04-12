package ifExample;

import java.util.Scanner;

public class IfExample3 {

	public static void main(String[] args) {
		
		//직접 값을 입력받는 기능
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		char grade;
		
		/*
		 * if(num <= 59 ) { grade = 'F'; } else if(num >= 60 && num < 70) { grade = 'D';
		 * } else if(num >= 70 && num < 80) { grade = 'C'; } else if(num >= 80 && num <
		 * 90) { grade = 'B'; } else { grade = 'A'; }
		 */
		if(num >= 90 ) {
			grade = 'A';
		} else if(num >= 80) {
			grade = 'B';
		} else if(num >= 70) {
			grade = 'C';
		} else if(num >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.println("점수 : " + num );
		System.out.println("학점 : " + grade);

	}

}
