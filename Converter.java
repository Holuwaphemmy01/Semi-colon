import java.util.Scanner;
public class Converter{
 public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	double dollars;
	double Rmb;
	double amount;  


	System.out.print("Enter amount in dollars: ");
	dollars = input.nextDouble();

	Rmb = dollars * 6.81;
	
	System.out.printf("The price for Rmb is %f%n",Rmb);

	System.out.print("Enter amount in Rmb: ");
	Rmb = input.nextDouble();	

	dollars = Rmb / 6.81;

	System.out.printf("The price for dollars is %f%n", dollars); 
		
	}
}