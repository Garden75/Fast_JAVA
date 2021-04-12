package staticTest;

public class CardCompany {
	
	//유일한 객체 인스턴스 생성
	private static CardCompany instance = new CardCompany();
	
	//기본 생성자
	private CardCompany() {}
	
	//카드회사는 유일한 객체임
	public static CardCompany getInstance() {
		
		if(instance == null) {
			instance = new CardCompany();
		}
		
		return instance;
	}
	
	//카드가 생성될 때
	public Card createCard() {
		
		Card card = new Card(); //레퍼런스
		
		return card;
	}

}
