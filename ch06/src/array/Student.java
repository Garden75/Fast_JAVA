package array;

import java.util.ArrayList;

public class Student {
	
	int studentId;
	String studentName;
	ArrayList<Subject> arrlist; //수강과목 저장
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		
		arrlist = new ArrayList<Subject>(); //수강과목 리스트를 불러옴
	}
	
	public void addSubject(String name, int score) { //학생별 수강과목 생성
		Subject subject = new Subject(name, score); //수강과목 객체에
		
		arrlist.add(subject);// 수강과목 생성
		
	}
	
	public void showStudentInfo() {
		
		int total = 0; //과목의 총점
		
		for(Subject subject : arrlist) {
			
			total += subject.getScore();
			System.out.println(studentName + "님의  " + subject.getName() + "과목의 점수는  " + subject.getScore() + "점 입니다.");

		}
		System.out.println(studentName + "님의 총점은  " + total + "점 입니다.");
		
		
	}

}
