package abstractEx;

public abstract class Computer {
	
	public abstract void display();
	public abstract void typing();
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}

}
