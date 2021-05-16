package stream.inputStream;

import java.io.IOException;

public class InputStreamTest {

	public static void main(String[] args) {
		
		System.out.println("입력 :");
		
		try {
			//in은 바이트로 받지만 끝이 도달하면 -1를 반환하기 때문에 int 형
			int i = System.in.read();
			System.out.println(i);
			System.out.println((char)i);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
