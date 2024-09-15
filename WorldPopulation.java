import java.util.Scanner;
public class WorldPopulation{
public static void main(String[] args){
    Scanner input = new Scanner (System.in);
 
	System.out.print("Enter current world population: ");
	long population = input.nextLong();

	System.out.print("Enter yearly growth rate: ");
	double rate = input.nextDouble();

	double Year1 = Math.pow(1 + rate, 1) * population;;
	double Year2 = Math.pow(1 + rate, 2) * population;
	double Year3 = Math.pow(1 + rate, 3) * population;
	double Year4 = Math.pow(1 + rate, 4) * population;
	double Year5 = Math.pow(1 + rate, 5) * population;

	System.out.printf("The World population after year one  is %f%n", Year1); 
	System.out.printf("The World population after year two is %f%n", Year2);
	System.out.printf("The World population after year three is %f%n", Year3);
	System.out.printf("The World population after year four is %f%n", Year4);
	System.out.printf("The World population after year five is %f%n", Year5);

	}

}