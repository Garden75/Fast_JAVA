package boardGame;

public class BoardGameTest {

	public static void main(String[] args) {
		
		//플레이어 생성
		Player player = new Player();
		player.play(1);
		
		AdvancedLevel alevel = new AdvancedLevel();
		player.upgradeLevel(alevel);
		player.play(2);
		
		SuperLevel slevel = new SuperLevel();
		player.upgradeLevel(slevel);
		player.play(3);
		
	}

}
