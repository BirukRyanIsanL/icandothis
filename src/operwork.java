import java.util.Scanner;

public class operwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("to all the rats and mice, you may pick your number");
		
		int first = in.nextInt();

		int number = first;
		
		number = number -1;
		System.out.println(first+" "+"-"+" "+1+" "+"="+" "+number);
		
		number = number *3;
		System.out.println();
		
		number = number + 12;
		number = number/3;
		number = number +5;
		number = number - first;
		
		System.out.println("Your result is: "+number);
		
	
		in.close();
	}

	
}
