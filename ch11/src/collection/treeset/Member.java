package collection.treeset;

import java.util.Comparator;

public class Member implements Comparator<Member>{ //Comparable<Member>

	private int memberId;
	private String memberName;
	
	public Member() {}
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String toString() {
		return memberName + "ȸ������ ���̵�� " + memberId + "�Դϴ�.";
	}

	@Override
	public int hashCode() { //�ߺ����� ���� �� �������� ���� �� �񱳸� ���� ������
		return memberId;
	}

	@Override
	public boolean equals(Object obj) { //�ߺ����� ���� �� �������� ���� �� �񱳸� ���� ������
		
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return (this.memberId == member.memberId);
		}
		
		return false;
	}

//	@Override
//	public int compareTo(Member member) {
//		
//		//return (this.memberId - member.memberId); //memberId ���� ��������(����ΰ��)
//		return this.memberName.compareTo(member.getMemberName()); //memberName ���� ��������
//	}

	@Override
	public int compare(Member member1, Member member2) { //member1�� this�� ����, member2�� �Ű�����
		
		return (member1.memberId - member2.memberId);
	}
	
	
}