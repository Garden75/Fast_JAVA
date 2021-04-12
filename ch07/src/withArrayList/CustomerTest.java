package withArrayList;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer(10001, "�Ƹ�����");
		Customer customer2 = new Customer(10002, "��Ƽ�");
		GoldCustomer customer3 = new GoldCustomer(10003, "��þ�");
		GoldCustomer customer4 = new GoldCustomer(10004, "����");
		VIPCustomer customer5 = new VIPCustomer(10005, "���ֳ̾�", 04234);
		
		ArrayList<Customer> arraylist = new ArrayList<Customer>();
		arraylist.add(customer1);
		arraylist.add(customer2);
		arraylist.add(customer3);
		arraylist.add(customer4);
		arraylist.add(customer5);
		
		System.out.println("===== �� ���� ��� =====");
		for(Customer customer : arraylist) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("===== �������� ����Ʈ ��� ���� =====");
		
		int price = 10000;
		for(Customer customer : arraylist) {
			int cost = customer.calcPrice(price);
			
			System.out.println(customer.getCustomerName() + "���� " + cost + "�� �����Ͽ����ϴ�.");
			System.out.println(customer.getCustomerName() + "���� ����Ʈ ������ " + customer.bonusPoint +"�� �Դϴ�.");
			
		}
		
	}

}
