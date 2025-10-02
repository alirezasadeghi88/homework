import java.util.Scanner;

public class Book {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("name : ");
		String name = input.next();
		
		System.out.print("color : ");
		String color = input.next();
		
		System.out.print("size : ");
		int size = input.nextInt();
		
		System.out.print("type : ");
		String type = input.next();
		
		System.out.print("weight : ");
		double weight = input.nextDouble();
		
		System.out.println(name);
	}
}	
		