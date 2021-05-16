package exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		
		//방법1. try-with-resource 문
//		try(AutoCloseObj obj = new AutoCloseObj()) {
//			
//		} catch(Exception e) {
//			System.out.println(e);
//			System.out.println("예외부분입니다.");
//		}
//		System.out.println("프로그램 종료");'
		
		//방법2. 다른 참조변수로 다시 선언(자바 9이전)
		AutoCloseObj obj = new AutoCloseObj();
		
		try(AutoCloseable obj2 = obj) {
			
		} catch(Exception e) {
			System.out.println(e);
			System.out.println("예외부분입니다.");
		}
		System.out.println("프로그램 종료");
		
		//방법3. 외부에서 선언한 변수를 그래도 사용
//		try(obj) {
//			throw new Exception(); //강제 예외 발생 구문
//		} catch(Exception e) {
//			System.out.println(e);
//			System.out.println("예외부분입니다.");
//		}
//		System.out.println("프로그램 종료");
		
	}

}
