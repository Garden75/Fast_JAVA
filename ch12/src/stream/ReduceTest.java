package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {
		if(s1.getBytes().length > s2.getBytes().length) {
			return s1;
		} else { 
			return s2;
		}
	}
}

public class ReduceTest {

	public static void main(String[] args) {
		
		String[] greetings = {"안녕하세요 ~~~", "hello", "Good Morning", "반갑습니다"};
		
		//방법1. String 배열에서 가장 긴 바이트를 가진 요소 출력
		String result = Arrays.stream(greetings).reduce("", (s1, s2) -> 
			{ if(s1.getBytes().length > s2.getBytes().length) return s1;
			  else return s2; });
		System.out.println(result);
		
		//방법2. BinaryOperator 객체 이용
		String result2 = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(result2);
	}

}
