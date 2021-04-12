package objectClass;

class Book {
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() { // objectClass.Book@15db9742�� �ؽ��Լ�(�޸��Լ�)�� ���ڿ��� ��ȯ
		return author + ", " + title;
	}
}

public class ToStringTest extends Object{

	public static void main(String[] args) {

		Book book = new Book("����", "�ڰ渮");
		System.out.println(book);
		
		String str = new String("�������");
		System.out.println(str.toString());//�ڵ� ����ȯ
		
	}

}
