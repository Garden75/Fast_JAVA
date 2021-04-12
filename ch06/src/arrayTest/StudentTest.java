package arrayTest;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student Lee = new Student(1001, "Lee");
		Student Kim = new Student(1001, "Kim");
		Student Cho = new Student(1001, "Cho");
		
		Lee.addBookList("태백산맥1", "조정래");
		Lee.addBookList("태백산맥2", "조정래");
		
		Kim.addBookList("토지1", "박경리");
		Kim.addBookList("토지2", "박경리");
		Kim.addBookList("토지3", "박경리");
		
		Cho.addBookList("해리포터 마법사의 돌", "J.K.롤링");
		Cho.addBookList("해리포터 비밀의 방", "J.K.롤링");
		Cho.addBookList("해리포터 아즈카반의 죄수", "J.K.롤링");
		Cho.addBookList("해리포터 불의 잔", "J.K.롤링");
		Cho.addBookList("해리포터 불사조 기사단", "J.K.롤링");
		Cho.addBookList("해리포터 혼혈왕자", "J.K.롤링");
		Cho.addBookList("해리포터 죽음의 성물1", "J.K.롤링");
		Cho.addBookList("해리포터 죽음의 성물2", "J.K.롤링");
		
		Lee.showStudentInfo();
		Kim.showStudentInfo();
		Cho.showStudentInfo();

	}

}
