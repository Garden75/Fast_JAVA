package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		
		List<String> array = new ArrayList<String>();
		array.add("Tomas");
		array.add("Edward");
		array.add("Jack");
		
		//�̸� ���
		Stream<String> stream = array.stream();
		stream.forEach(s -> System.out.print(s + " "));
		
		System.out.println();
		
		//�̸� ���� �� ���
		//���⼭ sorted()�� String Comparable�� �����Ǿ� �־� ���� ������
		//���� Comparable�� ���ٸ� ������ ��
		array.stream().sorted().forEach(s -> System.out.print(s + " "));
		
		System.out.println();
		
		//length ���
		array.stream().map(s -> s.length()).forEach(n -> System.out.print(n + " "));
		
	}

}
