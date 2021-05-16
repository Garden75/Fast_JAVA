package exception;

public class ArrayExceptionTest {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		try {
			for(int i = 0; i <= 5; i++) {
				System.out.println(arr[i]); // java.lang.ArrayIndexOutOfBoundsException: 5
			}			
		} catch (Exception e) {
			// TODO: handle exception
			//�� ���� ��� 0 5�� ��� ��, ����ó�� ����
			System.out.println(e); //java.lang.ArrayIndexOutOfBoundsException: 5
			System.out.println("����ó�� ����");
		}
		// ������ �ٿ���� ����(���� ó��)
		System.out.println("���α׷� ����");
	}

}
