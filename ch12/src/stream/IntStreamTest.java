package stream;

import java.util.Arrays;

public class IntStreamTest {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		int sum = Arrays.stream(arr).sum();
		int count = (int) Arrays.stream(arr).count(); //count()�� longŸ���̱� ������ int�� �ٿ�ĳ����
		
		System.out.println(sum);
		System.out.println(count);
		
		//�迭�� ��Ҹ� ��� ���ϴ� Stream reduce()
		int result = Arrays.stream(arr).reduce(0,(a, b) -> a+b);
		System.out.println(result);
	}

}
