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
		return memberName + "회원님의 아이디는 " + memberId + "입니다.";
	}

	@Override
	public int hashCode() { //중복값이 있을 때 논리적인 유일 값 비교를 위한 재정의
		return memberId;
	}

	@Override
	public boolean equals(Object obj) { //중복값이 있을 때 논리적인 유일 값 비교를 위한 재정의
		
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return (this.memberId == member.memberId);
		}
		
		return false;
	}

//	@Override
//	public int compareTo(Member member) {
//		
//		//return (this.memberId - member.memberId); //memberId 기준 오름차순(양수인경우)
//		return this.memberName.compareTo(member.getMemberName()); //memberName 기준 오름차순
//	}

	@Override
	public int compare(Member member1, Member member2) { //member1이 this의 변수, member2가 매개변수
		
		return (member1.memberId - member2.memberId);
	}
	
	
}
