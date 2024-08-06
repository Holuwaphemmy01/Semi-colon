import java.util.Scanner;
import java.util.Arrays;
public class MBTI{
public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	
	String[] extroverted = new String[5]; 
	String[] newExtroverted = new String[5];
	String[] sensing = new String[5];
	String[] newSensing = new String[5];
	

	System.out.print("What is your name: ");
	String name = scanner.nextLine();

	
	System.out.print("A. expend energy, enjoy groups\t B. conserve energy, enjoy one-on-one\n");
	extroverted[0] = scanner.nextLine();
	if (extroverted[0].equalsIgnoreCase("A")){
	newExtroverted[0] = "A. expend energy, enjoy groups";
	}

	else if(extroverted[0].equalsIgnoreCase("B")){
	 newExtroverted[0] = "B. conserve energy, enjoy one-on-one";
	}
	
	else {	
		
	{
			do{System.out.print("Expected A or B as Response\n I know this is an error, Please retry again");
		System.out.print("\nA. expend energy, enjoy groups\t B. conserve energy, enjoy one-on-one\n");
	extroverted[0] = scanner.nextLine();
	}
		while(!extroverted[0].equalsIgnoreCase("A") || !extroverted[0].equalsIgnoreCase("B"));

			}
		
	}

	
	











	}


}