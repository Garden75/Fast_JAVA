package hiding;

public class MyDateTest {
	
	public static void main(String[] args) {
		
		MyDate date = new MyDate();
		
		//MyDateŬ������ ������� ���������ڰ� default�̱� ������ � ������ ���� ���ȴ�.
		//date.day = 11;
		//date.month = 8;
		//date.year = 2020;
		
		date.setYear(2020);
		date.setMonth(8);
		date.setDay(100);
		
		date.showDate();
		
	}

}
