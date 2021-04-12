package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customerLee = new Customer(10010, "�̼���");
		customerLee.bonusPoint = 1000;
		
		VIPCustomer customerKim = new VIPCustomer(10020, "������");
		customerKim.bonusPoint = 10000;
		
		int priceLee = customerLee.calcPrice(10000);
		int priceKim = customerKim.calcPrice(10000);
		
		
		System.out.println(customerLee.showCustomerInfo() + " ���ұݾ��� " + priceLee + "�� �Դϴ�.");
		System.out.println(customerKim.showCustomerInfo() + " ���ұݾ��� " + priceKim + "�� �Դϴ�.");
		
		Customer customerNa = new VIPCustomer(10030, "������");
		customerNa.bonusPoint = 10000;
		System.out.println(customerNa.showCustomerInfo() + " ���ұݾ��� " + customerNa.calcPrice(10000) + "�� �Դϴ�.");
		System.out.println(customerNa.bonusPoint); //10500 ��

	}

}
