package loopeExample;

public class WhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			sum += num;
			num++;			
		}
		
		System.out.println("총합은 " + sum + "입니다.");
		System.out.println(num);
	}

}
