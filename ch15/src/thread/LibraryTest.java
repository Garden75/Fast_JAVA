package thread;

import java.util.ArrayList;

class Library {
	
	public ArrayList<String> books = new ArrayList<String>();
	
	public Library() {
		//한정된 자원인 경우
		books.add("태백산맥1");
		books.add("태백산맥2");
		books.add("태백산맥3");
		books.add("태백산맥4");
//		books.add("태백산맥5");
//		books.add("태백산맥6");
//		books.add("태백산맥7");
	}
	
	public synchronized String lendBook() throws InterruptedException {
		
		Thread t = Thread.currentThread();
		
		//빌릴 책이 없는 경우(notify() 사용한 경우 쓰레드가 하나씩 깨어나 효율이 떨어짐)
		//notifyAll()을 사용하여 모든 쓰레드를 깨운 후 순차 배치 후 나머지는 대기상태로 돌림
		//if문 대신  while문으로 사용 
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
		
		//빌린 책이 반납되면 다음 쓰레드에게 넘어감
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
