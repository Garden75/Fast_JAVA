package collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<String>();
		set.add("�̼���");
		set.add("������");
		set.add("������");
		
		System.out.println(set); //�ߺ� ���x, ������ ��������
		
		for(String str : set) {
			System.out.println(str);
		}

	}

}
