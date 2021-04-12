package generic;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		Powder powder = new Powder();
		powderPrinter.setMaterial(powder);
		System.out.println(powderPrinter.toSring());
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		Plastic plastic = new Plastic();
		plasticPrinter.setMaterial(plastic);
		System.out.println(plasticPrinter.toSring());
		
		//GenericPrinter<Water> waterPrinter = new GenericPrinter<Water>(); //T 타입 제한
		
		powderPrinter.printing();
		plasticPrinter.printing();
		
		//GenericPrinter genericPrinter = new GenericPrinter(); //<>제너릭 타입이 없이 쓰여도 되지만 거의 타입을 지정하기 위해 제네릭을 사용함

	}

}
