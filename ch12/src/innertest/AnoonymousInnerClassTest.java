package innertest;

class Outer2 {

	int outNum = 100;
	static int sNum = 200;

	Runnable getRunnable(final int i) {

		final int num = 100;
		//�Ű������� �Ѿ���ų� ���� ���������� ����� ������ ��� ���ȭ��
		
		//�͸�Ŭ����
		return new Runnable() {

			@Override
			public void run() {
				System.out.println(num);
				System.out.println(i);
				System.out.println(outNum);
				System.out.println(Outer.sNum);
			}	
		};
	}
		
		Runnable runner = new Runnable() {
			//���ϳ��� �������̽��� �߻�Ŭ������ �ٷ� ������ �� ���� --> �͸���Ŭ����
			//�ַ� �ȵ���̵� ���� �ڵ鷯���� �͸���Ŭ������ ������

			@Override
			public void run() {
				System.out.println("test");
			}
			
		};

		/* class�̸��� �ִ� ��� 
		 * class MyRunnable implements Runnable {
		 * 
		 * @Override public void run() {
		 * 
		 * num += 10; i += 100; ���������� ����Ǿ� getRunnable()�� ����Ǹ� ���� ����� �׷��� ������ ������ final
		 * ����� ����ȴ�.(��������) --> ���ȭ
		 * 
		 * System.out.println(num); System.out.println(i); System.out.println(outNum);
		 * System.out.println(Outer.sNum); //Outer��ü�� sNum }
		 * 
		 * } return new MyRunnable();
		 */
}

public class AnoonymousInnerClassTest {

	public static void main(String[] args) {
		Outer2 outer = new Outer2();
		outer.runner.run();
		
		Runnable runnable = outer.getRunnable(50);
		runnable.run();
	}

}
