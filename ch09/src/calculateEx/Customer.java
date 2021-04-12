package calculateEx;

public class Customer implements Buy, Sell{

	@Override
	public void sell() {
		System.out.println("Customer Sell");
	}

	@Override
	public void buy() {
		System.out.println("Customer Buy");
	}

	@Override
	public void order() {
		//Buy.super.order();
		
		System.out.println("Customer order"); //¿Á¡§¿«
	}
	
	public void sayHello() {
		System.out.println("Hello");
	}

}
