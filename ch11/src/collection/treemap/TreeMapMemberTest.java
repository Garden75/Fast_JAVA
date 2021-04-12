package collection.treemap;

public class TreeMapMemberTest {

	public static void main(String[] args) {
		
		TreeMapMember manager = new TreeMapMember();
		Member memberKim = new Member(200, "김유신");
		Member memberPark = new Member(300, "박혁거세");
		Member memberLee = new Member(100, "이순신");
		Member memberPark2 = new Member(400, "박혁거세"); //중복값 발생
		
		manager.addMember(memberPark);
		manager.addMember(memberLee);
		manager.addMember(memberPark2);
		manager.addMember(memberKim);
		
		manager.showAllMember();
		
		manager.removeMember(200);
		
		manager.showAllMember();

	}

}
