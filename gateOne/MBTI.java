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
	
	

	extroverted[0] = "flag";
	while(!extroverted[0].equalsIgnoreCase("A") && !extroverted[0].equalsIgnoreCase("B")){
	 
	System.out.print("1. A. expend energy, enjoy groups\t B. conserve energy, enjoy one-on-one\n");
	extroverted[0] = scanner.nextLine();
	if(!extroverted[0].equalsIgnoreCase("A") && !extroverted[0].equalsIgnoreCase("B"))
	System.out.print("Expected A or B as Response\nI know this is an error, Please retry again\n");
	
	if (extroverted[0].equalsIgnoreCase("A"))
	newExtroverted[0] = "A. expend energy, enjoy groups";
	
	if (extroverted[0].equalsIgnoreCase("B"))
	newExtroverted[0] = "B. conserve energy, enjoy one-on-one";
	
	}
		
   
		

	sensing[0] = "flag";
	while(!sensing[0].equalsIgnoreCase("A") && !sensing[0].equalsIgnoreCase("B")){
	System.out.print("\n2. A. Interpret literally, \t B. look for meaning and possibilities\n");
	sensing[0] = scanner.nextLine();
	if(!sensing[0].equalsIgnoreCase("A") && !sensing[0].equalsIgnoreCase("B"))
	     System.out.print("Expected A or B as Response\nI know this is an error, Please retry again");

	if (sensing[0].equalsIgnoreCase("A"))
		newSensing[0] = "A. Interpret literally";

	if(sensing[0].equalsIgnoreCase("B"))
		newSensing[0] = "B. look for meaning and possibilities";
	}
	
	
	
	
			
			
	thinking[0] = "flag";
	while(!thinking[0].equalsIgnoreCase("A") && !thinking[0].equalsIgnoreCase("B")){
	System.out.print("\n3. A. logical, thinking, questioning\tB. empathetic, feeling, accomodating\n");
	thinking[0] = scanner.nextLine();
	if(!thinking[0].equalsIgnoreCase("A") && !thinking[0].equalsIgnoreCase("B"))
	  System.out.print("Expected A or B as Response\nI know this is an error, Please retry again");

	if(thinking[0].equalsIgnoreCase("A"))
		newThinking[0] = "A. logical, thinking, questioning";
	
	if(thinking[0].equalsIgnoreCase("B"))
		newThinking[0] = "B. empathetic, feeling, accommodating";
	}
	

	
	judging[0] = "flag";
	while(!judging[0].equalsIgnoreCase("A") && !judging[0].equalsIgnoreCase("B")){
	System.out.print("\n4. A. organized, orderly\tB. flexible, adaptable\n");
	judging[0] = scanner.nextLine();
	if(!judging[0].equalsIgnoreCase("A") && !judging[0].equalsIgnoreCase("B"))
	System.out.print("Expected A or B as Response\n I know this is an error, Please retry again");

	if(judging[0].equalsIgnoreCase("A"))
		newJudging[0] = "A. organized, orderly";
	
	if (judging[0].equalsIgnoreCase("B"))
	     newJudging[0] = "B. flexible, adaptable";
	}

	

	
	    
	extroverted[1] = "flag";
	while(!extroverted[1].equalsIgnoreCase("A") && !extroverted[1].equalsIgnoreCase("B")){
	System.out.print("\n5. A. more outgoing, think out loud \tB. more reserved, think to yourself\n");
	extroverted[1] = scanner.nextLine();
	
	if(!extroverted[1].equalsIgnoreCase("A") && !extroverted[1].equalsIgnoreCase("B"))
		System.out.print("Expected A or B as Response\n I know this is an error, Please retry again");
	if(extroverted[1].equalsIgnoreCase("A"))
		newExtroverted[1] = "A. more outgoing, think out loud";

	if(extroverted[1].equalsIgnoreCase("B"))
		newExtroverted[1] = "B. more reserved, think to yourself";

	}

		
	sensing[1] = "flag";
	while(!sensing[1].equalsIgnoreCase("A") && !sensing[1].equalsIgnoreCase("B")){
	System.out.print("\n6. A. practical, realistic, experiential \tB. imaginative, innovative, theoretical\n");
	sensing[1] = scanner.nextLine();
	if(!sensing[1].equalsIgnoreCase("A") && !sensing[1].equalsIgnoreCase("B"))
	System.out.print("Expected A or B as Response\n I know this is an error, Please retry again");

	if(sensing[1].equalsIgnoreCase("A"))
		newSensing[1] = "A. Practical, realistic, experiential";

	if (sensing[1].equalsIgnoreCase("B"))
		newSensing[1] = "B. imaginative, innovative, theoretical";
	}
		

	thinking[1] = "flag";
	while(!thinking[1].equalsIgnoreCase("A") && !thinking[1].equalsIgnoreCase("B")){
	System.out.print("\n7. A.candid, straight forward, frank \t B. tactful, kind, encouraging\n");
	thinking[1] = scanner.nextLine();
	if(!thinking[1].equalsIgnoreCase("A") && !thinking[1].equalsIgnoreCase("B"))
	System.out.print("Expected A or B as Response\n I know this is an error, Please retry again");

	if(thinking[1].equalsIgnoreCase("A"))
		newThinking[1] = "A. candid, straight forward, frank";

	if(thinking[1].equalsIgnoreCase("B"))
		newThinking[1] = "B. tactful, kind, encouraging";
	}

	

	judging[1] = "flag";
	while(!judging[1].equalsIgnoreCase("A") && !judging[1].equalsIgnoreCase("B")){
	System.out.print("\n8. A. plan, schedule \t B. unplanned, spontaneous\n");
	judging[1] = scanner.nextLine();
	if(!judging[1].equalsIgnoreCase("A") && !judging[1].equalsIgnoreCase("B"))
		System.out.print("Expected A or B as Response\n I know this is an error, Please retry again");

	if(judging[1].equalsIgnoreCase("A"))
		newJudging[1] = "A. plan, schedule";

	if (judging[1].equalsIgnoreCase("B"))
		newJudging[1] = "B. unplanned, spontaneous";
	}


		   
	extroverted[2] = "flag";
	while(!extroverted[2].equalsIgnoreCase("A") && !extroverted[2].equalsIgnoreCase("B")){
	System.out.print("\n9. A. seek many tasks, public activities, interaction with others \t B. seek private, solitary activities with quiet to concentrate\n");
	extroverted[2] = scanner.nextLine();
	if(!extroverted[2].equalsIgnoreCase("A") && !extroverted[2].equalsIgnoreCase("B"))
		System.out.print("Expected A or B as Response\n I know this is an error, Please retry again");
	if(extroverted[2].equalsIgnoreCase("A"))
		newExtroverted[2] = "A. seek many tasks, public activities, interaction with others";

	if (extroverted[2].equalsIgnoreCase("B"))
		newExtroverted[2] = "B. seek private, solitary activities with quiet to concentrate";
	}


	sensing[2] = "flag";
	while(!sensing[2].equalsIgnoreCase("A") && !sensing[2].equalsIgnoreCase("B")){	
	System.out.print("\n10. A. standard, usual, conventional \t B. different, novel, unique");
	sensing[2] = scanner.nextLine();
	if(!sensing[2].equalsIgnoreCase("A") && !sensing[2].equalsIgnoreCase("B"))
		System.out.print("Expected A or B as Response\n I know this is an error, Please retry again");

	if(sensing[2].equalsIgnoreCase("A"))
		newSensing[2] = "A. standard, usual, conventional";

	if (sensing[2].equalsIgnoreCase("B"))
		newSensing[2] = "B. different, novel, unique";
	}

	
	thinking[2] = "flag";
	while(!thinking[2].equalsIgnoreCase("A") && !thinking[2].equalsIgnoreCase("B")){
	System.out.print("\n11. A. firm, tend to criticize, hold the line \t B. gentle, tend to appreciate, concilate\n");
	thinking[2] = scanner.nextLine();
	if(!thinking[2].equalsIgnoreCase("A") && !thinking[2].equalsIgnoreCase("B"))
	 	System.out.print("Expected A or B as Response\n I know this is an error, Please retry again");
	
	if(thinking[2].equalsIgnoreCase("A"))
		newThinking[2] = "A. firm, tend to criticize, hold the line";

	if (thinking[2].equalsIgnoreCase("B"))
		newThinking[2] = "B. gentle, tend to appreciate, concilate";
	}
	
	

	judging[2] = "flag";
	while(!judging[2].equalsIgnoreCase("A") && !judging[2].equalsIgnoreCase("B")){
	System.out.print("\n12. A. regulated, structured \t B. easy-going, live and let live\n");
	judging[2] = scanner.nextLine();
	if(!judging[2].equalsIgnoreCase("A") && !judging[2].equalsIgnoreCase("B"))
		System.out.print("Expected A or B as Response\n I know this is an error, Please retry again");


	if(judging[2].equalsIgnoreCase("A"))
	   newJudging[2] = "A. regulated, structured";

	if(judging[2].equalsIgnoreCase("B"))
	    newJudging[2] = "B. easy-going, live and let live";
	}

	

	extroverted[3] = "flag";
	while(!extroverted[3].equalsIgnoreCase("A") && !extroverted[3].equalsIgnoreCase("B")){	
	System.out.print("\n13. A. external, communicative, express yourself \t B. internal, reticent, keep to yourself\n");
	extroverted[3] = scanner.nextLine();
	if(!extroverted[3].equalsIgnoreCase("A") && !extroverted[3].equalsIgnoreCase("B"))
		System.out.print("Expected A or B as Response\n I know this is an error, Please retry again");	

	if(extroverted[3].equalsIgnoreCase("A"))
		newExtroverted[3] = "A. external, communicative, express yourself";

	if (extroverted[3].equalsIgnoreCase("B"))
		newExtroverted[3] = "B. internal, reticent, keep to yourself";
	}

		  


	sensing[3] = "flag"; 
	while(!sensing[3].equalsIgnoreCase("A") && !sensing[3].equalsIgnoreCase("B")){
	System.out.print("\n14. A. focus on here and now \t B. look to the future, global perspective, big picture\n");
	sensing[3] = scanner.nextLine();
	if(!sensing[3].equalsIgnoreCase("A") && !sensing[3].equalsIgnoreCase("B"))
		System.out.print("Expected A or B as Response\n I know this is an error, Please retry again");
	
	if(sensing[3].equalsIgnoreCase("A"))
		newSensing[3] = "A. focus on here and now ";

	if (sensing[3].equalsIgnoreCase("B"))
		newSensing[3] = "B. look to the future, global perspective, big picture";
	}

		  

	
	thinking[3] = "flag";
	while(!thinking[3].equalsIgnoreCase("A") && !thinking[3].equalsIgnoreCase("B")){
	System.out.print("\n15. A. tough-minded, just \t B. tender-hearted, merciful\n");	
	thinking[3] = scanner.nextLine();
	if(!thinking[3].equalsIgnoreCase("A") && !thinking[3].equalsIgnoreCase("B"))
		System.out.print("Expected A or B as Response\n I know this is an error, Please retry again");

	if (thinking[3].equalsIgnoreCase("A"))
		newThinking[3] = "A. tough-minded, just";

	if (thinking[3].equalsIgnoreCase("B"))
		newThinking[3] = "B. tender-hearted, merciful";
	}

		  
	judging[3] = "flag";
	while(!judging[3].equalsIgnoreCase("A") && !judging[3].equalsIgnoreCase("B")){
	System.out.print("\n16. A. preparation, plan ahead \t B. go with the flow, adapt as you go\n");
	judging[3] = scanner.nextLine();
	if(!judging[3].equalsIgnoreCase("A") && !judging[3].equalsIgnoreCase("B"))
		System.out.print("Expected A or B as Response\n I know this is an error, Please retry again");

	if(judging[3].equalsIgnoreCase("A"))
		newJudging[3] = "A. preparation, plan ahead";

	if (judging[3].equalsIgnoreCase("B"))
		newJudging[3] = "B. go with the flow, adapt as you go";
	}


	extroverted[4] = "flag";
	while(!extroverted[4].equalsIgnoreCase("A") && !extroverted[4].equalsIgnoreCase("B")){
	System.out.print("\n17. A. active, initiate \t B. reflective, deliberate\n");
	extroverted[4] = scanner.nextLine();
	if(!extroverted[4].equalsIgnoreCase("A") && !extroverted[4].equalsIgnoreCase("B"))
		System.out.print("Expected A or B as Response\n I know this is an error, Please retry again");

	if(extroverted[4].equalsIgnoreCase("A"))
	 	newExtroverted[4] = "A. active, initiate ";

	if (extroverted[4].equalsIgnoreCase("B"))
		newExtroverted[4] = "B. reflective, deliberate";
	}
	
	  
	sensing[4] = "flag";
	while(!sensing[4].equalsIgnoreCase("A") && !sensing[4].equalsIgnoreCase("B")){
	System.out.print("\n 18. A. facts, things, what is \t B. ideas, what could be\n");
	sensing[4] = scanner.nextLine();
	if(!sensing[4].equalsIgnoreCase("A") && !sensing[4].equalsIgnoreCase("B"))
		System.out.print("Expected A or B as Response\n I know this is an error, Please retry again");

	if(sensing[4].equalsIgnoreCase("A"))
		newSensing[4] = "A. facts, things, what is ";
	 
	if (sensing[4].equalsIgnoreCase("B"))
		newSensing[4] = "B. ideas, what could be";
	}

	
	thinking[4] = "flag";
	while(!thinking[4].equalsIgnoreCase("A") && !thinking[4].equalsIgnoreCase("B")){
	System.out.print("\n 19. A. matter of fact, issue-oriented \t B. sensitive, people-oriented, compassionate\n");
	thinking[4] = scanner.nextLine();
	if(!thinking[4].equalsIgnoreCase("A") && !thinking[4].equalsIgnoreCase("B"))
		System.out.print("Expected A or B as Response\n I know this is an error, Please retry again");
	
	if(thinking[4].equalsIgnoreCase("A"))
		newThinking[4] = "A. matter of fact, issue-oriented";

	if (thinking[4].equalsIgnoreCase("B"))
		newThinking[4] = "B. sensitive, people-oriented, compassionate";
	}




	judging[4] = "flag";
	while(!judging[4].equalsIgnoreCase("A") && !judging[4].equalsIgnoreCase("B")){
	System.out.print("\n20. A. control, govern \t B. latitude, freedom\n");
	judging[4] = scanner.nextLine();
	if(!judging[4].equalsIgnoreCase("A") && !judging[4].equalsIgnoreCase("B"))
		System.out.print("Expected A or B as Response\n I know this is an error, Please retry again");

	if(judging[4].equalsIgnoreCase("A"))
		newJudging[4] = "A. control, govern ";

	if (judging[4].equalsIgnoreCase("B"))
		newJudging[4] = "B. latitude, freedom";
	}
	

	System.out.println("Hello "+name+" You selected\n");
	
	for(int index = 0; index < extroverted.length; index++){
		System.out.println(newExtroverted[index]);
		}
	

	int count = 0;
	int counter = 0;
	for(int index = 0; index < extroverted.length; index++){
		if(extroverted[index].equalsIgnoreCase("A")) count += 1;
		else
		   counter += 1; 
		}
	System.out.println("Number of A selected: "+count+"\nNumber of B selected: "+counter+"\n");
	
	String resultExtrovertIntrovert;
	if(count > counter) resultExtrovertIntrovert = "E";
	else resultExtrovertIntrovert = "I";


	for(int index = 0; index < sensing.length; index++){
		System.out.println(newSensing[index]);
		}
	

	count = 0;
	counter = 0;
	for(int index = 0; index < sensing.length; index++){
		if(sensing[index].equalsIgnoreCase("A")) count += 1;
		else
		   counter += 1; 
		}
	System.out.println("Number of A selected: "+count+"\nNumber of B selected: "+counter+"\n");
	
	String resultSensingIntuitive;
	if(count > counter) resultSensingIntuitive = "S";
	else	resultSensingIntuitive = "N";

	
	
	for(int index = 0; index < thinking.length; index++){
		System.out.println(newThinking[index]);
		}
	
	count = 0;
	counter = 0;
	for(int index = 0; index < thinking.length; index++){
		if(thinking[index].equalsIgnoreCase("A")) count += 1;
		else
		   counter += 1; 
		}
	System.out.println("Number of A selected: "+count+"\nNumber of B selected: "+counter+"\n");
	
	String resultThinkingFeeling;
	if(count > counter)resultThinkingFeeling = "T";
	else resultThinkingFeeling = "F";


	


	for(int index = 0; index < judging.length; index++){
		System.out.println(newJudging[index]);
		}

	count = 0;
	counter = 0;
	for(int index = 0; index < judging.length; index++){
		if(judging[index].equalsIgnoreCase("A")) count += 1;
		else
		   counter += 1; 
		}
	System.out.println("Number of A selected: "+count+"\nNumber of B selected: "+counter+"\n");

	String resultJudgingPerceptive;
	if(count > counter) resultJudgingPerceptive = "J";
	else resultJudgingPerceptive = "P"; 
	

	String finalResult = resultExtrovertIntrovert + resultSensingIntuitive + resultThinkingFeeling + resultJudgingPerceptive;

	if(finalResult.equals("INTJ"))

		








	}


}