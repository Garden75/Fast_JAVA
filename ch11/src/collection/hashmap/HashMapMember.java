package collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapMember { //Comparable 또는 Comparator를 상속하지 않아도 중복값 제거가능(이미 Integer에 구현된 인터페이스)-> equals()
	
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
		
		System.out.println("존재하지 않는 회원입니다.");
		return false;
	}
	
	public void showAllMember() {
		
		Iterator<Integer> ir = hashMap.keySet().iterator(); //key를 기준으로 모든 요소 출력
		//hashMap.values().iterator(); //value를 기준으로 모든 요소 출력
		// 동시에 모든 key,value 요소를 출력할 수 없다.
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = hashMap.get(key); //key값에 해당하는  member 정보를 가져옴
			System.out.println(member);
		}
		System.out.println();
		
	}

}
