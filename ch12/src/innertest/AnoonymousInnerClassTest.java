package innertest;

class Outer2 {

	int outNum = 100;
	static int sNum = 200;

	Runnable getRunnable(final int i) {

		final int num = 100;
		//매개변수로 넘어오거나 내부 지역변수로 선언된 변수는 모두 상수화됨
		
		//익명클래스
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
			//단하나의 인터페이스나 추상클래스는 바로 생성할 수 있음 --> 익명내부클래스
			//주로 안드로이드 위젯 핸들러들을 익명내부클래스로 생성함

			@Override
			public void run() {
				System.out.println("test");
			}
			
		};

		/* class이름이 있는 경우 
		 * class MyRunnable implements Runnable {
		 * 
		 * @Override public void run() {
		 * 
		 * num += 10; i += 100; 지역변수로 선언되어 getRunnable()이 실행되면 값이 사라짐 그렇기 때문에 변수는 final
		 * 상수로 선언된다.(생략가능) --> 상수화
		 * 
		 * System.out.println(num); System.out.println(i); System.out.println(outNum);
		 * System.out.println(Outer.sNum); //Outer객체의 sNum }
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
