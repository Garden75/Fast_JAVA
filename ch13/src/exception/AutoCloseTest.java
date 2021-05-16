package exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		
		//���1. try-with-resource ��
//		try(AutoCloseObj obj = new AutoCloseObj()) {
//			
//		} catch(Exception e) {
//			System.out.println(e);
//			System.out.println("���ܺκ��Դϴ�.");
//		}
//		System.out.println("���α׷� ����");'
		
		//���2. �ٸ� ���������� �ٽ� ����(�ڹ� 9����)
		AutoCloseObj obj = new AutoCloseObj();
		
		try(AutoCloseable obj2 = obj) {
			
		} catch(Exception e) {
			System.out.println(e);
			System.out.println("���ܺκ��Դϴ�.");
		}
		System.out.println("���α׷� ����");
		
		//���3. �ܺο��� ������ ������ �׷��� ���
//		try(obj) {
//			throw new Exception(); //���� ���� �߻� ����
//		} catch(Exception e) {
//			System.out.println(e);
//			System.out.println("���ܺκ��Դϴ�.");
//		}
//		System.out.println("���α׷� ����");
		
	}

}
