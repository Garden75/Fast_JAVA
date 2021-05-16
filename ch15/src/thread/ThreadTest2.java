package thread;

class MyThread2 implements Runnable {
	
	public void run() {
		int i;
		for(i=0; i<=200; i++) {
			
			System.out.print(i + "\t");
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}

public class ThreadTest2 {

	public static void main(String[] args) {
		
		System.out.println("start main");
//		MyThread2 runner1 = new MyThread2();
//		Thread t1 = new Thread(runner1);
//		t1.start();
//		
//		MyThread2 runner2 = new MyThread2();
//		Thread t2 = new Thread(runner2);
//		t2.start();
		
		//Thread 상태 확인
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		System.out.println("end main");
	}

}
