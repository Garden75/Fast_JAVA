package loopeExample;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dan = 2;
		int count = 1;

		for(dan = 2; dan <= 9; dan++) { //단
		  
		for(count = 1; count <=9; count++) { //카운트
			System.out.println(dan + "x" + count + " = " + dan * count);
		 
		 }
			System.out.println(); 
	 }
		 

		while (dan <= 9) {
			count = 1; // count 초기화
			while (count <= 9) {
				System.out.println(dan + "x" + count + " = " + dan * count);
				count++;
			}
			dan++;
			System.out.println();
		}
	}

}
