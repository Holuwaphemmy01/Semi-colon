import java.util.Scanner;
public class Circle{
   public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
	
	double perimeter;
	double area;
	double k;
	double radius;
	System.out.print("Enter area: ");
	area = input.nextDouble();

	System.out.print("Enter perimeter: ");
	perimeter = input.nextDouble();
	
	  radius = 6.5;
	
	  k = 3.14159; 
		
	perimeter =(2 * radius * k);
	System.out.printf(" perimeter %f:", perimeter);
	
	area =(radius * radius * 3.14159);
	System.out.printf("area %f:", area);

	}
}
