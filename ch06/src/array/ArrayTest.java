package array;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 배열 생성 및 초기화 방법
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
		
		System.out.println("모든 요소의 합 : " + total);
		
		
		double[] darr = new double[5];
		int count = 0;
		
		darr[0] = 1.1; count++;
		darr[1] = 2.1; count++;
		darr[2] = 3.1; count++;
		
		//요소가 없는 3,4 요소는 0.0으로 초기화되기 때문에 count변수로 개수를 지정한다.
		double mtotal = 1;
		for(int i = 0; i < count; i++) {
			mtotal *= darr[i];
		}
		
		System.out.println(mtotal);

	}

}
