package array;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student Lee = new Student(1001, "Lee");
		Student Kim = new Student(1002, "Kim");
		
		Lee.addSubject("����", 100);
		Lee.addSubject("����", 90);
		
		Kim.addSubject("����", 100);
		Kim.addSubject("����", 90);
		Kim.addSubject("����", 80);
		
		
		Lee.showStudentInfo();
		System.out.println("============================");
		Kim.showStudentInfo();
		

	}

}
