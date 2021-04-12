package collection;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		System.out.println(myList);
		myList.add(1, "D");
		System.out.println(myList);
		myList.removeLast();
		System.out.println(myList);
		
		for(int i = 0; i < myList.size(); i++) {
			String s = myList.get(i); 
			//순서가 있고 중복이 있는 경우 get()메서드 사용가능 -List 순회방법
			//순서가 없고 중복이 없는 경우는 set()메서드 사용가능
			System.out.println(s);
		}
	}

}
