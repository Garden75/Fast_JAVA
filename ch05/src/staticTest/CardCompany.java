package staticTest;

public class CardCompany {
	
	//������ ��ü �ν��Ͻ� ����
	private static CardCompany instance = new CardCompany();
	
	//�⺻ ������
	private CardCompany() {}
	
	//ī��ȸ��� ������ ��ü��
	public static CardCompany getInstance() {
		
		if(instance == null) {
			instance = new CardCompany();
		}
		
		return instance;
	}
	
	//ī�尡 ������ ��
	public Card createCard() {
		
		Card card = new Card(); //���۷���
		
		return card;
	}

}
