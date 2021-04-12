package collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapMember { //Comparable �Ǵ� Comparator�� ������� �ʾƵ� �ߺ��� ���Ű���(�̹� Integer�� ������ �������̽�)-> equals()
	
	private HashMap<Integer, Member> hashMap;
	
	public HashMapMember() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		
		hashMap.put(member.getMemberId(), member);
		
	}
	
	public boolean removeMember(int memberId) {
		
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		
		System.out.println("�������� �ʴ� ȸ���Դϴ�.");
		return false;
	}
	
	public void showAllMember() {
		
		Iterator<Integer> ir = hashMap.keySet().iterator(); //key�� �������� ��� ��� ���
		//hashMap.values().iterator(); //value�� �������� ��� ��� ���
		// ���ÿ� ��� key,value ��Ҹ� ����� �� ����.
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = hashMap.get(key); //key���� �ش��ϴ�  member ������ ������
			System.out.println(member);
		}
		System.out.println();
		
	}

}
