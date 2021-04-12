package arrayTest;

import java.util.ArrayList;

public class Student {
	
	int studentId;
	String studentName;
	ArrayList<Book> arraylist;
	
	public Student(int sudentId, String studentName) {
		this.studentId = sudentId;
		this.studentName = studentName;
		
		arraylist = new ArrayList<Book>(); //책 리스트를 가져옴
	}
	
	public void addBookList(String title, String author) {
		Book book = new Book(title, author); //책 객체에
		
		arraylist.add(book); //읽은 책 추가
		
	}
	
	public void showStudentInfo() {
		
		System.out.print(studentName + "학생이 읽은 책은 : ");
				
		for(Book book : arraylist) {
			 System.out.print(book.getTitle() + " ");
		}
		
		System.out.println("입니다.");
	}

}
