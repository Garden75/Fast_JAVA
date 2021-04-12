package boardGame;

public class Player {
	
	PlayerLevel level; //PlayerLevel�� ���԰��迡 �ִ� 3���� ������ ����� �� �ִ�.
	
	//�⺻ ������
	public Player() {
		level = new BeginnerLevel(); //�ʱ��ڷ������� ����
		level.showLevelMessages();
	}
	
	//������������
	public PlayerLevel getLevel() {
		return level;
	}
	
	//������
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessages();
	}
	
	//���� ����
	public void play(int count) {
		level.go(count);
	}

}
