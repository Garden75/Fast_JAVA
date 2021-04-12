package generic;

public class GenericPrinter<T extends Material> { //������ ��� ����� ���� ���� Ŭ���� Material
	
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
