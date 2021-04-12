package array;

import java.util.ArrayList;

public class Student {
	
	int studentId;
	String studentName;
	ArrayList<Subject> arrlist; //�������� ����
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		
		arrlist = new ArrayList<Subject>(); //�������� ����Ʈ�� �ҷ���
	}
	
	public void addSubject(String name, int score) { //�л��� �������� ����
		Subject subject = new Subject(name, score); //�������� ��ü��
		
		arrlist.add(subject);// �������� ����
		
	}
	
	public void showStudentInfo() {
		
		int total = 0; //������ ����
		
		for(Subject subject : arrlist) {
			
			total += subject.getScore();
			System.out.println(studentName + "����  " + subject.getName() + "������ ������  " + subject.getScore() + "�� �Դϴ�.");

		}
		System.out.println(studentName + "���� ������  " + total + "�� �Դϴ�.");
		
		
	}

}
