package cooperation.coffee;

public class BeanCafe {

	int money;
	
	public String buyCoffee(int money) {
		
		this.money += money;
		if(money == Menu.BEANAMERICANO) {
			return "�� �ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�.";
		}
		else if(money == Menu.BEANLATTE) {
			return "�� �ٹ� �󶼸� �����߽��ϴ�.";
		}
		else {
			return null;
		}
	}
}
