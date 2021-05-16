package exception;

public class IDFormatTest {
	
	private String userId;

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) throws IDFormatException { //����ϴ� �ʿ��� ���� ó��
		
		if(userId == null) {
			throw new IDFormatException("���̵�� null�� �� �����ϴ�.");
		} else if(userId.length() < 8 || userId.length() > 20) {
			throw new IDFormatException("���̵�� 8�ڸ� �̻� 20�� ���Ͽ��� �մϴ�.");
		}
		this.userId = userId;
	}

	public static void main(String[] args) {
		
		IDFormatTest idTest = new IDFormatTest();
		
		String myID = null;
		
		try {
			idTest.setUserId(myID);
		} catch (IDFormatException e) {
			//e.printStackTrace();
			System.out.println(e);
		}
		
		myID = "JAVA12";
		
		try {
			idTest.setUserId(myID);
		} catch (IDFormatException e) {
			//e.printStackTrace();
			System.out.println(e);
		}
		
	}

}
