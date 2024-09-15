import java.util.Random;
public class Protest{

public static void main(String[] args){


	Random random = new Random();

	int userRandom = random.nextInt(1, 6);

	if(userRandom == 1)System.out.print("Massive investment in public works and industrialisation will help employ Nigeria’s teeming youths.");

	else if (userRandom == 2)System.out.print(" Massive shake-up in the Nigerian judiciary to remove cabals of corrupt generations of judges and judicial officers that continue denying everyday citizens access to real justice.");
	
	else if (userRandom == 3)System.out.print("Restructuring of Nigeria to accommodate Nigeria’s diversity, resource control, decentralisation and regional development.");
	
	else if(userRandom == 4)System.out.print("Renationalise publicly owned enterprises sold to government officials and cronies.");
		
	else if (userRandom == 5)System.out.print("Pay Nigerian Workers a minimum wage of nothing less than N250,000 monthly.");

	else System.out.print(" Invest heavily in education and give Nigerian students grants, not loans. Aggressively pursue free and compulsory education for children across Nigeria.");
				}



			} 