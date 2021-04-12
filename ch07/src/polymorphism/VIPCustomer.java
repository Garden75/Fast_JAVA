package polymorphism;

public class VIPCustomer extends Customer{
	
	private int agentID;
	double salesRatio;
	
//	public VIPCustomer() {
//		
//		super(); //상위 클래스의 기본생성자를 호출
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
//		salesRatio = 0.1;
//		
//		System.out.println("VIPCustomer() 생성자 호출");
//	}
	
	//상위 클래스의 기본생성자가 없는 경우, 상위 클래스의  매개변수가 있는 하위 클래스 생성자를 만들어줌
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer(int, String) 생성자 호출");
		
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
	
}
