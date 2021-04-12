package collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		
		return s1.compareTo(s2) * (-1); //내림차순으로 정렬
	}

}

public class ComparatorTest {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<String>(new MyCompare());
		set.add("이순신");
		set.add("강감찬");
		set.add("김유신");
		
		System.out.println(set); //중복 허용x, 정해진 순서없음
		
		for(String str : set) {
			System.out.println(str);
		}
		
	}

}
