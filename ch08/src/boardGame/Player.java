package boardGame;

public class Player {
	
	PlayerLevel level; //PlayerLevel을 포함관계에 있는 3가지 레벨을 사용할 수 있다.
	
	//기본 생성자
	public Player() {
		level = new BeginnerLevel(); //초급자레벨부터 시작
		level.showLevelMessages();
	}
	
	//레벨가져오기
	public PlayerLevel getLevel() {
		return level;
	}
	
	//레벨업
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessages();
	}
	
	//게임 시작
	public void play(int count) {
		level.go(count);
	}

}
