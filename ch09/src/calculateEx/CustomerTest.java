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
		buyer.order(); // 모두 구현된 인스턴스 new Customer()의 order메서드가 불린다.
		
		
		Sell seller = customer;
		seller.sell();
		seller.order(); // 모두 구현된 인스턴스 new Customer()의 order메서드가 불린다.
		
		// 다운캐스팅
		if( seller instanceof Customer) {
			Customer seller2 = (Customer)seller;
			seller2.order();
		}
	}

}
