package stream.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("writer.txt");
		
		fw.write('A');
		char[] buf = {'B', 'C', 'D', 'E', 'F'};
		
		fw.write(buf);
		fw.write("�� ������ FileWriter �׽�Ʈ�� ���� �뵵�Դϴ�.");
		fw.write(buf, 2, 3);
		
		fw.close();
		
		System.out.println("log: end");
		
	}

}
