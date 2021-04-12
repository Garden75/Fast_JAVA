package generic;

public class Plastic extends Material {
	
	public String toString() {
		return "Plastic 입니다.";
	}

	@Override
	public void doPrinting() {
		System.out.println("Plastic으로 프린팅합니다.");
	}

}
