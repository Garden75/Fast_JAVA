package staticTest;

//Ŭ���� ����
public class Student {
	
	//static���� ����
	private static int serialNum = 1000;//��� �����ϴ� ��
	
	//������� ����
	//public ����������
	public int studentId;//������ �� �� �ϳ����� ������
	public String name;
	public String address;
	
	//�⺻ ������
	public Student() {}
	
	public Student(String stname) {
		name = stname;
		serialNum++;
		studentId = serialNum;
	}
	
	public Student(int id, String stname) {
		studentId = id;
		name = stname;
		address = "�ּ� ����";
		serialNum++;
		studentId = serialNum;
	}
	
	//3.private���� ����� static������ �ܺο��� ����ϱ� ����  getter, setter �޼��带 �������
	public static int getSerialNum() {
		int i = 0;
		
		//4.�ν��Ͻ� ������ �ν��Ͻ� �����Լ��� ���� �����ǹǷ� static�� �����Ǿ��� ��� �������� ���� ���� �ֱ⿡
		//static �޼��� �ȿ� �ν��Ͻ� ������ ����� �Ұ��ϴ�.
		//studentName = "Lee";
		
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}

	//�޼��� ����
	//�л������� �����ش�
	public void showStudentInfo() {
		System.out.println(name + ", " + address);
	}
	
}
