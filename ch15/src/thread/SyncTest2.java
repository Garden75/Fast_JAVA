package thread;

class Bank2 { //���⿡ lock�� �ɷ��� ��
	
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
// run()�� synchronized �ϸ� thread�� �ɸ��� ������ �ƹ� �ǹ̰� ����,
// ���� ����Ǵ� run()�޼ҵ� �ȿ� ���� �ڵ带 ����ȭ �ϸ� �ȴ�.
// SyncTest2.myBank : �����ڿ�

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
	
	public static Bank2 myBank = new Bank2(); //shared resource �����ڿ��� Bank��

	public static void main(String[] args) throws InterruptedException {
		
		ParkWife pw = new ParkWife();
		pw.start();
		
		Thread.sleep(300);
		
		ParkDougher pd = new ParkDougher();
		pd.start();
	}

}
