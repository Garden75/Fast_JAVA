package collection.hashmap;

public class HashMapMemberTest {

	public static void main(String[] args) {
		
		HashMapMember manager = new HashMapMember();
		Member memberLee = new Member(100, "�̼���");
		Member memberKim = new Member(200, "������");
		Member memberPark = new Member(300, "�����ż�");
		Member memberPark2 = new Member(300, "�����ż�"); //�ߺ��� �߻�
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		manager.addMember(memberPark2);
		
		manager.showAllMember();
		
		manager.removeMember(200);
		
		manager.showAllMember();
		

	}

}
