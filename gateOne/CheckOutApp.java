import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
import java.util.Scanner;
import java.util.ArrayList;
public class CheckOutApp{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

	ArrayList<String> goods = new ArrayList<String>();
	ArrayList<Double> pieces = new ArrayList<Double>();
	ArrayList<Double> unit = new ArrayList<Double>();
	ArrayList<Double> total = new ArrayList<Double>();
	
	LocalDateTime now = LocalDateTime.now();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	String formattedNow = now.format(formatter);

	System.out.print("What is the customer's name: ");
	String customersName = scanner.nextLine();

	String itemsList = "Yes";
	
	while(itemsList.equalsIgnoreCase("Yes")){

	System.out.print("What did the user buy? ");
	goods.add(scanner.nextLine());

	
	System.out.print("How many pieces? ");
	pieces.add(scanner.nextDouble());
	
	scanner.nextLine();

	System.out.print("How much per unit: ");
	unit.add(scanner.nextDouble());
				
	scanner.nextLine();

	System.out.print("Did you want to add more items: ");
	itemsList = scanner.nextLine();


	}


	System.out.print("What is the cashier name: ");
	String cashier = scanner.nextLine();
	
	System.out.println();

	System.out.print("How much discount will the customer get? ");
	int discount = scanner.nextInt();

	for(int index = 0; index < goods.size(); index++){
		double count = 0;
		count = unit.get(index) * pieces.get(index);
		total.add(count);

					}
	double sum = 0;
	for(int index = 0; index < total.size(); index++){

		sum += total.get(index);

				}

 	double discountRate = (sum / 100) * discount; 
	double vat = (sum / 100) * 17.50;
	double billTotal = (sum - discountRate) - vat;



	System.out.println();
	for (int index = 0; index < 55; index++){
	System.out.print("=");

	}

	
	System.out.print("\nSEMICOLON STORES\nMAIN BRANCH\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.\nTEL: 03293828343.");
	System.out.print("\nDate: "+formattedNow);

	System.out.printf("\nCashier Name: %7s\nCustomer Name: %5s", cashier, customersName);

	System.out.println();


	System.out.printf("%n%s%10s%10s%20s", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");

	for (int index = 0; index < goods.size(); index++){
		System.out.printf("%n%s%9.0f%12.2f%17.2f", goods.get(index), pieces.get(index), unit.get(index), total.get(index));

					}
	System.out.println();
	System.out.printf("%n%n%15s%16.2f%n%15s%16.2f%n%15s%16.2f%n", "Sub Total: ", sum, "Discount: ", discountRate, "VAT @ 17.50%: ", vat);

	for(int index = 0; index < 55; index++){
		System.out.print("-");
		}

	System.out.print("\nBill Total: "+billTotal);
	System.out.println();
	for (int index = 0; index < 55; index++){
	System.out.print("=");
		}
	System.out.println();
	System.out.print("\tTHIS IS NOT A RECIEPT KINDLY PAY "+billTotal);
	System.out.println();


	for (int index = 0; index < 55; index++){
	System.out.print("=");
		}

	double finalPayment;
	System.out.print("\nHow much did the customer give to you? ");
	double payment = scanner.nextDouble();
	if(payment >= billTotal){
	 double balance = payment - billTotal;
		System.out.print("\nSEMICOLON STORES\nMAIN BRANCH\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.\nTEL: 03293828343.");
	System.out.print("\nDate: "+formattedNow);

	System.out.printf("\nCashier Name: %7s\nCustomer Name: %5s", cashier, customersName);

	System.out.println();


	System.out.printf("%n%s%10s%10s%20s", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");

	for (int index = 0; index < goods.size(); index++){
		System.out.printf("%n%s%9.0f%12.2f%17.2f", goods.get(index), pieces.get(index), unit.get(index), total.get(index));

					}
	System.out.println();
	System.out.printf("%n%n%15s%16.2f%n%15s%16.2f%n%15s%16.2f%n", "Sub Total: ", sum, "Discount: ", discountRate, "VAT @ 17.50%: ", vat);

	for(int index = 0; index < 55; index++){
		System.out.print("-");
		}

	System.out.printf("\n\tBill Total: %.2f%n\tAmount Paid: %.2f%n\tBalance: %.2f", billTotal,payment, balance);
	System.out.println();
	for (int index = 0; index < 55; index++){
	System.out.print("=");
		}
	System.out.println();
	System.out.print("\t\tTHANKS FOR YOUR PATRONAGE\n");
	
	for (int index = 0; index < 55; index++){
	System.out.print("=");
		}
	

		}
	else 
	   System.out.print("You have insufficient funds");


	}

		} 