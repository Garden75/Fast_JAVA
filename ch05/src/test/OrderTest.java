package test;

public class OrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order = new Order();
		
		order.orderNo = 201907210001L;
		order.orderID = "abc123";
		order.orderDate = "2019년 7월 21일";
		order.orderName = "홍길순";
		order.odProductNo = "PD0345-12";
		order.orderAddress = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문 번호 : " + order.orderNo);
		System.out.println("주문자 아이디 : " + order.orderID);
		System.out.println("주문 날자 : " + order.orderDate);
		System.out.println("주문자 이름 : " + order.orderName);
		System.out.println("주문 상품 번호 : " + order.odProductNo);
		System.out.println("배송 주소 : " + order.orderAddress);

	}

}
