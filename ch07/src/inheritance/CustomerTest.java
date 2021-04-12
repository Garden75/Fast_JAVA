package inheritance;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Customer customerLee = new Customer();
		customerLee.setCustomerName("¿Ãº¯Ω≈");
		customerLee.setCustomerID(10010);
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		*/
		
		/*
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerName("±Ë¿ØΩ≈");
		customerKim.setCustomerID(10020);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		*/
		
		VIPCustomer customerKim = new VIPCustomer(10020, "±Ë¿ØΩ≈");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
	}

}
