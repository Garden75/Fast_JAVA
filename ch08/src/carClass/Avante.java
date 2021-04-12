package carClass;

public class Avante extends Car{

	@Override
	public void start() {
		System.out.println("Avante가 시동을 켭니다.");
		
	}

	@Override
	public void drive() {
		System.out.println("Avante가 달립니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("Avante가 멈춥니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Avante가 시동을 끕니다.");
		
	}
}
