package ch02;

public class ExplicitConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1000;
		byte bNum = (byte)i; //4바이트가 1바이트로 넣음, 데이터의 유실이 발생할 수 있음
		
		System.out.println(bNum); //값이 잘려서 음수의 값이 나옴
		
		double dNum = 1.2;
		float fNum = 0.9F;
		
		//명시적 형 변환 필요
		int iNum1 = (int)dNum + (int)fNum; //truncate됨 1 + 0 = 1
		int iNum2 = (int)(dNum + fNum); // 1.2 + 0.9 = 2
		
		System.out.println(iNum1);
		System.out.println(iNum2);
	}

}
