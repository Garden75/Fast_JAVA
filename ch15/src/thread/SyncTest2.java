package thread;

class Bank2 { //여기에 lock이 걸려야 함
	
	private int money = 10000;
	
	public void saveMoney(int save) {
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
			
		int m = this.getMoney();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setMoney(m - minus);
			
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

}
// run()에 synchronized 하면 thread에 걸리기 때문에 아무 의미가 없고,
// 실제 수행되는 run()메소드 안에 실행 코드를 동기화 하면 된다.
// SyncTest2.myBank : 공유자원

class ParkWife extends Thread {
	public void run() {
		synchronized (SyncTest2.myBank) {
			System.out.println("start save");
			SyncTest2.myBank.saveMoney(5000);
			System.out.println("save money : " + SyncTest2.myBank.getMoney());	
		}
	}
}

class ParkDougher extends Thread {
	public void run() {
		synchronized (SyncTest2.myBank) {
			System.out.println("start minus");
			SyncTest2.myBank.minusMoney(1000);
			System.out.println("minus money : " + SyncTest2.myBank.getMoney());
		}
	}
}

public class SyncTest2 {
	
	public static Bank2 myBank = new Bank2(); //shared resource 공유자원은 Bank임

	public static void main(String[] args) throws InterruptedException {
		
		ParkWife pw = new ParkWife();
		pw.start();
		
		Thread.sleep(300);
		
		ParkDougher pd = new ParkDougher();
		pd.start();
	}

}
