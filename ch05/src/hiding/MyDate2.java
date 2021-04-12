package hiding;

import java.util.Calendar;

public class MyDate2 {
	
	private int year;
	private int month;
	private int day;
	private boolean isValid = true;
	
	public MyDate2(int day, int month, int year) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if (year > Calendar.getInstance().get(Calendar.YEAR)) {
			isValid = false;
		}
		else {
			this.year = year;
		}
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month < 1 || month > 12) { //월은 1월부터 12월까지 있음
			isValid = false;
		} else {	
			this.month = month;
		}
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) { //월마다 일수가 다름
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			if(day < 0 || day > 31) {
				isValid = false;
			} else {
				this.day = day;
			}
			break;
			
		case 4: case 6: case 9: case 11:
			if(day < 0 || day > 30) {
				isValid = false;
			} else {
				this.day = day;
			}
			break;
			
		case 2:
			if (( ( year % 4 ==0 &&  year % 100 !=0 ) || year % 400 ==0)){  //윤년인 경우 : 서력 기원 연수가 4, 400으로 나누어 떨어지며 100으로 떨어지지 않는 해
				if (day <0 || day >29) {
					isValid = false;
				} 
				else { //평년인 경우 : 서력 기원 연수가 4, 100으로 나누어 떨어지는 해
					this.day = day;
				}
			}
			else {
				if (day <0 || day >28) {
					isValid = false;
				} 
				else {
					this.day = day;
				}
			}
			break;
			
		default:
			isValid = false;
		}
	}

	public void isValid() {
		if(isValid) {
			System.out.println(year + "년 " + month + "월 " + day +"일은 유효한 날짜입니다.");
			
		} else {
			System.out.println("유효하지 않은 날짜입니다.");
		}
		
	}
}
