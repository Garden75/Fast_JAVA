package stream.inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(FileInputStream fis = new FileInputStream("input2.txt")){ //try �ȿ� ����, �̶� finally ���� �ʿ����
			int j;
			byte[] bs = new byte[10];
			while((j = fis.read(bs)) != -1) {
//				for(byte b : bs) {
//					System.out.print((char)b); //�������÷��Ϳ� ���� ����Ʈ�� �� ������ ���� ��������			
//				}
				
				for(int k=0; k<j ; k++) {
					System.out.print((char)bs[k]);
				}
				System.out.println();
			}
			
		} catch (IOException e) { //FileNotFoundException�� ������ ���� exception
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
