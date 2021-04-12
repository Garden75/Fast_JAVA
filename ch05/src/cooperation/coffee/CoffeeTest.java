package cooperation.coffee;

public class CoffeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person kim = new Person("Kim", 10000);
		Person lee = new Person("Lee", 16000);
		
		StarCafe starcafe = new StarCafe();
		BeanCafe beancafe = new BeanCafe();
		
		kim.buyStarCoffee(starcafe, Menu.STARAMERICANO);
		lee.buyBeanCoffe(beancafe, Menu.BEANLATTE);
		
	}

}
