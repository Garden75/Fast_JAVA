package array;

public class ObjectCopyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] library = new Book[5];
		Book[] copylibrary = new Book[5];
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		System.arraycopy(library, 0, copylibrary, 0, 5);
		
		//요소 전체를 다 돌때 향상된 for문으로 간단하게 표현
		//Book 타입의 book이라는 변수에 copylibrary의 요소를 넣어준다.
		/*
		 * for( Book book : copylibrary) { book.showBookInfo(); }
		 */
		
		//객체 배열의 얕은 복사
		
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
