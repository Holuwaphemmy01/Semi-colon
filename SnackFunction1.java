public class SnackFunction1{
public static int ridersWage(int number){
		int BasePay = 5000; 
		int AmountPerParcel = 0;
	
		if (number >= 70) AmountPerParcel = 500;
		else if (number >= 60 && number <= 69) AmountPerParcel = 250;
		else if (number >= 50 && number <= 59) AmountPerParcel = 200;
		else if (number < 50) AmountPerParcel = 160;
		
		
	int result = number * AmountPerParcel + BasePay; 
	System.out.printf("Riders pay = %d", result);
	return result;
}

}