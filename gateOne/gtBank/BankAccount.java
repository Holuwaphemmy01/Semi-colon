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

		System.out.print("\nEnter your first name: ");
		String firstName = scanner.next();
		
		
		System.out.print("\nEnter your last name:  ");
		String lastName = scanner.next();
		String fullName = firstName + " " + lastName;
		accountName.add(fullName);
		 

		System.out.print("\nCreate your pin: ");
		accountPin.add(scanner.next());

		System.out.print("\nAccount created successfully.");

		System.out.print("\n"+number+"\nThis is your account number.\n");
		
		System.out.print("\nEnter amount to deposit: ");
		accountBalance.add(scanner.nextDouble());


		System.out.print("Enter 1 to go back to main menu or 8 to end: ");
		appOpening = scanner.nextInt();
			
	}	


	if(appOpening == 2){
			
			System.out.print("\n Enter the recipient account number: \n");
			Long receiver = scanner.nextLong();
			
			System.out.print("\nHow much do you want to deposit: \n");
			double account = scanner.nextLong();
			if(account > 0){
			
			int index = accountNumber.indexOf(receiver);
			if(index != -1){
			String recieverName = accountName.get(index);
			System.out.print("\nConfirm recipient name "+recieverName+" (Yes or No)\n");
			String confirmName = scanner.next();
			if(confirmName.equalsIgnoreCase("Yes")){

			double count = accountBalance.get(index);
			double counter = count + account;
			accountBalance.set(index, counter);
			System.out.print("\nTransfer successful.\n");
							}
			else
			System.out.print("\nWrong account number entered.\n");
			

					}
			
			else 
			System.out.print("\nAccount number does exits.\n");
			}
			else 
				System.out.print("\nInvalid Amount.");		
		
			System.out.print("Enter 1 to go back to main menu or 8 to end: \n");
		appOpening = scanner.nextInt();

					}


	if(appOpening == 3){
			System.out.print("\nEnter your account number to withdraw: ");
			Long withdrawalAccount = scanner.nextLong();

			
			int index = accountNumber.indexOf(withdrawalAccount);
			if(index != -1){
			  System.out.print("\nEnter amount to withdraw:  \n");
			  double withdrawAmount = scanner.nextDouble();

				double count = accountBalance.get(index);
				if(count >= withdrawAmount){
					System.out.print("Enter your PIN: ");
					String withdrawalPin = scanner.next();

					String counterPin = accountPin.get(index);
					 if(counterPin.equals(withdrawalPin)){
				        	double result = count - withdrawAmount;
						accountBalance.set(index, result);
						System.out.print("\n Withdraw Successful.\n");
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
				System.out.print("\nEnter your account number to login: \n");
				Long transferAccount = scanner.nextLong();
				int index = accountNumber.indexOf(transferAccount);
				scanner.nextLine();
				if (index != -1){
					System.out.print("\nEnter your account pin: \n");
					String loginPin = scanner.nextLine();
					String newLoginPin = accountPin.get(index);
					if(newLoginPin.equalsIgnoreCase(loginPin)){
						System.out.print("\nEnter 1 to transfer to gtBank or Enter 2 to transfer to other banks \n");
						int bankSelection = scanner.nextInt();
						if(bankSelection == 1){
							System.out.print("\nEnter recipient account number: ");
							Long recipientAccount = scanner.nextLong();
							scanner.nextLine();
							int counter = accountNumber.indexOf(recipientAccount);

							if(counter != -1){
								
							   System.out.print("\nEnter amount to transfer: ");	
							   double transferAmount = scanner.nextDouble();
							  double initialBalance = accountBalance.get(index);
								scanner.nextLine();
							     if(initialBalance >= transferAmount){
								   String confirmRecipientName = accountName.get(counter);
									System.out.print("\nConfirm recipient name(Yes or No)  "+confirmRecipientName+":  ");
									String confirmName = scanner.nextLine();
									scanner.nextLine();
									if(confirmName.equalsIgnoreCase("Yes")){
										System.out.print("\nEnter your account PIN to confirm transfer.\n");
										String confirmTransferPin = scanner.nextLine();
										if(confirmTransferPin.equalsIgnoreCase(newLoginPin)){
											double newBalance = initialBalance - transferAmount;
											accountBalance.set(index, newBalance);
											double recipientBalance = accountBalance.get(counter);
											double finalRecipient = recipientBalance + transferAmount;
											accountBalance.set(counter, finalRecipient);
											System.out.print("\nTransfer succeeful.\n");
											}
										else
										System.out.print("\nYou have entered a wrong PIN.\n");
										}
									else
									   System.out.println("\nCheck the account number again. ");
									}
							     else 
								System.out.print("\nInsufficient funds......\n");
									}
							else 
							   System.out.print("\nYou have entered a wrong account number.\n");
 
								}
						else{
							System.out.print("\nEnter recipient account number: ");
							Long recipientAccount = scanner.nextLong();
							System.out.print("\nEnter amount to transfer: ");	
							double transferAmount = scanner.nextDouble();
								
							  double initialBalance = accountBalance.get(index);
							if(initialBalance >= transferAmount){
								scanner.nextLine();
								System.out.print("\nEnter your account pin to confirm transfer: ");
								String confirmTransfer = scanner.nextLine();
															
								if(confirmTransfer.equalsIgnoreCase(loginPin)){
								double finalBalance = initialBalance - transferAmount;
								accountBalance.set(index, finalBalance);
								System.out.print("\nTransfer successful....\n");
								}
								else
								System.out.print("\nYou entered a wrong pin. Please try again.\n");
								}
							else
							 System.out.print("\nInsufficient funds.\n");
								}
							
							}
					else 
						System.out.print("\nWrong pin entered....\n");
					}	
				else		
				System.out.print("\nAccount number does not exist.\n"); 		
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
								//accountPin.remove(count);
								accountPin.set(count, newPin);
								System.out.print("\nNew PIN created successfully....\n");
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

			System.out.print("\nEnter your pin: \n");
			String closePin = scanner.next();
				int count = accountPin.indexOf(closePin);
				if(count != -1){
				accountBalance.remove(index);
				accountPin.remove(index);
				accountName.remove(index);
				accountNumber.remove(index);
				System.out.print("\nAccount closed successfully.\n\n");
 				}	
				else 
				System.out.print("\nInvalid password.\n\n");
				}
		else
		System.out.print("This "+temporaryAccountNumber+" does not exit in our database.\nThanks for banking with us.\n\n");
			
			}





	}


	}
}


   




	