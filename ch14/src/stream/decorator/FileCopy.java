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
			BufferedOutputStream bos = new BufferedOutputStream(fos); ){ //자동 스트림 close(), finally 선언문 x
			
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
		
		//상속으로 사용하면 hierarchical key가 매우 복잡해짐 ==> 부가적인 기능 제공을 위한 구조가 데코레이션 패턴
		//BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream())); //기능추가 == 데코레이터패턴
		//br.readLine();
		
		System.out.println("시간 : " + milliseconds ); //586
	}

}
