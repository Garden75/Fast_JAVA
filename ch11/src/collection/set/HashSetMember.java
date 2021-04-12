package collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetMember {

	private HashSet<Member> hashSet;
	
	public HashSetMember() {
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
	
		Iterator<Member> ir = hashSet.iterator();
		while(ir.hasNext()) { //다음 값이 있으면
			Member member = ir.next();
			if(member.getMemberId() == memberId) {
				hashSet.remove(member);
				return true;
			}
		}
		
		System.out.println("해당 " + memberId + "번호가 조회되지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member); 
		}
		System.out.println();
	}
	
}
