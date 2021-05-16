package stream;

import java.util.Arrays;

public class IntStreamTest {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		int sum = Arrays.stream(arr).sum();
		int count = (int) Arrays.stream(arr).count(); //count()가 long타입이기 때문에 int로 다운캐스팅
		
		System.out.println(sum);
		System.out.println(count);
		
		//배열의 요소를 모두 더하는 Stream reduce()
		int result = Arrays.stream(arr).reduce(0,(a, b) -> a+b);
		System.out.println(result);
	}

}
