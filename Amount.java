import java.util.Scanner;
public class Amount{
 public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter amount: ");
	amount = input.nextDouble();
	
	double dollars;
	double Rmb;
	double amount;
	
	dollars = 6.81 * amount;
	Rmb = amount / 6.81; 

	System.out.printf("%d", dollars); 
	System.out.printf("%d", Rmb);
	}
}