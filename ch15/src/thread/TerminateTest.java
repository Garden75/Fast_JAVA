package thread;

import java.io.IOException;

public class TerminateTest extends Thread {

	private boolean flag = false;
	int i;

	public TerminateTest(String name) {
		super(name);
	}

	public void run() {

		while (!flag) {

			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println(getName() + " end");
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public static void main(String[] args) throws IOException {

		TerminateTest testA = new TerminateTest("A");
		TerminateTest testB = new TerminateTest("B");

		testA.start();
		testB.start();

		int in;
		while (true) {
			in = System.in.read();
			if (in == 'A') {
				testA.setFlag(true);
			} else if (in == 'B') {
				testB.setFlag(true);
			} else if (in == 'M') {
				testA.setFlag(true);
				testB.setFlag(true);
				break;
			} else {
				System.out.println("try again"); // \n(뉴라인) \r(캐리지리턴)에 걸리면서 두번 출력
			}
		}
		System.out.println("main end");
	}

}
