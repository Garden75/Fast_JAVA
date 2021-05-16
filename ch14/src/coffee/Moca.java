package coffee;

public class Moca extends Decorator{

	public Moca(Coffee coffee) {
		super(coffee);
	}
	
	@Override
	public void brewing() {
		super.brewing();
		System.out.print("Adding Moca Syrup ");
	}

}
