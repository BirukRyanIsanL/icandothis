
import java.util.Scanner;
public class selectionwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		System.out.println(" please put your final salary, it will give you final amount of tax $ ");
		int number = in.nextInt();
		double tax = 0;
		double remainder = 0;
		
			double tax15=0;
			double tax205=0;
			double tax26=0;
			double tax29=0;
			double tax33=0;
		
		if (number <=49020) {
		tax15 = number * 0.15;
		remainder = number-tax15;
		
			if (remainder >49020 && remainder <=98040) {
			tax205 = remainder * 0.205;
			
			}
			
			else if (remainder >49020 && remainder >98940) {
				
				
			}
			
			
		}
		
		
		tax = tax15 + tax205+tax26+tax29+tax33;
		System.out.println(tax);
		System.out.println("this price is final i dont care if you cant afford it");
		in.close();
		
	}

}
