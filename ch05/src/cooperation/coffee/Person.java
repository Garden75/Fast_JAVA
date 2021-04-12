package cooperation.coffee;

public class Person {
	
	String name;
	int money;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void buyStarCoffee(StarCafe starcafe, int money) {
		String message = starcafe.buyCoffee(money);
		if(message != null) {
			this.money -= money;
			System.out.println(name + "�� ���� ���� " + money + "�̸� " + message);
		}
	}
	
	public void buyBeanCoffe(BeanCafe beancafe, int money) {
		String message = beancafe.buyCoffee(money);
		if(message != null) {
			this.money -= money;
			System.out.println(name + "�� ���� ���� " + money + "�̸� " + message);
		}
	}

}
