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
		raf.writeUTF("반갑습니다.");
		
		//java.io.EOFException 에러 발생 -> 해당 포인터의 주소를 찾지 못하였기 때문
		//처음 주소로 돌아가서 출력해야 하기 때문에 seek()를 이용하여 주소를 처음으로 돌려야 함
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
