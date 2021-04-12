package staticTest;

public class Card {
	
	public int cardNumber;
	private static int serialNum = 10000;//계속 증가하는 값
	
	//카드가 만들어지면
	public Card() {
		serialNum++;
		cardNumber = serialNum;
	}
	
	public int getCardNumber() {
		
		return cardNumber;
	}
	
	public void setCardNumber(int cardNumber) {
		
		this.cardNumber = cardNumber;
	}
	

}
