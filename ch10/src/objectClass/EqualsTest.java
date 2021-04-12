package objectClass;

class Student {
	int studentNum;
	String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) { //재정의
		if(obj instanceof Student) {
			Student std = (Student)obj;
			return (this.studentNum == std.studentNum);
			
//			if(this.studentNum == std.studentNum) {
//				return true;
//			} else return false;
		}
		return false;
		//return super.equals(arg0);
	}

	@Override
	public int hashCode() { //메모리 주소 재정의
		return studentNum;
		//return super.hashCode();
	}
}

public class EqualsTest {

	public static void main(String[] args) {
		
		String str = new String("str1");
		String str2 = str;
		String str3 = new String("str1");
		
		System.out.println(str == str2); //메모리 주소값이 같음
		System.out.println(str == str3); //메모리 주소값이 다름
		
		System.out.println(str.equals(str2)); //형변환이 되어 같은 문자열을 비교 true
		System.out.println(str.equals(str3)); //형변환이 되어 같은 문자열을 비교 true
		
		System.out.println("========== Student ==========");
		
		Student std = new Student(100, "이순신");
		Student std2 = std;
		Student Lee = new Student(100, "이순신");
		
		System.out.println(std == std2); //메모리 주소값이 같음(같은 해시코드 값을 같는다는 의미)
		System.out.println(std == Lee); //메모리 주소값이 다름
		
		System.out.println(std.equals(std2)); //true
		System.out.println(std.equals(Lee)); //false equals()메서드 재정의가 필요함 --> true
		
		System.out.println("========== hashCode ==========");
		
		System.out.println(std.hashCode());
		System.out.println(Lee.hashCode());
		
		System.out.println("========== Integer ==========");
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1.equals(i2)); //true
		System.out.println(i1.hashCode()); //100
		System.out.println(i2.hashCode()); //100
		
		//실제 시스템 상 메모리 주소 값은 다르다.
		System.out.println(System.identityHashCode(i1)); //366712642
		System.out.println(System.identityHashCode(i2)); //1829164700
		
	}

}
