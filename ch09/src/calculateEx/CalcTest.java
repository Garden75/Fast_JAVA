package calculateEx;

public class CalcTest {

	public static void main(String[] args) {
		
		Calc calc = new CompleteCalc();
		int n1 = 10;
		int n2 = 2;
		
		//Calc로 선언되어도 인터페이스에 있는 메서드이기 때문에 사용가능하다.
		System.out.println(calc.add(n1, n2));
		System.out.println(calc.substract(n1, n2));
		System.out.println(calc.times(n1, n2));
		System.out.println(calc.divide(n1, n2));
		
		//calc.showInfo(); //CompleteCalc타입으로 선언되었기 떄문에 해당 메서드를 사용할 수 있다.
		
		calc.description(); //항상 new된 인스턴스를 부르기 때문에 재정의된 description이 호출된다.
		
		// static 메서드 사용(인스턴스 생성하지 않고 사용할 수 있다.)
		int[] arr = {1,2,3,4,5};
		int sum = Calc.total(arr);
		System.out.println(sum);
	}

}
