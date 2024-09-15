import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class BankAppFunction{


	 ArrayList<String> accountName = new ArrayList<String>();
	 ArrayList<String> accountPin = new ArrayList<String>();
	 ArrayList<Integer> accountBalance = new ArrayList<Integer>();
	ArrayList<Long> accountNumber = new ArrayList<Long>();

	private Long number;
	
	public void  optionOne(int appOpening){

		Scanner scanner = new Scanner (System.in);
		Random random = new Random();

		System.out.print("\nEnter your first name and last name: ");
		accountName.add(scanner.next()); 
		System.out.print("\nCreate your pin: ");
		accountPin.add(scanner.next());

		System.out.print("\nAccount created successfully.");
		
		Long number = random.nextLong(1000000000L, 9999999999L);
		accountNumber.add(number);

	}
	public static Long optionOneResult(){
		return number; 
			}				



	public void optionTwo(int appOpening){

	Scanner scanner = new Scanner (System.in);

	System.out.print("Why did you want to close your account: ");
		System.out.print("\n Kindly enter your account number: ");
		Long temporaryAccountNumber = scanner.nextLong();
		int count = 0;
		for(int index = 0; index < accountBalance.size(); index++){
		
			if (temporaryAccountNumber == accountNumber.get(index)){
				accountBalance.remove(index);
				accountPin.remove(index);
				accountName.remove(index);
				accountNumber.remove(index);
				System.out.print("\nAccount closed successfully....");
				count += 1;
						}
				}
		
		if(count == 0)
		System.out.print("This "+temporaryAccountNumber+" does not exit in our database.\n Thanks for banking with us.");

			}

		












		}