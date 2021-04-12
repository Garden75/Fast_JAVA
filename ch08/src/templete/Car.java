package templete;

public abstract class Car {
	
	//추상클래스로 선언하여 해당 클래스에서 기능을 확장할 수 있다.
	public abstract void stop();
	public abstract void drive();
	
	public void startCar() {
		System.out.println("차에 시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("차에 시동을 끕니다.");
	}
	
	//하위 클래스에 오버라이딩이 가능한 메소드(기능다양성)
	public void washCar() {
		//상위클래스의 공통 기능은 아니지만 해당 객체의 기능을 다르게 구현할 수 있다.
	}
	
	//템플릿 메서드 선언(시나리오 흐름, 즉 시스템의 작동순서를 의미한다.)
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}

}
