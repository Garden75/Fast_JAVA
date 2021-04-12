package cooperation;

public class Taxi {
	
	int taxiNumber;
	int distance;
	int money;
	
	public Taxi(int taxiNumber, int distance) {
		this.taxiNumber = taxiNumber;
		this.distance = distance;
	}
	
	public int take(int distance) {
		this.distance = distance;
		if(distance <=5) {
			this.money += 3800;
			return 3800;
			
		} else if(distance <= 10) {
			this.money +=6700;
			return 6700;
			
		} else {
			this.money += 9500;
			return 9500;
		}
	}
	
	public void showTaxiInfo() {
		System.out.println(taxiNumber + "가 이동한 거리는 " + distance + "이며 수입은 " + money + "입니다.");
	}

}
