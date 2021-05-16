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
			//위 연산 결과 0 5개 출력 후, 예외처리 수행
			System.out.println(e); //java.lang.ArrayIndexOutOfBoundsException: 5
			System.out.println("예외처리 수행");
		}
		// 서버가 다운되지 않음(예외 처리)
		System.out.println("프로그램 종료");
	}

}
