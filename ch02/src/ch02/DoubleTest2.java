package ch02;

public class DoubleTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 중복되는 연산의 경우
		
		double dNum = 1;
		
		//부동 소수점 오류
		for(int i = 0; i < 10000; i++) {
			
			dNum = dNum + 0.1;
			//1001이 아닌 1001.000000000159이 결과로 나옴
			//약간의 오차가 발생하지만 더 많은 범위의 실수를 표현하기 위해 부동소수점 방식을 사용
		}
		System.out.println(dNum);
	}

}
