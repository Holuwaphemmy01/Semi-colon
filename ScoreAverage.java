import java.util.*;
public class ScoreAverage{
public static void main(String[] args){

	Scanner input = new Scanner (System.in);

	System.out.print("Enter first score: ");
	int first = input.nextInt();

	System.out.print("Enter second score: ");
	int second = input.nextInt();

	System.out.print("Enter third score: ");
	int third = input.nextInt();

	System.out.print("Enter fourth score: ");
	int fourth = input.nextInt();

	System.out.print("Enter fifth score: ");
	int fifth = input.nextInt();
	
	System.out.print("Enter sixth score: ");
	int sixth = input.nextInt();

	System.out.print("Enter seventh score: ");
	int seventh = input.nextInt();
	
	System.out.print("Enter eighth score: ");
	int eighth = input.nextInt();

	System.out.print("Enter nineth score: ");
	int nineth = input.nextInt();

	System.out.print("Enter tenth score: ");
	int tenth = input.nextInt();

	int sum = first + second + third + fourth + fifth + sixth + seventh + eighth + nineth + tenth;

	double average = sum / 10;
	
	System.out.printf("%d ", sum);
	System.out.printf("%d ", average);


	}
}