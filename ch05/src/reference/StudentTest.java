package reference;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�л� ��ü ����
		Student studentLee = new Student(100, "Lee");
		
		studentLee.setKoreaSubject("����", 100);
		studentLee.setMathSubject("����", 95);
		
		//�л� ��ü ����
		Student studentKim = new Student(101, "Kim");
		
		studentKim.setKoreaSubject("����", 85);
		studentKim.setMathSubject("����", 92);
		
		//�л��� ���� ���
		studentLee.showTotalScore();
		studentKim.showTotalScore();
		

	}

}
