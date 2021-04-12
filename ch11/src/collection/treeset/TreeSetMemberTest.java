package collection.treeset;

public class TreeSetMemberTest {

	public static void main(String[] args) {
		
		TreeSetMember manager = new TreeSetMember();
		Member memberLee = new Member(100, "ÀÌ¼ø½Å");
		Member memberKim = new Member(200, "±èÀ¯½Å");
		Member memberPark = new Member(300, "¹ÚÇõ°Å¼¼");
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		
		manager.showAllMember();

	}

}
