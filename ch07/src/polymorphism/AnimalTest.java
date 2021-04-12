package polymorphism;

import java.util.ArrayList;

class Animal {
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	
	public void eating() {
		System.out.println("동물이 음식을 먹습니다.");
	}
}

class Human extends Animal {
	
	public void move() {
		System.out.println("사람이 두발로 걸어다닙니다.");
	}
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal {
	
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal {
	
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개을 펴 날아오릅니다.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal hAnimal = new Human(); // 타입: Animal
		Animal tAnimal = new Tiger(); // 타입: Animal
		Animal eAnimal = new Eagle(); // 타입: Animal
		
		//다운캐스팅
		Human human = (Human)hAnimal;
		human.readBooks();
		
		//다운캐스팅 오류발생
		//polymorphism.Human cannot be cast to polymorphism.Eagle
		//hAnimal 인스턴스는 Human인데 강제로 Eagle로 다운캐스팅을 할 수 없다.
		//Eagle human2 = (Eagle)hAnimal;
		
		//오류 발생을 막기 위해 아래와 같이 조건을 붙여 표현한다.
		if(hAnimal instanceof Eagle) { //hAnimal이 Eagle에 false이므로
			Eagle human3 = (Eagle)hAnimal; //이 코드는 실행되지 않는다.
		}
		
		//위 예제에서 바른 다운캐스팅의 표현은
		if(hAnimal instanceof Human) { //hAnimal이 Human에 true이므로
			Human human4 = (Human)hAnimal;
			human4.readBooks();
		}
		
		//방법1.
		AnimalTest animalTest = new AnimalTest();
		animalTest.moveAnimal(hAnimal);
		animalTest.moveAnimal(tAnimal);
		animalTest.moveAnimal(eAnimal);
		
		System.out.println("=================================");
		
		//방법2.
		ArrayList<Animal> arraylist = new ArrayList<Animal>();
		arraylist.add(hAnimal);
		arraylist.add(tAnimal);
		arraylist.add(eAnimal);

		for(Animal animal : arraylist) {
			animal.move();
		}
		
		System.out.println("=================================");
		
		animalTest.downCastingTest(arraylist);
		
	}
	
	public void moveAnimal(Animal animal) { //Animal타입인 이유는 사람, 호랑이, 독수리 모두 Animal타입의 객체로 생성되었기 떄문이다.
		animal.move(); //하나의 코드가 여러 자료형이 구현이 되서 다른 실행이 이루어지는 것을 다형성이라고 한다.
	}
	
	//다운캐스팅 
	public void downCastingTest(ArrayList<Animal> list) {
		
		
		for(int i = 0; i < list.size(); i++) {
			Animal animal = list.get(i);
			
			if(animal instanceof Human) {
				Human human = (Human)animal;
				human.readBooks();
				
			} else if(animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
				
			} else if(animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			}
		}
	}
	
	

}
