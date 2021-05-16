package stream.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
//import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.InputStreamReader;
import java.net.Socket;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		
		long milliseconds = 0;
		
		try (
			FileInputStream fis = new FileInputStream("a.zip");
			FileOutputStream fos = new FileOutputStream("copy2.zip");
			
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos); ){ //�ڵ� ��Ʈ�� close(), finally ���� x
			
			milliseconds = System.currentTimeMillis();
			
			int i;
			while( (i = bis.read()) != -1 ) {
				bos.write(i);
			}
			
			milliseconds = System.currentTimeMillis() - milliseconds;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Socket socket = new Socket();
		
		//������� ����ϸ� hierarchical key�� �ſ� �������� ==> �ΰ����� ��� ������ ���� ������ ���ڷ��̼� ����
		//BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream())); //����߰� == ���ڷ���������
		//br.readLine();
		
		System.out.println("�ð� : " + milliseconds ); //586
	}

}
