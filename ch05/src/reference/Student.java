package reference;

public class Student {
	
	int studentId;
	String studentName;
	
	Subject korea;
	Subject math;
	
	//���� ������ ����Ϸ��� �����ڸ� ����� �ʱ�ȭ�� ���� ���ִ� ���� ����.
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
		System.out.println(studentName + "�� ������ " + total + "�� �Դϴ�.");
	}

}
