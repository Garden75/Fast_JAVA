package test;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person personNoname = new Person();
		personNoname.showPerson();
		
		Person personLee = new Person("Lee", 23);
		personLee.showPerson();
		System.out.println(personLee);
		
		Person p = personLee.getSelf();
		System.out.println(p);
		
		//���������� ����Ű�� ���� ����.

	}

}
