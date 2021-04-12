package staticTest;

public class Company {
	
	private static Company instance = new Company();
	
	private Company() {}
	
	public static Company getInstance() {
		
		if(instance == null) {
			
			instance = new Company(); //인스턴스를 다시 생성
		}
		
		return instance;
	}
	

}
