import java.util.Scanner;

public class YabaPizza {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

System.out.print("Welcome to Iya Abimbola Pizza joint, Yaba. \nWe sell the best and most afforable pizza's in town");
int orderNumber = -1;

while(orderNumber < 0){
System.out.println("\nEnter the number of people you would like to order for(Each person for 1 slice of pizza): ");
orderNumber = input.nextInt();
	if (orderNumber < 0){
		System.out.print("Invalid Input, Enter a valid number you would like to order for: ");
		}
	}
System.out.println("Below is the information of the type of Pizza we have and the price information, look through carefully");
System.out.println("Pizza Type\tNumber of Slices\tPrice Per Box");
System.out.println("1. Sapa size\t\t4\t\t2,000");
System.out.println("2. Small Money\t\t6\t\t2,400");
System.out.println("3. Big boys\t\t8\t\t3,000");
System.out.println("4. Odogwu \t\t12\t\t4,200");

System.out.println();
int orderType = -1;
while(orderType < 0){
System.out.print("Select a number with the pizza type you would like to order: ");
orderType = input.nextInt();
	if(orderType < 0 || orderType > 4){
		System.out.print("Invalid Order Type, Enter a valid number in the chart above: ");
		}
	}
int sapaSize = 4;
double sapaSizePrice = 2000;
int smallMoney = 6;
double smallMoneyPrice = 2400;
int bigBoys = 8;
double bigBoysPrice = 3000;
int odogwu = 12;
double odogwuPrice = 4200;
int numberOfBoxes=0;
int leftOvers = 0;
double price = 0;

if (orderType == 1){
System.out.println("You ordered for the Sapa size pizza 2,000");
numberOfBoxes = Math.round((float) orderNumber / sapaSize);
leftOvers = (numberOfBoxes * sapaSize)  - orderNumber;
price = sapaSizePrice * numberOfBoxes;
System.out.println("Number of boxes of pizza to buy: " + numberOfBoxes + " boxes");
System.out.println("Number of left over slices after serving: " + leftOvers + " slices");
System.out.println("Price = " + price);

}else if (orderType == 2){
System.out.println("You ordered for the Small money pizza costing 2,400");
numberOfBoxes = Math.round((float) orderNumber / smallMoney);
leftOvers = (numberOfBoxes * smallMoney)  - orderNumber;
price = smallMoneyPrice * numberOfBoxes;
System.out.println("Number of boxes of pizza to buy: " + numberOfBoxes + " boxes");
System.out.println("Number of left over slices after serving: " + leftOvers + " slices");
System.out.println("Price = " + price);

}else if (orderType == 3){
System.out.println("You ordered for the Big boys pizza costing 3,000");
numberOfBoxes = Math.round((float) orderNumber / bigBoys);
leftOvers = (numberOfBoxes * bigBoys)  - orderNumber;
price = bigBoysPrice * numberOfBoxes;
System.out.println("Number of boxes of pizza to buy: " + numberOfBoxes + " boxes");
System.out.println("Number of left over slices after serving: " + leftOvers + " slices");
System.out.println("Price = " + price);

}else if (orderType == 4){
System.out.println("You ordered for the Odogwu pizza type costing 4,200");
numberOfBoxes = Math.round((float) orderNumber / odogwu);
leftOvers = (numberOfBoxes * odogwu)  - orderNumber;
price = odogwuPrice * numberOfBoxes;
System.out.println("Number of boxes of pizza to buy: " + numberOfBoxes + " boxes");
System.out.println("Number of left over slices after serving: " + leftOvers + " slices");
System.out.println("Price = " + price);
}


	}
}

