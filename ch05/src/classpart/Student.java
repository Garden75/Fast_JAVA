package classpart;

//클래스 생성
public class Student {
	
	//멤버변수 선언
	//public 접근제한자
	public int studentId;
	public String name;
	public String address;
	
	//기본 생성자
	public Student() {}
	
	public Student(String stname) {
		name = stname;
	}
	
	public Student(int id, String stname) {
		studentId = id;
		name = stname;
		address = "주소 없음";
	}
	
	//메서드 선언
	//학생정보를 보여준다
	public void showStudentInfo() {
		System.out.println(name + ", " + address);
	}
	
}
