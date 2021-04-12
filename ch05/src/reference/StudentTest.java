package reference;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//학생 객체 생성
		Student studentLee = new Student(100, "Lee");
		
		studentLee.setKoreaSubject("국어", 100);
		studentLee.setMathSubject("수학", 95);
		
		//학생 객체 생성
		Student studentKim = new Student(101, "Kim");
		
		studentKim.setKoreaSubject("국어", 85);
		studentKim.setMathSubject("수학", 92);
		
		//학생별 총점 출력
		studentLee.showTotalScore();
		studentKim.showTotalScore();
		

	}

}
