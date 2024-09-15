import java.util.Scanner; 
public class BodyMass{
public static void main(String[] args){
   Scanner input = new Scanner (System.in);
	System.out.print("Enter weight in kilograms(kg): ");
	int weights = input.nextInt();

	System.out.print("Enter height in meters(m): ");
	float heights = input.nextFloat();

	float Height = heights * heights;

	float BMI = weights / heights;

	System.out.printf("Your Body Mass Index is %f", BMI);
	

	}
}