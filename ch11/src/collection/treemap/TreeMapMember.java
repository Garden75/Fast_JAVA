package collection.treemap;

import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapMember {
	
	private TreeMap<Integer, Member> treeMap;
	
	public TreeMapMember() {
		treeMap = new TreeMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		treeMap.put(member.getMemberId(), member);
	}
	 
	public boolean removeMember(int memberId) {
		
		if(treeMap.containsKey(memberId)) {
			treeMap.remove(memberId);
			return true;
		}
		
		System.out.println("존재하지 않는 회원입니다.");
		return false;
	}
	
	public void showAllMember() {
		
		Iterator<Integer> ir = treeMap.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = treeMap.get(key);
			System.out.println(member);
		}
		
		System.out.println();
	}

}
