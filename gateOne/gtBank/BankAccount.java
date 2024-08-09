 import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class BankAccount{
public static void main(String[] args){

	Scanner scanner = new Scanner (System.in);
	Random random = new Random();

	ArrayList<String> accountName = new ArrayList<String>();
	ArrayList<String> accountPin = new ArrayList<String>();
	ArrayList<Double> accountBalance = new ArrayList<Double>();
	ArrayList<Long> accountNumber = new ArrayList<Long>();

	

	int appOpening = 1;


	
		
	while(appOpening != 8){
	String message = """
			1. Create an account.
			2. Deposit money.
			3. Withdraw money.
			4. Check account balance.
			5. Transfer from one account to another.
			6. Change pin.
			7. Close account.
			8. Exit. """;

	System.out.print(message+"\n");
	appOpening = scanner.nextInt();
		


	
	if(appOpening == 1){

		Long number = random.nextLong(1000000000L, 9999999999L);
		accountNumber.add(number);

		System.out.print("\nEnter your first name and last name: ");
		accountName.add(scanner.next()); 
		System.out.print("\nCreate your pin: ");
		accountPin.add(scanner.next());

		System.out.print("\nAccount created successfully.");

		System.out.print("\n"+number+"\nThis is your account number.\n");
		
		System.out.print("\nEnter amount to deposit: ");
		accountBalance.add(scanner.nextDouble());


		System.out.print("Enter 1 to go back to main menu or 0 to end: ");
		appOpening = scanner.nextInt();
			
	}


	if(appOpening == 2){
			
			System.out.print("\n Enter the receiver account number");
			Long receiver = scanner.nextLong();
			
			System.out.print("\nHow much do you want to deposit: ");
			double account = scanner.nextLong();

			int index = accountNumber.indexOf(receiver);
			if(index != -1){
			double count = accountBalance.get(index);
			double counter = count + account;
			accountBalance.set(index, counter);
			System.out.print("\nTransfer successful.\n");
					}
			
			else 
			System.out.print("Account number does exits.");

					}

	if(appOpening == 3){
			System.out.print("\nEnter your account number to withdraw: ");
			Long withdrawalAccount = scanner.nextLong();

			
			int index = accountNumber.indexOf(withdrawalAccount);
			//Long compareAccountNumber = accountNumber.get(index); 
			//if (compareAccountNumber == withdrawalAccount){
			if(index != -1){
			  System.out.print("\nEnter amount to withdraw:  \n");
			  double withdrawAmount = scanner.nextDouble();

				double count = accountBalance.get(index);
				if(count >= withdrawAmount){
					System.out.print("Enter your PIN: ");
					String withdrawalPin = scanner.next();

					int counterPin = accountPin.indexOf(withdrawalPin);
					 if(counterPin != -1){
				        double result =  count - withdrawAmount;
					accountBalance.set(index, result);
					System.out.print("\n Withdraw Successful");
					}
				        else
					System.out.print("\nWrong Pin!!! \n");
					}
				  else 
				  System.out.print("\nInsufficient Funds....\n");
				}
			else 
			    System.out.print("\nInvalid account number....\n");
			
			}


	if(appOpening == 4){
				System.out.print("\nEnter your account number to check balance: \n");
				Long balanceCheck = scanner.nextLong();

				int index = accountNumber.indexOf(balanceCheck);
				if (index != -1){
					System.out.print("Enter your account pin: ");
					String balancePin = scanner.next();
					
					int balancePinCheck = accountPin.indexOf(balancePin);
					if (balancePinCheck != -1){
					double result = accountBalance.get(index);
					System.out.print(result+"\n");
					}
					else
					 System.out.print("\nYou entered a wrong pin.\n");
					}
				else 
				  System.out.print("\nInvalid account number.\n");
						
					}
					

	if(appOpening == 5){
				System.out.print("\nEnter your account number: \n");
				Long transferAccount = scanner.nextLong();

				int index = accountNumber.indexOf(transferAccount);
				if(index != -1){
					System.out.print("\nEnter your pin to login to your account: \n");
					String loginPin = scanner.next();
					
					int count = accountPin.indexOf(loginPin);
					if(count != -1){
					System.out.print("\nEnter account number: ");
					Long destinationAccount = scanner.nextLong();
					System.out.print("Enter amount: ");
					double transferAmount = scanner.nextDouble();
					System.out.print("Enter PIN: ");
					String pin = scanner.next();

					int counter = accountPin.indexOf(pin);
					if(counter == count){
						System.out.print("\nTransfer successful.........");	
						}
					else 
						System.out.print("\nWrong PIN.");
							}
					else 
						System.out.print("\nWrong PIN");
					}
					else 
						System.out.print("\nAccount number not valid.");

					}


	if(appOpening == 6){
				System.out.print("\nEnter your account number: ");
				Long changePinAccount = scanner.nextLong();
				
				int index = accountNumber.indexOf(changePinAccount);
				if(index != -1){
					String name = accountName.get(index);
					System.out.print("\nIs "+name+" your name (Yes or No)\n");
					String response = scanner.next();
					if (response.equalsIgnoreCase("Yes")){
						System.out.print("\nEnter your old PIN: ");
						String oldPin = scanner.next();
						int count = accountPin.indexOf(oldPin);
						 	if(count != -1){
								System.out.print("\nEnter your new PIN: ");
								String newPin = scanner.next();
								accountPin.remove(count);
								accountPin.set(count, newPin);
								System.out.print("\nNew PIN created successfully....");
									}
							else 
							System.out.print("\nYou've entered a wrong PIN");
						} 
						
							else 
							System.out.print("\nYou have entered a wrong account number.\n");
						}				

							else 
							System.out.print("\nYou have entered a wrong account number.\n");
				}


	
	if(appOpening == 7){
		System.out.print("\n Kindly enter your account number: ");
		Long temporaryAccountNumber = scanner.nextLong();

		
			int index = accountNumber.indexOf(temporaryAccountNumber);
				if(index != -1){
				accountBalance.remove(index);
				accountPin.remove(index);
				accountName.remove(index);
				accountNumber.remove(index);
				System.out.print("\nAccount closed successfully.\n");
 				}	
		
				
		else
		System.out.print("This "+temporaryAccountNumber+" does not exit in our database.\n Thanks for banking with us.");
			
			}


	






	}


	}
}


   




	