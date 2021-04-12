package lambda;

interface PrintString {
	void showString(String str);
}

//함수형 프로그래밍이 가능한 람다식을 객체지향인 자바가 사용할 수 있는 이유는 
//점차 프로그래밍이 함수형을 사용하는 방향으로 나아감.. 익힐 필요가 있다.
public class TestLambda {

	public static void main(String[] args) {
		
		//1.변수처럼 선언하여 사용
		PrintString lambdaStr = s->System.out.println(s);;
		lambdaStr.showString("Test");
		
		//2.매개변수로 사용
		showMyString(lambdaStr);
		
		//3.return 반환값으로 사용
		PrintString pStr = returnString();
		pStr.showString("Test3");
	}
	
	public static void showMyString(PrintString p) {
		System.out.println("Test2");
	}

	public static PrintString returnString() {
		return s->System.out.println(s + "!!!!!");
	}
}
