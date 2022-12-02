import java.util.Scanner;

public class subprogwork {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);



	System.out.println("What's the first string");
	String One = in.next();

	

	System.out.println("What's the second string");
		String Two = in.next();
	System.out.println(combine(One,Two));

	


	}

	

	public static String combine(String one, String two) {

		String Tres = "";

	for (int i = 0; i < Math.max(one.length(),two.length()); i++) {

	if (i < one.length()) {
		Tres += one.charAt(i);

			}

		Tres += two.charAt(i);

		}

	

return Tres;
	}

}
