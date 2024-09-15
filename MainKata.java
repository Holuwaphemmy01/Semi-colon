import java.util.Scanner;
public class MainKata{
public static void main (String [] args){

	Scanner input = new Scanner(System.in);
	
	System.out.println();
	String message = """
			Welcome to Akinzo Math School.

			This what we offer below:
 
			1. Even Number.
			2. Prime Number.
			3. Subtraction.
			4. Division.
			5. Factors.
			6. Square.
			7. Palindrome Number.
			8. Factorial.
					""";
	System.out.println(message);
	System.out.print("Kindly enter a number above to continue: ");
	int number1 = input.nextInt();
	
	switch (number1){

		case 1: System.out.print("Enter a number: ");
			int number = input.nextInt();
			boolean evenOdd = Kata.evenOdd(number);
			System.out.println(evenOdd);
				
			break;
		case 2: System.out.print("Enter a number to check if it is prime number: ");
			int number2 = input.nextInt();

		        boolean primeNumber = Kata.primeNumber(number2);
			System.out.print(primeNumber);
			break;

		case 3: System.out.print("Enter first number: ");
			int firstnumber = input.nextInt();

			System.out.print("Enter second number: ");
			int secondnumber = input.nextInt();

	
			int substract = Kata.subtract(firstnumber, secondnumber);
	
			System.out.print(substract);
			break; 
		
		case 4: 
			float divide;

			System.out.print("Enter first number: ");
			 firstnumber = input.nextInt();

			System.out.print("Enter second number: ");   
			 secondnumber = input.nextInt();
	
	 		float divideInteger = Kata.divideInteger(firstnumber, secondnumber);
			System.out.printf("%.2f", divideInteger);
			break;

		case 5: int count = 0;

			System.out.print("Enter a number to check for factors : ");
			number = input.nextInt();
	 
			int factorsOf = Kata.factorsOf(number);


			System.out.printf("%d", factorsOf);
			break; 

		case 6: System.out.print("Enter a number: ");
			 number = input.nextInt();

			boolean square = Kata.square(number);
			System.out.print(square);


		case 7: System.out.print("Enter a five digit number: ");
			int num = input.nextInt();

			boolean palindrome = Kata.palindrome(num);
			System.out.print(palindrome);



		default: 
			break;

			}

	





}

}