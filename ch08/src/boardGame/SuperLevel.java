package boardGame;

public class SuperLevel extends PlayerLevel{
	
	@Override
	public void run() {
		System.out.println("��û ���� �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("���� ���� jump �մϴ�.");
		
	}

	@Override
	public void turn() {
		System.out.println("turn �մϴ�.");
		
	}

	@Override
	public void showLevelMessages() {
		System.out.println("***** ����� �����Դϴ�. *****");
		
	}

}
