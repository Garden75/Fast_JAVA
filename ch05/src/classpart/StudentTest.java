package classpart;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//st�� st2�� ���������� �� ��ü�ν��Ͻ��� ��������� �����ϴ� �����̴�.
		Student st = new Student();
		st.name = "�̼���";
		st.address = "����";
		
		st.showStudentInfo();
		
		Student st2 = new Student();
		st2.name = "������";
		st2.address = "����";
		
		st2.showStudentInfo();
		
		Student st3 = new Student(300, "�ڴ��");
		//st3.name = "�ڴ��";
		
		st3.showStudentInfo();
	}

}
