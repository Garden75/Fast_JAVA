package myDate;

class MyDate {
	int day;
	int month;
	int year;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public boolean equals(Object obj) { //equals 재정의
		if(obj instanceof MyDate) { //다운캐스팅
			MyDate mdate = (MyDate)obj;
			return (this.day == mdate.day && this.month == mdate.month && this.year == mdate.year);
		}else return false;
	}

	@Override
	public int hashCode() {
		return day*11 + month*101 + year*1001;
	}
}

public class MyDateTest {

	public static void main(String[] args) {
		
		MyDate date1 = new MyDate(7, 3, 2021);
		MyDate date2 = new MyDate(7, 3, 2021);
		
		System.out.println(date1.equals(date2)); //true
		
		System.out.println(date1.hashCode()); //366712642 -->2023401 기원 1세기로부터 일자
		System.out.println(date2.hashCode()); //1829164700 -->2023401 기원 1세기로부터 일자

	}

}
