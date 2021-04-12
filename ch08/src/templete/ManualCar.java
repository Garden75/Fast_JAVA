package templete;

public class ManualCar extends Car{

	@Override
	public void stop() {
		System.out.println("사람이 브레이크를 밟아 멈춥니다.");
		
	}

	@Override
	public void drive() {
		System.out.println("사람이 엑셀을 밟아 속도를 올립니다.");
		
	}

}
