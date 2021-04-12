package lambda;

@FunctionalInterface //람다식 인터페이스 선언, 하나의 메서드만 생성 가능(매개변수만으로 함수를 사용하기 때문)
public interface MyMaxNumber {
	int getMaxNumber(int x, int y);
}
