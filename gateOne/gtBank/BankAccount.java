import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class BankAccount{
public static void main(String[] args){

	Scanner scanner = new Scanner (System.in);
	Random random = new Random();

	ArrayList<String> accountName = new ArrayList<String>();
	ArrayList<String> accountPin = new ArrayList<String>();
	ArrayList<Integer> accountBalance = new ArrayList<Integer>();
	ArrayList<Long> accountNumber = new ArrayList<Long>();

	

	int appOpening = 1;


	
		Long number = random.nextLong(1000000000L, 9999999999L);
		accountNumber.add(number);

	while(appOpening != 0){
	String message = """
			1. Create an account.
			2. Close account.
			3. Deposit money.
			4. Withdraw money.
			5. Check account balance.
			6. Transfer from one account to another.
			7. Change pin.""";

	System.out.print(message+"\n");
	appOpening = scanner.nextInt();
		


	
	if(appOpening == 1){

		System.out.print("\nEnter your first name and last name: ");
		accountName.add(scanner.next()); 
		System.out.print("\nCreate your pin: ");
		accountPin.add(scanner.next());

		System.out.print("\nAccount created successfully.");

		System.out.print("\n"+number+"\nThis is your account number.\n");

		System.out.print("Enter 1 to go back to main menu or 0 to end: ");
		appOpening = scanner.nextInt();
			
	}

	if(appOpening == 2){
		System.out.print("\n Kindly enter your account number: ");
		Long temporaryAccountNumber = scanner.nextLong();

		System.out.print(temporaryAccountNumber);
		int count = 0;
		for(int index = 0; index < accountNumber.size(); index++){
		
			if (accountNumber.get(index) == temporaryAccountNumber){
				//accountBalance.remove(index);
				accountPin.remove(index);
				accountName.remove(index);
				//accountNumber.remove(index);
						//System.out.println(accountNumber.get(index));
						//System.out.println(accountName.get(index));

				count += 1;
				System.out.print("\nAccount closed successfully.\n");
						}
				}
		if(count == 0)
		System.out.print("This "+temporaryAccountNumber+" does not exit in our database.\n Thanks for banking with us.");


			
			}
	
	}


	}
}


   




	