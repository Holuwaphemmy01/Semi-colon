import java.util.Scanner;

   public class ConvertP  {
	public static void main(String[] args) {

        // create a scanner instance and assign it to a variable.
	Scanner input = new Scanner(System.in);

	// Ask user for a number in pounds:.
	System.out.print("Enter a number in pounds: "); 

	// Assign user input to variable pounds.
	double pounds = input.nextDouble();

	// Multiply pounds with 0.454.
	double convertP = pounds * 0.454;
	
	// Print out convertP.
	System.out.printf("%.3f", convertP);
	

	}
}