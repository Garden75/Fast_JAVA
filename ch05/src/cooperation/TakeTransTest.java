package cooperation;

import java.util.Scanner;

public class TakeTransTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		Student studentTi = new Student("Timas", 5000);
		Student studentJa = new Student("James", 13000);
		Student studentEd = new Student("Edward", 20000);
		
		Bus bus100 = new Bus(100);
		Bus bus705 = new Bus(705);
		Bus bus1001 = new Bus(1001);
		
		Subway subwayGreen = new Subway(1);
		Subway subwayBlue = new Subway(3);
		
		Taxi taxi6994 = new Taxi(6994, scan.nextInt());
		
		studentJa.takeBus(bus1001);
		studentJa.takeBus(bus705);
		studentJa.takeSubway(subwayGreen);
		studentTi.takeSubway(subwayBlue);
		studentEd.takeTaxi(taxi6994);
		
		studentJa.showInfo();
		studentTi.showInfo();
		studentEd.showInfo();
		
		bus100.showBusInfo();
		bus705.showBusInfo();
		bus1001.showBusInfo();
		
		subwayBlue.showSubwayInfo();
		subwayGreen.showSubwayInfo();
		
		taxi6994.showTaxiInfo();

	}

}
