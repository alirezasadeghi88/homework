import java.util.Scanner;

public class Test2 {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("--------------------");
		System.out.println("---- Calculator ----");
		System.out.println("--------------------");
		System.out.print("Enter your number1: ");
		int number1 = input.nextInt();
		System.out.print("Enter your Opteration: ");
		String opt = input.next();
		System.out.print("Enter your number2: ");
		int number2 = input.nextInt();
		
		if(opt.equals("+")){
			System.out.println(number1 + number2);
		} else if (opt.equals("-")){
			System.out.println(number1 - number2);
		} else if (opt.equals("*")){
			System.out.println(number1 * number2);
		} else if (opt.equals("/")){
			System.out.println(number1 / number2);
		} else if (opt.equals("%")){
			System.out.println(number1 % number2);
		}	
	}
}