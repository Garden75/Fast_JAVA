package stream.inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(FileInputStream fis = new FileInputStream("input2.txt")){ //try 안에 선언가, 이때 finally 구문 필요없음
			int j;
			byte[] bs = new byte[10];
			while((j = fis.read(bs)) != -1) {
//				for(byte b : bs) {
//					System.out.print((char)b); //가비지컬렉터에 남은 바이트가 빈 공간에 같이 찍혀나옴			
//				}
				
				for(int k=0; k<j ; k++) {
					System.out.print((char)bs[k]);
				}
				System.out.println();
			}
			
		} catch (IOException e) { //FileNotFoundException를 포함한 상위 exception
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
