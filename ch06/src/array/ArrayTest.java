package array;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. �迭 ���� �� �ʱ�ȭ ���
		int[] arr = new int[10];
		int[] arr2 = new int[] {1, 2, 4};
		
		int total = 0;
		
		for(int i = 0, num = 1; i < arr.length; i++, num++) {
			arr[i] = num;
		}
		
		for(int i = 0; i < arr.length; i++) {
			total += arr[i];
			System.out.println(arr[i]);
		}
		
		System.out.println("��� ����� �� : " + total);
		
		
		double[] darr = new double[5];
		int count = 0;
		
		darr[0] = 1.1; count++;
		darr[1] = 2.1; count++;
		darr[2] = 3.1; count++;
		
		//��Ұ� ���� 3,4 ��Ҵ� 0.0���� �ʱ�ȭ�Ǳ� ������ count������ ������ �����Ѵ�.
		double mtotal = 1;
		for(int i = 0; i < count; i++) {
			mtotal *= darr[i];
		}
		
		System.out.println(mtotal);

	}

}
