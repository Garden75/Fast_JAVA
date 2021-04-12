package staticTest;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//private인스턴스를 생성했기 때문에 재생성 불가
		//Company company = new Company();
		
		Company company1 = Company.getInstance();
		
		Company company2 = Company.getInstance();
		
		System.out.println(company1);
		System.out.println(company2);

		//같은 이유로 유일한 인스턴스이기 때문에 재생성이 불가
		//Calendar calendar = new Calendar();
		Calendar calendar = Calendar.getInstance();
	}

}
