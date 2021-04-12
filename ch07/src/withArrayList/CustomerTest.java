package withArrayList;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer(10001, "아리엘라");
		Customer customer2 = new Customer(10002, "마티어스");
		GoldCustomer customer3 = new GoldCustomer(10003, "루시안");
		GoldCustomer customer4 = new GoldCustomer(10004, "히스");
		VIPCustomer customer5 = new VIPCustomer(10005, "다이애나", 04234);
		
		ArrayList<Customer> arraylist = new ArrayList<Customer>();
		arraylist.add(customer1);
		arraylist.add(customer2);
		arraylist.add(customer3);
		arraylist.add(customer4);
		arraylist.add(customer5);
		
		System.out.println("===== 고객 정보 출력 =====");
		for(Customer customer : arraylist) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("===== 할인율과 포인트 계산 내역 =====");
		
		int price = 10000;
		for(Customer customer : arraylist) {
			int cost = customer.calcPrice(price);
			
			System.out.println(customer.getCustomerName() + "님이 " + cost + "을 지불하였습니다.");
			System.out.println(customer.getCustomerName() + "님의 포인트 점수는 " + customer.bonusPoint +"점 입니다.");
			
		}
		
	}

}
