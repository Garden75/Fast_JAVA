package staticTest;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//private�ν��Ͻ��� �����߱� ������ ����� �Ұ�
		//Company company = new Company();
		
		Company company1 = Company.getInstance();
		
		Company company2 = Company.getInstance();
		
		System.out.println(company1);
		System.out.println(company2);

		//���� ������ ������ �ν��Ͻ��̱� ������ ������� �Ұ�
		//Calendar calendar = new Calendar();
		Calendar calendar = Calendar.getInstance();
	}

}