package templete;

public abstract class Car {
	
	//�߻�Ŭ������ �����Ͽ� �ش� Ŭ�������� ����� Ȯ���� �� �ִ�.
	public abstract void stop();
	public abstract void drive();
	
	public void startCar() {
		System.out.println("���� �õ��� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("���� �õ��� ���ϴ�.");
	}
	
	//���� Ŭ������ �������̵��� ������ �޼ҵ�(��ɴپ缺)
	public void washCar() {
		//����Ŭ������ ���� ����� �ƴ����� �ش� ��ü�� ����� �ٸ��� ������ �� �ִ�.
	}
	
	//���ø� �޼��� ����(�ó����� �帧, �� �ý����� �۵������� �ǹ��Ѵ�.)
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}

}
