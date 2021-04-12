package objectClass;

class Book2 implements Cloneable {
	String title;
	String author;
	
	public Book2(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() { // objectClass.Book@15db9742의 해시함수(메모리함수)를 문자열로 변환
		return author + ", " + title;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
}

public class ToStringTest2 extends Object{

	public static void main(String[] args) throws CloneNotSupportedException {

		Book2 book = new Book2("토지", "박경리");
		System.out.println(book);
		
		String str = new String("문자출력");
		System.out.println(str.toString());//자동 형변환
		
		Book2 book2 = (Book2)book.clone();
		System.out.println(book2);
		
	}

}
