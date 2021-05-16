package thread;

class Bank { //여기에 lock이 걸려야 함
	
	private int money = 10000;
	
	public synchronized void saveMoney(int save) { //1. synchronized 메서드 방식
		int m = this.getMoney();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setMoney(m + save);
	}
	
	public void minusMoney(int minus) {
		
		synchronized (this) { //2. synchronized 블럭방식
			
			int m = this.getMoney();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			setMoney(m - minus);
			
		}
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

}

class Park extends Thread {
	public void run() {
		System.out.println("start save");
		SyncTest.myBank.saveMoney(8000);
		System.out.println("save money : " + SyncTest.myBank.getMoney());
	}
}

class ParkSun extends Thread {
	public void run() {
		System.out.println("start minus");
		SyncTest.myBank.minusMoney(3000);
		System.out.println("minus money : " + SyncTest.myBank.getMoney());
	}
}

public class SyncTest {
	
	public static Bank myBank = new Bank(); //shared resource 공유자원은 Bank임

	public static void main(String[] args) throws InterruptedException {
		
		Park p = new Park();
		p.start();
		
		Thread.sleep(300);
		
		ParkSun ps = new ParkSun();
		ps.start();
	}

}
