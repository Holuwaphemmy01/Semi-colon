import java.util.Scanner;
public class Triangle{
  public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
		double length;
	 	double area;
		double volume;

		System.out.print("Enter length: ");
		length = input. nextInt();
	
		area = 1.732 / 4 * (length * length);
		volume = area * length;
	
		System.out.printf("The area is = %f%n", area);
		System.out.printf("The volume is = %f%n", volume); 
		

		}
}