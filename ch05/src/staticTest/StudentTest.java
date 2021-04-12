package staticTest;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0.인스턴스 생성과는 상관없이 사용가능한 변수임
		//System.out.println(Student.serialNum);
		
		//3.priave static 변수 외부 사용
		System.out.println(Student.getSerialNum());
		
		Student son = new Student("Son");
		//위 인스턴스 변수와 상관없이 참조변수를 이용하는 것보다는 클래스이름을 사용함
		//System.out.println(son.serialNum);
		//System.out.println(Student.serialNum);
		
		//3.priave static 변수 외부 사용
		System.out.println(Student.getSerialNum());
		
		Student lee = new Student("Lee");
		//System.out.println(lee.serialNum);
		//System.out.println(Student.serialNum);
		
		//3.priave static 변수 외부 사용
		System.out.println(Student.getSerialNum());
		
		//1.같은 주소값의 레퍼런스 값을 가르키고 있음
		//System.out.println(lee.serialNum);
		//System.out.println(son.serialNum);
		//System.out.println(Student.serialNum);
		//System.out.println(Student.serialNum);
		
		//3.priave static 변수 외부 사용
		System.out.println(Student.getSerialNum());
		System.out.println(Student.getSerialNum());
		
		//2.고유 serialNum을 각 studentId 값으로 대입
		System.out.println(son.studentId);
		System.out.println(lee.studentId);
		
		
	}
	
}