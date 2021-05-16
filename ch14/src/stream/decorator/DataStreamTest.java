package stream.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) {
		
		try (
			FileOutputStream fos = new FileOutputStream("data.txt");
				DataOutputStream dos = new DataOutputStream(fos);
				FileInputStream fis = new FileInputStream("data.txt");
				DataInputStream dis = new DataInputStream(fis)) {
			
			dos.write(100); //4byte int형
			dos.writeByte(100); //1byte 100이 들어감
			dos.writeChar('a');
			dos.writeUTF("이 파일은 DataInputStream과 DataOutputStream 테스트 파일입니다.");
			
			System.out.println(dis.read());
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
