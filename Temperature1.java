import java.util.Scanner;
public class Temperature1 {
   public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	double amountofwater; 
	double initialtemperature;
	double finaltemperature; 
 	double energy;
	double temperature;
	
	System.out.print("Enter the amountofwater: ");
	amountofwater = input.nextDouble();
	
	System.out.print("Enter initialtemperature: ");
	initialtemperature = input.nextDouble();
	
	System.out.print("Enter finaltemperature: ");
	finaltemperature = input.nextDouble();

	
	  temperature= (finaltemperature  - initialtemperature);
	
	  energy = amountofwater * temperature * 4184;

	System.out.printf("%f", energy);	
	}}