package templete;

public class AICar extends Car{

	@Override
	public void stop() {
		System.out.println("���� ������ ����ϴ�.");
		
	}

	@Override
	public void drive() {
		System.out.println("���� �����մϴ�.");
		System.out.println("���� ������ ������ �ٲߴϴ�.");
	}

	@Override
	public void washCar() {
		System.out.println("�ڵ� �����մϴ�.");
	}

	
}