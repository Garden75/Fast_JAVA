package innertest;

class Outer {
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(final int i) {
		
		final int num = 100;
		
		class MyRunnable implements Runnable {

			@Override
			public void run() {
				/*
				 * num += 10; i += 100; 
				 * 지역변수로 선언되어 getRunnable()이 실행되면 값이 사라짐
				 * 그렇기 때문에 변수는 final 상수로 선언된다.(생략가능) --> 상수화
				 */
				System.out.println(num);
				System.out.println(i);
				System.out.println(outNum);
				System.out.println(Outer.sNum); //Outer객체의 sNum
			}
			
		}
		return new MyRunnable();
	}
}

public class LocalInnerClassTest {

	public static void main(String[] args) {
		Outer outer = new Outer();
		Runnable runnable = outer.getRunnable(50);
		runnable.run();
	}

}
