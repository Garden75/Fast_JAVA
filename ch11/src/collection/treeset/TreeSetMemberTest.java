package collection.treeset;

public class TreeSetMemberTest {

	public static void main(String[] args) {
		
		TreeSetMember manager = new TreeSetMember();
		Member memberLee = new Member(100, "�̼���");
		Member memberKim = new Member(200, "������");
		Member memberPark = new Member(300, "�����ż�");
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		
		manager.showAllMember();

	}

}
