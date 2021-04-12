package array;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student Lee = new Student(1001, "Lee");
		Student Kim = new Student(1002, "Kim");
		
		Lee.addSubject("국어", 100);
		Lee.addSubject("수학", 90);
		
		Kim.addSubject("국어", 100);
		Kim.addSubject("수학", 90);
		Kim.addSubject("영어", 80);
		
		
		Lee.showStudentInfo();
		System.out.println("============================");
		Kim.showStudentInfo();
		

	}

}
