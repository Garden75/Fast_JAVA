package stream.inputStream;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamTest2 {

	public static void main(String[] args) {
		
		System.out.println("�Է� �� '��'�� �Է��ϼ���! :");
		
		try {
//			//����1.
			//in�� ����Ʈ�� ������ ���� �����ϸ� -1�� ��ȯ�ϱ� ������ int ��
			int i;
//			while( (i = System.in.read()) != '\n') {
//				System.out.print((char)i);			
//			}
//			//����2.
//			while( (i = System.in.read()) != '��') { //'��'�� �Է��� �Ŀ��� ��� ���ư�
//				System.out.print((char)i);			
//			}
			//����3. ����Ʈ ������ ���� �� ���ڷ� ��ȯ���ִ� ���� ��Ʈ�� ���
			InputStreamReader isr = new InputStreamReader(System.in);
			while( (i = isr.read()) != '��') {
				System.out.print((char)i);			
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
