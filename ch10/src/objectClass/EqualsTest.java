package objectClass;

class Student {
	int studentNum;
	String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) { //������
		if(obj instanceof Student) {
			Student std = (Student)obj;
			return (this.studentNum == std.studentNum);
			
//			if(this.studentNum == std.studentNum) {
//				return true;
//			} else return false;
		}
		return false;
		//return super.equals(arg0);
	}

	@Override
	public int hashCode() { //�޸� �ּ� ������
		return studentNum;
		//return super.hashCode();
	}
}

public class EqualsTest {

	public static void main(String[] args) {
		
		String str = new String("str1");
		String str2 = str;
		String str3 = new String("str1");
		
		System.out.println(str == str2); //�޸� �ּҰ��� ����
		System.out.println(str == str3); //�޸� �ּҰ��� �ٸ�
		
		System.out.println(str.equals(str2)); //����ȯ�� �Ǿ� ���� ���ڿ��� �� true
		System.out.println(str.equals(str3)); //����ȯ�� �Ǿ� ���� ���ڿ��� �� true
		
		System.out.println("========== Student ==========");
		
		Student std = new Student(100, "�̼���");
		Student std2 = std;
		Student Lee = new Student(100, "�̼���");
		
		System.out.println(std == std2); //�޸� �ּҰ��� ����(���� �ؽ��ڵ� ���� ���´ٴ� �ǹ�)
		System.out.println(std == Lee); //�޸� �ּҰ��� �ٸ�
		
		System.out.println(std.equals(std2)); //true
		System.out.println(std.equals(Lee)); //false equals()�޼��� �����ǰ� �ʿ��� --> true
		
		System.out.println("========== hashCode ==========");
		
		System.out.println(std.hashCode());
		System.out.println(Lee.hashCode());
		
		System.out.println("========== Integer ==========");
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1.equals(i2)); //true
		System.out.println(i1.hashCode()); //100
		System.out.println(i2.hashCode()); //100
		
		//���� �ý��� �� �޸� �ּ� ���� �ٸ���.
		System.out.println(System.identityHashCode(i1)); //366712642
		System.out.println(System.identityHashCode(i2)); //1829164700
		
	}

}
