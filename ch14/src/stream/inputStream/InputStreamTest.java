package stream.inputStream;

import java.io.IOException;

public class InputStreamTest {

	public static void main(String[] args) {
		
		System.out.println("�Է� :");
		
		try {
			//in�� ����Ʈ�� ������ ���� �����ϸ� -1�� ��ȯ�ϱ� ������ int ��
			int i = System.in.read();
			System.out.println(i);
			System.out.println((char)i);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
