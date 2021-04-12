package cooperation.coffee;

public class BeanCafe {

	int money;
	
	public String buyCoffee(int money) {
		
		this.money += money;
		if(money == Menu.BEANAMERICANO) {
			return "콩 다방 아메리카노를 구입했습니다.";
		}
		else if(money == Menu.BEANLATTE) {
			return "콩 다방 라떼를 구입했습니다.";
		}
		else {
			return null;
		}
	}
}
