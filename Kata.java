public class Kata{

public static boolean evenOdd(int number){
	
	
	if (number % 2 == 0)
		return true;
	else 
	      return false;
}

public static boolean primeNumber(int number){

	if (number == 2 || number == 3) return true;

	else if (number % 2 != 0 && number % 3 != 0) return true;

	else return false;
	}


 public static int factorsOf(int number){
	int count = 0;
	for (int digit = 2; digit <= number / 2; digit++) {
	if (number % digit == 0); 
		count++; 
		}
		return count;
	}


 public static float divideInteger (float firstnumber, float secondnumber){
		 float divide = firstnumber / secondnumber;
		 return divide;
		}
 	

public static int subtract (int firstnumber, int secondnumber){
		int subtract = 0;

		if  (firstnumber < secondnumber){
		 subtract = secondnumber - firstnumber;
		}
		  
		else if (firstnumber > secondnumber) {
	  	  subtract = firstnumber - secondnumber;
		}
		 return subtract;
		}

public static boolean palindrome (int num){
		 num = 0;

		int value1 = num % 10;
		int value2 = num / 10;
		int value3 = value2 % 10;
		int value4 = value2 / 10;
		int value5 = value4 % 10;
		int value6 = value4 / 10;
		int value7 = value6 % 10;
		int value8 = value6 / 10;

	if (value1 == value8 && value3 == value7) return true;
	else 
			return false; 
}

public static boolean square (int number){
				
			for (int num = 1; num < number; num++)
		if (number / num == num) return true;
		 
		return false;

			
}
	     
      }

	



