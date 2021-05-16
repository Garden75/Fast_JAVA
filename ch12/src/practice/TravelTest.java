package practice;

import java.util.ArrayList;

public class TravelTest {
	
	public static void main(String[] args) {
		
		TravelCustomer customerLee = new TravelCustomer("�̼���", 40, 100);
		TravelCustomer customerKim = new TravelCustomer("������", 20, 100);
		TravelCustomer customerHong = new TravelCustomer("ȫ�浿", 13, 25);
		
		ArrayList<TravelCustomer> ctmList = new ArrayList<TravelCustomer>();
		ctmList.add(customerLee);
		ctmList.add(customerKim);
		ctmList.add(customerHong);
		
		System.out.println(ctmList);
		
		//1. �� ��� ����ϱ�
		System.out.println("[�� ���]");
		ctmList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		
		//2. �� �ݾ� ���ϱ�
		int total = ctmList.stream().mapToInt(p -> p.getPrice()).sum();
		System.out.println("�� �հ� = " + total);
		
		//3. �� ��� ������������ �����ϱ�
		System.out.println("[20�� �̻� �� ���]");
		ctmList.stream().filter(a -> a.getAge() >= 20).map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));
		
	}

}
