package arrayTest;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student Lee = new Student(1001, "Lee");
		Student Kim = new Student(1001, "Kim");
		Student Cho = new Student(1001, "Cho");
		
		Lee.addBookList("�¹���1", "������");
		Lee.addBookList("�¹���2", "������");
		
		Kim.addBookList("����1", "�ڰ渮");
		Kim.addBookList("����2", "�ڰ渮");
		Kim.addBookList("����3", "�ڰ渮");
		
		Cho.addBookList("�ظ����� �������� ��", "J.K.�Ѹ�");
		Cho.addBookList("�ظ����� ����� ��", "J.K.�Ѹ�");
		Cho.addBookList("�ظ����� ����ī���� �˼�", "J.K.�Ѹ�");
		Cho.addBookList("�ظ����� ���� ��", "J.K.�Ѹ�");
		Cho.addBookList("�ظ����� �һ��� ����", "J.K.�Ѹ�");
		Cho.addBookList("�ظ����� ȥ������", "J.K.�Ѹ�");
		Cho.addBookList("�ظ����� ������ ����1", "J.K.�Ѹ�");
		Cho.addBookList("�ظ����� ������ ����2", "J.K.�Ѹ�");
		
		Lee.showStudentInfo();
		Kim.showStudentInfo();
		Cho.showStudentInfo();

	}

}
