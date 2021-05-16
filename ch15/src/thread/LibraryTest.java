package thread;

import java.util.ArrayList;

class Library {
	
	public ArrayList<String> books = new ArrayList<String>();
	
	public Library() {
		//������ �ڿ��� ���
		books.add("�¹���1");
		books.add("�¹���2");
		books.add("�¹���3");
		books.add("�¹���4");
//		books.add("�¹���5");
//		books.add("�¹���6");
//		books.add("�¹���7");
	}
	
	public synchronized String lendBook() throws InterruptedException {
		
		Thread t = Thread.currentThread();
		
		//���� å�� ���� ���(notify() ����� ��� �����尡 �ϳ��� ��� ȿ���� ������)
		//notifyAll()�� ����Ͽ� ��� �����带 ���� �� ���� ��ġ �� �������� �����·� ����
		//if�� ���  while������ ��� 
		while( books.size() == 0 ) {
			System.out.println(t.getName() + " wait book start");
			wait();
			System.out.println(t.getName() + " wait book end");
		}
		
		String title = books.remove(0);
		System.out.println(t.getName() + " lend book : " + title);
		return title;
	}
	
	public synchronized void returnBook(String title) {
		
		Thread t = Thread.currentThread();
		
		books.add(title);
		
		//���� å�� �ݳ��Ǹ� ���� �����忡�� �Ѿ
		notifyAll();
		System.out.println(t.getName() + " return book" + title);
	}
}

class Student extends Thread {
	
	public void run() {
		try {
			String title = LibraryTest.library.lendBook();
			sleep(6000);
			LibraryTest.library.returnBook(title);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}

public class LibraryTest {

	public static Library library = new Library(); //shared resource
	
	public static void main(String[] args) {
		
		Student std1 = new Student();
		Student std2 = new Student();
		Student std3 = new Student();
		Student std4 = new Student();
		Student std5 = new Student();
		Student std6 = new Student();
		
		std1.start();
		std2.start();
		std3.start();
		std4.start();
		std5.start();
		std6.start();
		
	}

}
