import java.util.Scanner;
public class Divisible{
public static void main(String[] args){
	Scanner input = new Scanner (System.in);

	System.out.print("Enter number: ");
	int number1 = input.nextInt();

	if (number1 % 3 == 0) {
	  System.out.printf("%d is divisible by 3", number1);
	}
	else{
           System.out.printf("%d is not divisible by 3", number1);
	}
   }
}

