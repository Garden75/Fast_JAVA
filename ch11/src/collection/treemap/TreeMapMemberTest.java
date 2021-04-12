package collection.treemap;

public class TreeMapMemberTest {

	public static void main(String[] args) {
		
		TreeMapMember manager = new TreeMapMember();
		Member memberKim = new Member(200, "������");
		Member memberPark = new Member(300, "�����ż�");
		Member memberLee = new Member(100, "�̼���");
		Member memberPark2 = new Member(400, "�����ż�"); //�ߺ��� �߻�
		
		manager.addMember(memberPark);
		manager.addMember(memberLee);
		manager.addMember(memberPark2);
		manager.addMember(memberKim);
		
		manager.showAllMember();
		
		manager.removeMember(200);
		
		manager.showAllMember();

	}

}
