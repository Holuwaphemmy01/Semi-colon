import java.util.Scanner;
public class Credit1{
public static void main(String[] args){
	Scanner input = new Scanner (System.in);
	
	System.out.print("Enter account number: ");
	int account = input.nextInt();

	System.out.print("Balance at the beginning of the month = ");
	int Balance = input.nextInt(); 

	System.out.print("Total items charged by the customer for the month = ");
	int items = input.nextInt();

	System.out.print("Total credit for the month = ");
	int credit = input.nextInt();

	System.out.print("Allowed credit limit = ");
	int limit = input.nextInt();

	int newBalance = Balance + items - credit;
	 
	System.out.printf("New Balance = %d%n", newBalance);

	if (newBalance > limit){
	   System.out.print("\"Credit limit exceeded\"");
	} 

     }
   }
