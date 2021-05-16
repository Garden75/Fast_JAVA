package coffee;

public class CoffeeTest {

	public static void main(String[] args) {
		
		Coffee kenyaCoffee = new KenyaAmericano();
		kenyaCoffee.brewing();
		System.out.println();
		
		Coffee kenyaLatte = new Latte(new KenyaAmericano());
		kenyaLatte.brewing();
		System.out.println();
		
		Coffee kenyaMoca = new Moca(new Latte(new KenyaAmericano()));
		kenyaMoca.brewing();
		System.out.println();
		
		Coffee kenyaWhippingCreamMoca = new WhippingCream(new Moca(new Latte(new KenyaAmericano())));
		kenyaWhippingCreamMoca.brewing();
		System.out.println();
		
		Coffee etiopiaCoffee = new EtiopiaAmericano();
		etiopiaCoffee.brewing();
		System.out.println();
		
		Coffee etiopiaMoca = new Moca(new Latte(new EtiopiaAmericano()));
		etiopiaMoca.brewing();
	}

}
