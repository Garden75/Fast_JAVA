package stream.others;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		
		RandomAccessFile raf = new RandomAccessFile("random.txt", "rw");
	
		raf.writeInt(100);
		System.out.println(raf.getFilePointer());
		raf.writeDouble(3.145);
		raf.writeUTF("�ݰ����ϴ�.");
		
		//java.io.EOFException ���� �߻� -> �ش� �������� �ּҸ� ã�� ���Ͽ��� ����
		//ó�� �ּҷ� ���ư��� ����ؾ� �ϱ� ������ seek()�� �̿��Ͽ� �ּҸ� ó������ ������ ��
		raf.seek(0);
		int i = raf.readInt();
		double d = raf.readDouble();
		String str = raf.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
		
		raf.close();
		
	}

}
