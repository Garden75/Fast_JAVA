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
		// for���� index Ƚ��, ���� �������� ���� cnt
		int cnt = 1;
		int total = 0;
		
		for(int i = 0; i < 10; i++, cnt++ ) { //Ƚ���θ� 10��  index�� ���� i�� ���, <
			total += cnt;
			//cnt++;
		}
		System.out.println(total);
	}
}
