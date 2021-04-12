package collection.set;

public class Member {

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
	
	
}
