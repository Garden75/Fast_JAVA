package stream.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable, Externalizable { 
	
	String name;
	transient String job; //transient�� ����ȭ ������ ���� �տ� �ٴ� ������̴�.
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + ", " + job;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}
}

public class SerializationTest {

	public static void main(String[] args) {
		
		Person personLee = new Person("�̼���", "�����Ͼ�");
		Person personKang = new Person("������", "�ǻ�");
		
		try( FileOutputStream fos = new FileOutputStream("Serial.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
			oos.writeObject(personLee);
			oos.writeObject(personKang);
			
			fos.close();
			oos.close();
			
		} catch(IOException e) {
			System.out.println(e);
		}
		
		try( FileInputStream fis = new FileInputStream("Serial.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			
			//����ȯ�� instanceOf�� ����ϴ� ���� ���� ����.
			//1. ()
//			Person p1 = (Person)ois.readObject();
//			Person p2 = (Person)ois.readObject();
//			System.out.println(p1);
//			System.out.println(p2);
			
			//2. ����ȯ ���
			Object o1 = ois.readObject();
			Object o2 = ois.readObject();
			if(o1 instanceof Person) {
				Person ps1 = (Person) o1;
				System.out.println(ps1);
			}
			if(o2 instanceof Person) {
				Person ps2 = (Person) o2;
				System.out.println(ps2);
			}
			
		} catch(IOException e) {
			System.out.println(e);
			
		} catch(ClassNotFoundException e) {
			System.out.println(e);
			
		}
	}

}
