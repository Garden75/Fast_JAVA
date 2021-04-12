package collection.hashmap;

public class HashMapMemberTest {

	public static void main(String[] args) {
		
		HashMapMember manager = new HashMapMember();
		Member memberLee = new Member(100, "이순신");
		Member memberKim = new Member(200, "김유신");
		Member memberPark = new Member(300, "박혁거세");
		Member memberPark2 = new Member(300, "박혁거세"); //중복값 발생
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		manager.addMember(memberPark2);
		
		manager.showAllMember();
		
		manager.removeMember(200);
		
		manager.showAllMember();
		

	}

}
