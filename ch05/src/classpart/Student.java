package classpart;

//Ŭ���� ����
public class Student {
	
	//������� ����
	//public ����������
	public int studentId;
	public String name;
	public String address;
	
	//�⺻ ������
	public Student() {}
	
	public Student(String stname) {
		name = stname;
	}
	
	public Student(int id, String stname) {
		studentId = id;
		name = stname;
		address = "�ּ� ����";
	}
	
	//�޼��� ����
	//�л������� �����ش�
	public void showStudentInfo() {
		System.out.println(name + ", " + address);
	}
	
}
