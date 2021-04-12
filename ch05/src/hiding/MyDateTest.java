package hiding;

public class MyDateTest {
	
	public static void main(String[] args) {
		
		MyDate date = new MyDate();
		
		//MyDate클래스의 멤버변수 접근제어자가 default이기 때문에 어떤 정수가 들어가도 허용된다.
		//date.day = 11;
		//date.month = 8;
		//date.year = 2020;
		
		date.setYear(2020);
		date.setMonth(8);
		date.setDay(100);
		
		date.showDate();
		
	}

}
