package collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<String>();
		set.add("이순신");
		set.add("강감찬");
		set.add("김유신");
		
		System.out.println(set); //중복 허용x, 정해진 순서없음
		
		for(String str : set) {
			System.out.println(str);
		}

	}

}
