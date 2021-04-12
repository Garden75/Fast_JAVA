package objectClass;

class Book {
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() { // objectClass.Book@15db9742의 해시함수(메모리함수)를 문자열로 변환
		return author + ", " + title;
	}
}

public class ToStringTest extends Object{

	public static void main(String[] args) {

		Book book = new Book("토지", "박경리");
		System.out.println(book);
		
		String str = new String("문자출력");
		System.out.println(str.toString());//자동 형변환
		
	}

}
