import java.util.Scanner;
import java.util.Arrays;
public class MBTI{
public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	
	String[] extroverted = new String[5]; 
	String[] newExtroverted = new String[5];
	String[] sensing = new String[5];
	String[] newSensing = new String[5];
	String[] thinking = new String[5];
	String[] newThinking = new String[5];
	String[] judging = new String[5];
	String[] newJudging = new String[5];	

	System.out.print("What is your name: ");
	String name = scanner.nextLine();

	
	System.out.print("1. A. expend energy, enjoy groups\t B. conserve energy, enjoy one-on-one\n");
	extroverted[0] = scanner.nextLine();
	if (extroverted[0].equalsIgnoreCase("A")){
	newExtroverted[0] = "A. expend energy, enjoy groups";
	}

	 else if(extroverted[0].equalsIgnoreCase("B")){
	 newExtroverted[0] = "B. conserve energy, enjoy one-on-one";
	}
	
	
	else
	    System.out.print("Expected A or B as Response\n I know this is an error, Please retry again");
		

			
	System.out.print("\n2. A. Interpret literally, \t B. look for meaning and possibilities\n");
	sensing[0] = scanner.nextLine();

	if (sensing[0].equalsIgnoreCase("A")){
		newSensing[0] = "A. Interpret literally";
	}
	
	else if(sensing[0].equalsIgnoreCase("B")){
		newSensing[0] = "B. look for meaning and possibilities";
	}
	else
	    System.out.print("Expected A or B as Response\n I know this is an error, Please retry again");
			
			

	System.out.print("\n3. A. logical, thinking, questioning\tB. empathetic, feeling, accomodating\n");
	thinking[0] = scanner.nextLine();

	if(thinking[0].equalsIgnoreCase("A")){
		newThinking[0] = "A. logical, thinking, questioning";
	}
	
	else if(thinking[0].equalsIgnoreCase("B")){
		newThinking[0] = "B. empathetic, feeling, accommodating";
	}

	else
	    System.out.print("Expected A or B as Response\n I know this is an error, Please retry again");
	
	
	System.out.print("\n4. A. organized, orderly\tB. flexible, adaptable");
	judging[0] = scanner.nextLine();

	if(judging[0].equalsIgnoreCase("A")){
		newJudging[0] = "A. organized, orderly";
	}
	else if (judging[0].equalsIgnoreCase("B")){
	     newJudging[0] = "B. flexible, adaptable";
	}

	else
	    System.out.print("Expected A or B as Response\n I know this is an error, Please retry again");


	System.out.print("\n5. A. more outgoing, think out loud \tB. more reserved, think to yourself");
	extroverted[1] = scanner.nextLine();

	if(extroverted[1].equalsIgnoreCase("A")){
		newExtroverted[1] = "A. more outgoing, think out loud";
	}
	
	else if(extroverted[1].equalsIgnoreCase("B")){
		newExtroverted[1] = "B. more reserved, think to yourself";
	}

	else
	    System.out.print("Expected A or B as Response\n I know this is an error, Please retry again");



	System.out.print("\n6. A. practical, realistic, experiential \tB. imaginative, innovative, theoretical");
	sensing[1] = scanner.nextLine();

	if(sensing[1].equalsIgnoreCase("A")){
		newSensing[1] = "A. Practical, realistic, experiential";
	}
	else if (sensing[1].equalsIgnoreCase("B")){
		newSensing[1] = "B. imaginative, innovative, theoretical";	}

	else
	    System.out.print("Expected A or B as Response\n I know this is an error, Please retry again");



	System.out.print("\n7. A.candid, straight forward, frank \t B. tactful, kind, encouraging");
	thinking[1] = scanner.nextLine();

	if(thinking[1].equalsIgnoreCase("A")){
		newThinking[1] = "A. candid, straight forward, frank";
	}

	else if(thinking[1].equalsIgnoreCase("B")){
		newThinking[1] = "B. tactful, kind, encouraging";
	}

	else
	    System.out.print("Expected A or B as Response\n I know this is an error, Please retry again");


	




































	}


}