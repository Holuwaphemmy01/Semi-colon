import java.util.Scanner;
public class Calculator{
  public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	int number;
	int sum;
	int value1;
	int value2;
	int value3; 
	int value4; 


	System.out.print("Enter a number between 0 and 1000: ");
	number = input.nextInt();
	value1 = number % 10;
	value2 = number / 10;
	value3 = value2 % 10; 
	value4 = value2 / 10;	
	
	sum = value1 + value3 + value4;
	System.out.printf("sum = %d", sum);
	}
}