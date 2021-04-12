package array;

public class BookArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book[] library = new Book[5];
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]); //객체 배열 요소의 주소값이 출력됨
			library[i].showBookInfo();
		}
	}

}
