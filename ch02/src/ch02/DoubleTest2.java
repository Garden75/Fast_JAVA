package ch02;

public class DoubleTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ߺ��Ǵ� ������ ���
		
		double dNum = 1;
		
		//�ε� �Ҽ��� ����
		for(int i = 0; i < 10000; i++) {
			
			dNum = dNum + 0.1;
			//1001�� �ƴ� 1001.000000000159�� ����� ����
			//�ణ�� ������ �߻������� �� ���� ������ �Ǽ��� ǥ���ϱ� ���� �ε��Ҽ��� ����� ���
		}
		System.out.println(dNum);
	}

}
