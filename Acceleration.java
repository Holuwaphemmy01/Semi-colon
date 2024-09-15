import java.util.Scanner;
public class Acceleration{
   public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	  double velocity0;
	  double velocity1;
	  double time;
	  double acceleration;
	System.out.print("Enter velocity0: ");
	velocity0 = input.nextDouble();
	
	System.out.print("Enter velocity1: ");
	velocity1 = input.nextDouble();

	System.out.print("Enter time: ");
	time = input.nextDouble();

	acceleration = (velocity1 - velocity0) / time;
	
	System.out.printf("acceleration is %f", acceleration);
	}
}