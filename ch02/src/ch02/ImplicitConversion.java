package ch02;

public class ImplicitConversion {
	
	public static void main(String[] args) {
		
		byte bNum = 10;
		int iNum = bNum; //묵시적 형 변환이 일어남, 작은 곳 에서 큰 곳으로 들어감
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2; //모든 정수가 실수로 형 변환될 수 있음
		
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum; //연산자 우선순위
		//정수 iNum이 float로 바뀌고 더해진 값이 double로 형 변환됨 
		
		System.out.println(dNum);
	}

}
