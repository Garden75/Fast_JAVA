package staticTest;

public class Card {
	
	public int cardNumber;
	private static int serialNum = 10000;//��� �����ϴ� ��
	
	//ī�尡 ���������
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
