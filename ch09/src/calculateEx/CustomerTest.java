package calculateEx;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.order();
		customer.sayHello();
		
		Buy buyer = customer;
		buyer.buy();
		buyer.order(); // ��� ������ �ν��Ͻ� new Customer()�� order�޼��尡 �Ҹ���.
		
		
		Sell seller = customer;
		seller.sell();
		seller.order(); // ��� ������ �ν��Ͻ� new Customer()�� order�޼��尡 �Ҹ���.
		
		// �ٿ�ĳ����
		if( seller instanceof Customer) {
			Customer seller2 = (Customer)seller;
			seller2.order();
		}
	}

}
