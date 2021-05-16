package thread;

class MyThread extends Thread {
	
	public void run() {
		int i;
		for(i=0; i<=200; i++) {
			
			System.out.print(i + "\t");
			
			try {
				sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}

public class ThreadTest {

	public static void main(String[] args) {
		
		System.out.println("start main");
		MyThread mt1 = new MyThread();
		MyThread mt2 = new MyThread();
		
		mt1.start();
		mt2.start();
		System.out.println("end main");
		System.out.println("end");
	}

}
