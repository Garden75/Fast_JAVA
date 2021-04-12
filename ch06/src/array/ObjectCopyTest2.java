package array;

public class ObjectCopyTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] library = new Book[5];
		Book[] copylibrary = new Book[5];
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		copylibrary[0] = new Book();
		copylibrary[1] = new Book();
		copylibrary[2] = new Book();
		copylibrary[3] = new Book();
		copylibrary[4] = new Book();

		//객체 배열의 깊은 복사(서로 다른 인스턴스를 가르키게 됨)
		for(int i = 0; i < library.length; i++) {
			copylibrary[i].setTitle(library[i].getTitle());
			copylibrary[i].setAuthor(library[i].getAuthor());
		}
		
		library[0].setTitle("나목");
		library[0].setAuthor("박완서");
		
		for( Book book : library) {
			book.showBookInfo();
		}
		
		System.out.println("=========================");
		
		for( Book book : copylibrary) {
			book.showBookInfo();
		}
	}

}
