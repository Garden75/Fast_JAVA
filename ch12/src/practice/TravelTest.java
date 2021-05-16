package practice;

import java.util.ArrayList;

public class TravelTest {
	
	public static void main(String[] args) {
		
		TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
		TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100);
		TravelCustomer customerHong = new TravelCustomer("홍길동", 13, 25);
		
		ArrayList<TravelCustomer> ctmList = new ArrayList<TravelCustomer>();
		ctmList.add(customerLee);
		ctmList.add(customerKim);
		ctmList.add(customerHong);
		
		System.out.println(ctmList);
		
		//1. 고객 명단 출력하기
		System.out.println("[고객 명단]");
		ctmList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		
		//2. 총 금액 구하기
		int total = ctmList.stream().mapToInt(p -> p.getPrice()).sum();
		System.out.println("총 합계 = " + total);
		
		//3. 고객 명단 오름차순으로 정렬하기
		System.out.println("[20세 이상 고객 명단]");
		ctmList.stream().filter(a -> a.getAge() >= 20).map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));
		
	}

}
