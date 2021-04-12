package objectClass;

class Book2 implements Cloneable {
	String title;
	String author;
	
	public Book2(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() { // objectClass.Book@15db9742�� �ؽ��Լ�(�޸��Լ�)�� ���ڿ��� ��ȯ
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

		Book2 book = new Book2("����", "�ڰ渮");
		System.out.println(book);
		
		String str = new String("�������");
		System.out.println(str.toString());//�ڵ� ����ȯ
		
		Book2 book2 = (Book2)book.clone();
		System.out.println(book2);
		
	}

}
