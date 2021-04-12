package generic;

public class Powder extends Material {
	
	public String toString() {
		return "Powder 입니다.";
	}

	@Override
	public void doPrinting() {
		System.out.println("Powder로 프린팅합니다.");
	}

}
