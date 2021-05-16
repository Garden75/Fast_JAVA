package stream.reader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderTest2 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fr = new FileInputStream("reader.txt");
		InputStreamReader isr = new InputStreamReader(fr);
		
		int i;
		while( (i = isr.read()) != -1) {
			System.out.print((char)i);
		}
		
		isr.close(); //보조 스트림을 닫으면 원래 스트림도 닫힌다.
	}

}
