package loopeExample;

public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		int num = 1;
		
		for(num = 1; sum <= 100; num++) {
			sum += num;
			if(sum >= 100) break;
		}
		
		System.out.println(sum);
		System.out.println(num);
	}

}
