package array;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Arraylist ��ü ���� �� <>���׸��Լ��� � Ÿ���� ��Ҹ� ������ �����Ѵ�.
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("aaa");
		arr.add("bbb");
		arr.add("ccc");
		
		for(int i =0; i<arr.size(); i++) {
			String s = arr.get(i);
			System.out.println(s);
		}
		
		//���� for�� ���
		for(String s : arr) {
			System.out.println(s);
		}

		System.out.println("============================");
		
		//2. ���׸��Լ��� ������� �ʰ� Arraylist�� �����Ѵٸ�,
		ArrayList arr2 = new ArrayList();
		
		arr2.add("ddd");
		arr2.add("eee");
		arr2.add("fff");
		
		for(int i =0; i<arr2.size(); i++) {
			String s = (String)arr2.get(i); //Ÿ�Կ� ���� ����ȯ�� �ʿ��ϴ�
			System.out.println(s);
		}
		
		//���� for�� ���(ó������ ������ �����Ϸ���)
		for(Object s : arr2) { //Ŭ������ �ֻ����� ObjectŸ������ �޾ƾ� �Ѵ�.
			System.out.println(s);
		}

	}

}
