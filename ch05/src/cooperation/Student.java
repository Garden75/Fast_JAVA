package cooperation;

public class Student {
	
	String studentNumber;
	int grade;
	int money;
	
	public Student(String studentNumber, int money) {
		this.studentNumber = studentNumber;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.money -= 1200;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(taxi.distance);
		this.money -= taxi.money;
	}
	
	public void showInfo() {
		System.out.println(studentNumber + "¥‘¿« ≥≤¿∫ µ∑¿∫ " + money + "¿‘¥œ¥Ÿ.");
	}

}
