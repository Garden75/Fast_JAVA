package operator;

public class OperatorEx4 {

	public static void main(String[] args) {
		
		int score = 100;
		
		System.out.println(++score); //statement가 끝나기 전에 증가시킴
		System.out.println(score++); //statement가 끝난 후에 증가시킴
		System.out.println(score);
		System.out.println(--score);
		System.out.println(score--);
		System.out.println(score);
		
	}
}
