package ch02;

public class CharTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch = 'A';
		
		System.out.println(ch);
		System.out.println((int)ch); //Ÿ��ĳ����
		
		int iCh = 66;
		
		System.out.println(iCh); //���������� �������� ������ ����
		System.out.println((char)iCh);
		
		//char ch2 = -66; //�������� �� �� ����
		
		char hangul = '\uAC00'; //�����ڵ� �� ���
		
		System.out.println(hangul);
		
		char ch2 = '��';
		
		System.out.println(ch2);
	}

}
