package staticTest;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0.�ν��Ͻ� �������� ������� ��밡���� ������
		//System.out.println(Student.serialNum);
		
		//3.priave static ���� �ܺ� ���
		System.out.println(Student.getSerialNum());
		
		Student son = new Student("Son");
		//�� �ν��Ͻ� ������ ������� ���������� �̿��ϴ� �ͺ��ٴ� Ŭ�����̸��� �����
		//System.out.println(son.serialNum);
		//System.out.println(Student.serialNum);
		
		//3.priave static ���� �ܺ� ���
		System.out.println(Student.getSerialNum());
		
		Student lee = new Student("Lee");
		//System.out.println(lee.serialNum);
		//System.out.println(Student.serialNum);
		
		//3.priave static ���� �ܺ� ���
		System.out.println(Student.getSerialNum());
		
		//1.���� �ּҰ��� ���۷��� ���� ����Ű�� ����
		//System.out.println(lee.serialNum);
		//System.out.println(son.serialNum);
		//System.out.println(Student.serialNum);
		//System.out.println(Student.serialNum);
		
		//3.priave static ���� �ܺ� ���
		System.out.println(Student.getSerialNum());
		System.out.println(Student.getSerialNum());
		
		//2.���� serialNum�� �� studentId ������ ����
		System.out.println(son.studentId);
		System.out.println(lee.studentId);
		
		
	}
	
}