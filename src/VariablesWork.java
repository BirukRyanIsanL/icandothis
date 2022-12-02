import java.util.Scanner;
public class VariablesWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
	System.out.println("you may enter an integer");
		int one = in.nextInt();
		
	System.out.println("you may enter a double");
		double two  = in.nextDouble();
		
	System.out.println("you may enter a string");
		String three = in.nextLine();
		
		in.close();
	}
}
