package array;

public class ObjectCopyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] library = new Book[5];
		Book[] copylibrary = new Book[5];
		
		library[0] = new Book("�¹���1", "������");
		library[1] = new Book("�¹���2", "������");
		library[2] = new Book("�¹���3", "������");
		library[3] = new Book("�¹���4", "������");
		library[4] = new Book("�¹���5", "������");
		
		System.arraycopy(library, 0, copylibrary, 0, 5);
		
		//��� ��ü�� �� ���� ���� for������ �����ϰ� ǥ��
		//Book Ÿ���� book�̶�� ������ copylibrary�� ��Ҹ� �־��ش�.
		/*
		 * for( Book book : copylibrary) { book.showBookInfo(); }
		 */
		
		//��ü �迭�� ���� ����
		
		library[0].setTitle("����");
		library[0].setAuthor("�ڿϼ�");
		
		for( Book book : library) {
			book.showBookInfo();
		}
		
		System.out.println("=========================");
		
		for( Book book : copylibrary) {
			book.showBookInfo();
		}
	}

}
