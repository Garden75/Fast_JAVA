package exception;

public class IDFormatTest {
	
	private String userId;

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) throws IDFormatException { //사용하는 쪽에서 예외 처리
		
		if(userId == null) {
			throw new IDFormatException("아이디는 null일 수 없습니다.");
		} else if(userId.length() < 8 || userId.length() > 20) {
			throw new IDFormatException("아이디는 8자리 이상 20자 이하여야 합니다.");
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
