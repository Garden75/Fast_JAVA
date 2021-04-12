package arrayTest;

import java.util.ArrayList;

public class Student {
	
	int studentId;
	String studentName;
	ArrayList<Book> arraylist;
	
	public Student(int sudentId, String studentName) {
		this.studentId = sudentId;
		this.studentName = studentName;
		
		arraylist = new ArrayList<Book>(); //å ����Ʈ�� ������
	}
	
	public void addBookList(String title, String author) {
		Book book = new Book(title, author); //å ��ü��
		
		arraylist.add(book); //���� å �߰�
		
	}
	
	public void showStudentInfo() {
		
		System.out.print(studentName + "�л��� ���� å�� : ");
				
		for(Book book : arraylist) {
			 System.out.print(book.getTitle() + " ");
		}
		
		System.out.println("�Դϴ�.");
	}

}
