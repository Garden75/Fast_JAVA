package chapter2;

public class ImplicitConversion {

	public static void main(String[] args) {
		byte bNum = 10;
		int iNum = bNum; //byte형이 int형으로 대입됨
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println(iNum2);
		System.out.println(fNum);
		
		int iNum3 = 20;
		float fNum2 = iNum3;
		double dNum;
		dNum = fNum2 + iNum3; //fNum2 + iNum3가 float형임 dNum은 double형이므로 더 정밀한 자료형으로 변환됨
		
		System.out.println(dNum);

	}

}
