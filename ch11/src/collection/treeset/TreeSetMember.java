package collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetMember {

	private TreeSet<Member> treeSet;
	
	public TreeSetMember() {
		treeSet = new TreeSet<Member>(new Member()); //Comparator�� ������ ��ü�� �Ű������� �����ؾ� ��
	}
	
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
	
		Iterator<Member> ir = treeSet.iterator();
		while(ir.hasNext()) { //���� ���� ������
			Member member = ir.next();
			if(member.getMemberId() == memberId) {
				treeSet.remove(member);
				return true;
			}
		}
		
		System.out.println("�ش� " + memberId + "��ȣ�� ��ȸ���� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : treeSet) {
			System.out.println(member); 
		}
		System.out.println();
	}
	
}
