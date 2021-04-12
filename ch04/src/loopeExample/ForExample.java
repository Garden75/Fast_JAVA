package loopeExample;

public class ForExample {

	public static void main(String[] args) {
		
		int count;
		int sum = 0;
		
		for(count = 1; count <= 10; count++) { // <=
			
			sum += count;
		}
		
		System.out.println(sum);
		
		///////////////////////////////////////
		// for문의 index 횟수, 실제 더해지는 값은 cnt
		int cnt = 1;
		int total = 0;
		
		for(int i = 0; i < 10; i++, cnt++ ) { //횟수로만 10번  index의 줄임 i로 사용, <
			total += cnt;
			//cnt++;
		}
		System.out.println(total);
	}
}
