package hiding;

public class MyDate {
	
	//default접근자 : 같은 패키지 내에서 사용가능한 멤버변수
	//int day;
	//int month;
	//int year;
	
	private int day;
	private int month;
	private int year;
	
	private boolean isValid; //조건 확인을 위한 boolean
	
	//private 멤버변수일 때, 날짜 입력을 위한 메서드 생성
	//이때 this를 사용하여 멤버변수에 접근한다.
	public void setDay(int day) {
		this.day = day;
	}
	
	public int getDay() {
		return day;
	}
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		//날짜 범위 오류를 막기 위한 정보 은닉을 사용한 예
		if(month < 1 || month > 12) {
			isValid = false;
		} else {	
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void showDate() {
		
		if(isValid) {
			System.out.println(year + "년 " + month + "월 " + day +"일");			
		} else {
			System.out.println("유효하지 않은 날짜입니다.");
		}
	}
}
