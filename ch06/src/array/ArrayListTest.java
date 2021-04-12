package array;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Arraylist 객체 선언 및 <>제네릭함수로 어떤 타입의 요소를 넣을지 선언한다.
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("aaa");
		arr.add("bbb");
		arr.add("ccc");
		
		for(int i =0; i<arr.size(); i++) {
			String s = arr.get(i);
			System.out.println(s);
		}
		
		//향상된 for문 사용
		for(String s : arr) {
			System.out.println(s);
		}

		System.out.println("============================");
		
		//2. 제네릭함수를 사용하지 않고 Arraylist를 선언한다면,
		ArrayList arr2 = new ArrayList();
		
		arr2.add("ddd");
		arr2.add("eee");
		arr2.add("fff");
		
		for(int i =0; i<arr2.size(); i++) {
			String s = (String)arr2.get(i); //타입에 대한 형변환이 필요하다
			System.out.println(s);
		}
		
		//향상된 for문 사용(처음부터 끝까지 실행하려면)
		for(Object s : arr2) { //클래스의 최상위인 Object타입으로 받아야 한다.
			System.out.println(s);
		}

	}

}
