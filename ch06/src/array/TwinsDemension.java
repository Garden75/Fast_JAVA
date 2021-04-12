package array;

public class TwinsDemension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] array = { {1,2,3}, {4,5,6,7}};
		
		System.out.println(array.length);
		System.out.println(array[0].length);
		System.out.println(array[1].length);
		
		for(int i = 0; i <array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " " );
			}
			
			System.out.println(); //Çà ±¸ºÐ
		}
	}

}
