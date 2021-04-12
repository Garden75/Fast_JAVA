package generic;

public class GenericPrinter<T extends Material> { //지정된 재료 사용을 위한 상위 클래스 Material
	
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	public String toSring() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
	}

}
