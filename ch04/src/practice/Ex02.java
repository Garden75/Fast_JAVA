package practice;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("홀수 값을 입력하세요:");
		
		Scanner scan = new Scanner(System.in);
		
		int lineCount = scan.nextInt();
		int spaceCount = lineCount/2 + 1;
		int starCount = 1;
		
		for(int i = 0; i<lineCount; i++) {
			for(int j = 0; j<spaceCount; j++) {
				System.out.print(" ");
				//System.out.println("1");
			}
			for(int j = 0; j<starCount; j++) {
				System.out.print("*");
				//System.out.println("2");
			}
			for(int j = 0; j<spaceCount; j++) {
				System.out.print(" ");
				//System.out.println("3");
			}
			
			if(i<lineCount/2) {
				spaceCount -= 1;
				starCount += 2;
			} else {
				spaceCount += 1;
				starCount -= 2;
			}
			
			System.out.println(); //줄바꿈
		}
	}

}
