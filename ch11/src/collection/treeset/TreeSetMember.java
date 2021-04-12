package collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetMember {

	private TreeSet<Member> treeSet;
	
	public TreeSetMember() {
		treeSet = new TreeSet<Member>(new Member()); //Comparator가 구현된 객체를 매개변수로 전달해야 함
	}
	
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
	
		Iterator<Member> ir = treeSet.iterator();
		while(ir.hasNext()) { //다음 값이 있으면
			Member member = ir.next();
			if(member.getMemberId() == memberId) {
				treeSet.remove(member);
				return true;
			}
		}
		
		System.out.println("해당 " + memberId + "번호가 조회되지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : treeSet) {
			System.out.println(member); 
		}
		System.out.println();
	}
	
}
