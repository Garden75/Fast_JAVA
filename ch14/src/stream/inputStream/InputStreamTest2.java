package stream.inputStream;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamTest2 {

	public static void main(String[] args) {
		
		System.out.println("입력 후 '끝'을 입력하세요! :");
		
		try {
//			//예시1.
			//in은 바이트로 받지만 끝이 도달하면 -1를 반환하기 때문에 int 형
			int i;
//			while( (i = System.in.read()) != '\n') {
//				System.out.print((char)i);			
//			}
//			//예시2.
//			while( (i = System.in.read()) != '끝') { //'끝'을 입력한 후에도 계속 돌아감
//				System.out.print((char)i);			
//			}
			//예시3. 바이트 단위로 읽을 때 문자로 변환해주는 보조 스트림 사용
			InputStreamReader isr = new InputStreamReader(System.in);
			while( (i = isr.read()) != '끝') {
				System.out.print((char)i);			
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
