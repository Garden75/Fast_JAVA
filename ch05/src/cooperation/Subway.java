package cooperation;

public class Subway {
	
	int subwayNumber;
	int passengerCount;
	int money;
	
	public Subway(int subwayNumber) {
		this.subwayNumber = subwayNumber;
	}
	
	public void take(int money) { //승차
		this.money += money;
		this.passengerCount++;
	}
	
	public void showSubwayInfo() {
		System.out.println(subwayNumber + "의 승객 수는 " + passengerCount + "이고 수입은 " + money + "입니다.");
	}

}
