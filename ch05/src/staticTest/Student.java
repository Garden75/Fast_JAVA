package staticTest;

//클래스 생성
public class Student {
	
	//static변수 선언
	private static int serialNum = 1000;//계속 증가하는 값
	
	//멤버변수 선언
	//public 접근제한자
	public int studentId;//증가된 값 중 하나만을 가져감
	public String name;
	public String address;
	
	//기본 생성자
	public Student() {}
	
	public Student(String stname) {
		name = stname;
		serialNum++;
		studentId = serialNum;
	}
	
	public Student(int id, String stname) {
		studentId = id;
		name = stname;
		address = "주소 없음";
		serialNum++;
		studentId = serialNum;
	}
	
	//3.private으로 선언된 static변수를 외부에서 사용하기 위해  getter, setter 메서드를 만들어줌
	public static int getSerialNum() {
		int i = 0;
		
		//4.인스턴스 변수는 인스턴스 생성함수에 의해 생성되므로 static이 생성되었을 경우 존재하지 않을 수도 있기에
		//static 메서드 안에 인스턴스 변수는 사용이 불가하다.
		//studentName = "Lee";
		
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}

	//메서드 선언
	//학생정보를 보여준다
	public void showStudentInfo() {
		System.out.println(name + ", " + address);
	}
	
}
