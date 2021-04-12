package lambda;

interface PrintString {
	void showString(String str);
}

//�Լ��� ���α׷����� ������ ���ٽ��� ��ü������ �ڹٰ� ����� �� �ִ� ������ 
//���� ���α׷����� �Լ����� ����ϴ� �������� ���ư�.. ���� �ʿ䰡 �ִ�.
public class TestLambda {

	public static void main(String[] args) {
		
		//1.����ó�� �����Ͽ� ���
		PrintString lambdaStr = s->System.out.println(s);;
		lambdaStr.showString("Test");
		
		//2.�Ű������� ���
		showMyString(lambdaStr);
		
		//3.return ��ȯ������ ���
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
