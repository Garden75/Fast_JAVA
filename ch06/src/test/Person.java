package test;

public class Person {
	
	private String name;
	private int age;
	
	public Person() {
		this("이름없음", 1);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showPerson() {
		System.out.println(name + ", " + age);
	}
	
	public Person getSelf() { //자기자신을 반환
		return this;
	}

}
