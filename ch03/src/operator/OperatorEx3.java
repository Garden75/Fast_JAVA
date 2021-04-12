package operator;

public class OperatorEx3 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		
		//boolean value = ((num1 += 10) < 10) && ((i += 2) < 10);
		//boolean value2 = ((num1 += 10) < 10) || ((i += 2) < 10);
		//boolean value3 = ((num1 += 10) > 10) || ((i += 2) < 10);
		boolean value4 = ((num1 += 10) > 10) && ((i += 2) < 10);
		
		System.out.println(num1);
		System.out.println(i); // value에서 계산되지 않은 이유는 num1의 항이 이미 false의 값이 예상되었기 때문에 평가되지 않음
							   // value3에서 이미 num1의 항이 true이기 때문에 뒤에 항은 계산이 되지 않음
		System.out.println(value4);
		
		
	}
}
