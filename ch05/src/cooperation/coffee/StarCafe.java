package cooperation.coffee;

public class StarCafe {
	
	int money;
	
	public String buyCoffee(int money) {
		
		this.money += money;
		if(money == Menu.STARAMERICANO) {
			return "�� �ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�.";
			
		}
		else if(money == Menu.STARLATTE) {
			return "�� �ٹ� �󶼸� �����߽��ϴ�.";
			
		} else {
			return null;
		}
		
	}

}