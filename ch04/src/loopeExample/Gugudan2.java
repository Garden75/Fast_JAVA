package loopeExample;

public class Gugudan2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dan = 2;
		int count = 1;
		
		for(dan = 2; dan <= 9; dan++) { //단
			
			if((dan % 2) != 0) continue;
		  
			for(count = 1; count <=9; count++) { //카운트
				
				if(count > dan) break;
				System.out.println(dan + "x" + count + " = " + dan * count);
			 
			 }
				System.out.println(); 
		 }
	}

}
