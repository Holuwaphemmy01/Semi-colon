import java.util.*;
public class DoWhile {
	public static void main(String[] args){
	Scanner input = new Scanner (System.in);

	   int first = 0;
	   int second = 0;
	   int Total = first + second;
	   String exit = "Stop";
	   String Continue;

	do {
	   System.out.print("Enter first number: ");
	   first = input.nextInt();
	
	   System.out.print("Enter second number: ");
	   second = input.nextInt();
	
	   Total = first + second;
	
           System.out.printf("%nTotal = %d%n", Total);
		
	  System.out.print("Enter 0 to continue or -1 to end: ");
	  int numbers = input.nextInt();
	
	  if (numbers == -1) {
		break;
	 }	  
	 
	 if (numbers == 0) {
		continue;
	}
	
	}
	while (true);
		
}
 }