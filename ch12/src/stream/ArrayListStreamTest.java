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
		
		//이름 출력
		Stream<String> stream = array.stream();
		stream.forEach(s -> System.out.print(s + " "));
		
		System.out.println();
		
		//이름 정렬 후 출력
		//여기서 sorted()는 String Comparable이 구현되어 있어 수행 가능함
		//만약 Comparable이 없다면 만들어야 함
		array.stream().sorted().forEach(s -> System.out.print(s + " "));
		
		System.out.println();
		
		//length 출력
		array.stream().map(s -> s.length()).forEach(n -> System.out.print(n + " "));
		
	}

}
