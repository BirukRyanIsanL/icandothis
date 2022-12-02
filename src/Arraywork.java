 
import java.util.Scanner;
public class Arraywork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("please choose the size of an array");
		int size = in.nextInt();
		
		double[] temp = new double [size];
		
		System.out.println(" please choose the doubles");
		int n = temp.length;
		int b = 0;
		
		for (int i=0;i<n;i++) {
				double a = in.nextDouble();
				temp[b]=a;
				b++;	
		}
		
		double max = 0;
		
		for (int i=0;i<n-1;i++) {
			
			if (temp[i]>=temp[i+1]) {
				max = temp[i];
			}
			else {
				max = temp[i+1];
			}
		}
		
		double min = 0;
		
		for (int i=0;i<n-1;i++) {
			
			if (temp[i]<=temp[i+1]) {
				min = temp[i];
			}
			else {
				min = temp[i+1];
			}
		}
		
		double average = 0;
		
		for (int i=0;i<n-1;i++) {
			average = temp[i]+temp[i+1];
			
		}
		
		
		
		System.out.println("your maximum number is: "+max);
		System.out.println("your minimum number is: "+min);
		System.out.println("your average number is: "+average);

		
		in.close();
		
	}

}
