package polymorphism;

import java.util.ArrayList;

class Animal {
	
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
	
	public void eating() {
		System.out.println("������ ������ �Խ��ϴ�.");
	}
}

class Human extends Animal {
	
	public void move() {
		System.out.println("����� �ι߷� �ɾ�ٴմϴ�.");
	}
	
	public void readBooks() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Tiger extends Animal {
	
	public void move() {
		System.out.println("ȣ���̰� �׹߷� �ݴϴ�.");
	}
	
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
}

class Eagle extends Animal {
	
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
	
	public void flying() {
		System.out.println("�������� ������ �� ���ƿ����ϴ�.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal hAnimal = new Human(); // Ÿ��: Animal
		Animal tAnimal = new Tiger(); // Ÿ��: Animal
		Animal eAnimal = new Eagle(); // Ÿ��: Animal
		
		//�ٿ�ĳ����
		Human human = (Human)hAnimal;
		human.readBooks();
		
		//�ٿ�ĳ���� �����߻�
		//polymorphism.Human cannot be cast to polymorphism.Eagle
		//hAnimal �ν��Ͻ��� Human�ε� ������ Eagle�� �ٿ�ĳ������ �� �� ����.
		//Eagle human2 = (Eagle)hAnimal;
		
		//���� �߻��� ���� ���� �Ʒ��� ���� ������ �ٿ� ǥ���Ѵ�.
		if(hAnimal instanceof Eagle) { //hAnimal�� Eagle�� false�̹Ƿ�
			Eagle human3 = (Eagle)hAnimal; //�� �ڵ�� ������� �ʴ´�.
		}
		
		//�� �������� �ٸ� �ٿ�ĳ������ ǥ����
		if(hAnimal instanceof Human) { //hAnimal�� Human�� true�̹Ƿ�
			Human human4 = (Human)hAnimal;
			human4.readBooks();
		}
		
		//���1.
		AnimalTest animalTest = new AnimalTest();
		animalTest.moveAnimal(hAnimal);
		animalTest.moveAnimal(tAnimal);
		animalTest.moveAnimal(eAnimal);
		
		System.out.println("=================================");
		
		//���2.
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
	
	public void moveAnimal(Animal animal) { //AnimalŸ���� ������ ���, ȣ����, ������ ��� AnimalŸ���� ��ü�� �����Ǿ��� �����̴�.
		animal.move(); //�ϳ��� �ڵ尡 ���� �ڷ����� ������ �Ǽ� �ٸ� ������ �̷������ ���� �������̶�� �Ѵ�.
	}
	
	//�ٿ�ĳ���� 
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
