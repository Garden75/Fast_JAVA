package test;

public class OrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order = new Order();
		
		order.orderNo = 201907210001L;
		order.orderID = "abc123";
		order.orderDate = "2019�� 7�� 21��";
		order.orderName = "ȫ���";
		order.odProductNo = "PD0345-12";
		order.orderAddress = "����� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ� ��ȣ : " + order.orderNo);
		System.out.println("�ֹ��� ���̵� : " + order.orderID);
		System.out.println("�ֹ� ���� : " + order.orderDate);
		System.out.println("�ֹ��� �̸� : " + order.orderName);
		System.out.println("�ֹ� ��ǰ ��ȣ : " + order.odProductNo);
		System.out.println("��� �ּ� : " + order.orderAddress);

	}

}
