import java.util.Scanner; 
public class Square1{
public static void main(String[] args){
	Scanner input = new Scanner (System.in);
	
	System.out.print("Enter number: ");
	int number = input.nextInt();

	int Square = number * number;
	
	if (number > 100)
	   System.out.printf("Number  %d > %d%n", number, 100);
	
	if (Square > 100)
	   System.out.printf("Square  %d > %d%n", Square, 100);
	
	if (number < 100)
	   System.out.printf("Number  %d < %d%n", number, 100);

	if (Square < 100)
	   System.out.printf("Square  %d < %d%n", Square, 100);

	if (number == 100)
	   System.out.printf("Number  %d == %d%n", number, 100);

	if (Square == 100)
	   System.out.printf("Square  %d == %d%n", number, 100);
	
	if (number != 100)
	   System.out.printf("Number  %d != %d%n", number, 100);
	
	if (Square != 100)
	   System.out.printf("Square  %d != %d%n", Square, 100);

    }

}











	
	
   
