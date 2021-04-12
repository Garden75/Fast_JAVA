package classpart;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//st와 st2는 참조변수로 각 객체인스턴스의 멤버변수를 참조하는 변수이다.
		Student st = new Student();
		st.name = "이순신";
		st.address = "세종";
		
		st.showStudentInfo();
		
		Student st2 = new Student();
		st2.name = "김유신";
		st2.address = "경주";
		
		st2.showStudentInfo();
		
		Student st3 = new Student(300, "박대길");
		//st3.name = "박대길";
		
		st3.showStudentInfo();
	}

}
