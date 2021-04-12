package reference;

public class Student {
	
	int studentId;
	String studentName;
	
	Subject korea;
	Subject math;
	
	//참조 변수를 사용하려면 생성자를 만들어 초기화를 머저 해주는 것이 좋다.
	public Student() {
		korea = new Subject();
		math = new Subject();
	}
	
	public Student(int id, String name) {
		studentId = id;
		studentName = name;
		
		korea = new Subject();
		math = new Subject();
	}
	
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	public void showTotalScore() {
		int total = korea.score + math.score;
		System.out.println(studentName + "의 총점은 " + total + "점 입니다.");
	}

}
