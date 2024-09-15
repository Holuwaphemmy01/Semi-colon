import java.util.*;
public class Biggest{
public static void main(String[] args){
	Scanner input = new Scanner (System.in);
	int number = 0;
	int Smallest = Integer.MAX_VALUE;
	int Largest = Integer.MIN_VALUE;
	
	while (number != -1) {

	System.out.print("Enter number  or -1 to end: ");
	 number = input.nextInt();
	

	if (number == -1){
		break;
	}

	/*if (number < 0){
		break; 
	}**/
	if (number > Largest) {
	      Largest = number;
	}
	if (number < Smallest) {
	      Smallest = number;
	}
		}
	System.out.printf("Largest number = %d%n", Largest);
	System.out.printf("Smallest number = %d", Smallest);
	}
    }
