package innertest;

class OutClass {
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass {
		
		int iNum = 100;
		
		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
		}
		
	}
	
	public void usingInner() {
		inClass.inTest();
	}
	
	static class InStaticClass {
		int inNum = 100;
		static int sinNum = 200;
		
		void inTest() {
			System.out.println(inNum);
			System.out.println(sinNum);
			System.out.println(sNum);
		}
		
		static void sTest() {
			//System.out.println(inNum); InStaticClass클래스가 생성된 이후에 부를 수 있는 변수이기 때문에 사용불가
			System.out.println(sinNum);
			System.out.println(sNum);
		}
		
	}
}


public class InnerTest {

	public static void main(String[] args) {
		
		OutClass outClass = new OutClass();
		outClass.usingInner(); //10 20
		
		System.out.println();
		
		OutClass.InClass myInClass = outClass.new InClass();
		myInClass.inTest(); //10 20
		
		System.out.println();
		
		OutClass.InStaticClass sinClass = new OutClass.InStaticClass();
		sinClass.inTest(); //100 200 20
		OutClass.InStaticClass.sTest(); //200 20
		
	}

}
