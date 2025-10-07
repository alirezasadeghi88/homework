//import java.lang.String;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		if(number > 0) {
			System.out.println("number is +");
		} else if(number == 0){
			System.out.println(" number is equls ziro");
		} else {
			System.out.println("number is -");
		}
	}

	
}