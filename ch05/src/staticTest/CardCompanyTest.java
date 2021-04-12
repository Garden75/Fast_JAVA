package staticTest;

public class CardCompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//½Ì±ÛÅæÆĞÅÏ
		CardCompany cardCompany = CardCompany.getInstance();
		
		Card myCard = cardCompany.createCard();
		Card subCard = cardCompany.createCard();
		
		System.out.println(myCard.getCardNumber());
		System.out.println(subCard.getCardNumber());
	}

}
