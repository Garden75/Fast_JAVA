package ch02;

public class DoubleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double dNum = 3.14; //자바 리터럴, 내부적으로 double타입으로 저장됨
		
		float fNum = 3.14F;
		//3,14가 double형이기 때문에 큰 바이트가 작은 바이트로 갈 수 없음
		//식별자 f 또는 F 사용해서 float함수로 변형
		
		System.out.println(dNum);
		System.out.println(fNum);
	}

}
