import java.util.Arrays;
import java.util.Scanner;
	public class ThunderDrill4 {
		public static void main(String[] args){

	
		Scanner input = new Scanner(System.in);

		int[] array = new int [10];

		
		int counter = 0;
		int result = 0;

		for(counter = 0; counter < 10; counter++) {
		System.out.print("Enter a number");
		array[counter] = input.nextInt();
		
		}
		
		for(counter = 0; counter < 10; counter++) {
		OddIndex number = OddIndex(array[counter]);
		result = number;
		}
	}
}