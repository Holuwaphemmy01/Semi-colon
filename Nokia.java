import java.util.Scanner;
public class Nokia{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);
      System.out.println("Welcome to Nokia");
      System.out.println();

      String Welcome = """
				1. Phone book 	
				2. Message.
				3. Chat
				4. Call register
				5. Tones 
				6. Settings
				7. Call divert
				8. Games
				9. Calculator
				10. Remainders
				11. Clock
				12. Profiles
				13. SIM services

						""";
	System.out.println(Welcome);

	
	System.out.print("Enter a number from above to continue: ");
	 int nokia = input.nextInt();

	 int phonebook = 1;
	 int Messages = 2;
	 int chat = 3;
	 int callregister = 4;
	 int Tones = 5;
	 int Settings = 6;
	 int Calldivert = 7;
	 int Games = 7;
	 int Calculator = 9;
	 int Remainders = 10;
	 int Clock = 11;
	 int Profiles = 12;
	 int SIMservices = 13;

	
	switch (nokia){
		
	  case 1: System.out.println("     Phone book");
		  System.out.println();

	String contact = """
				1. Search 	
				2. Service Nos.
				3. Add name
				4. Erases
				5. Edit 
				6. Assign tone
				7. Send b'card8
				8. Options
				9. Speed dials
				10. Voice tags
						""";
	System.out.println(contact);



		System.out.print("Enter a number from the list above: ");
	        int Phonebook = input.nextInt();


		  switch (Phonebook) {
	  	  case 1: System.out.println("Search");
	                  break;
		  case 2: System.out.println("Service Nos.");
		  	  break; 
		  case 3: System.out.println("Add name");
		  	   break;
		  case 4: System.out.println("Erase");
		 	   break; 
		  case 5: System.out.println("Edit");
		  	   break;
		  case 6: System.out.println("Assign tone");
		  	   break;
		  case 7: System.out.println("Send b'card");
		 	  break;
		  case 8: System.out.println("Options");
			  System.out.println();
			  String options = """
					  1. Type of view
					  2. Memory status
							  """;
			  System.out.println(options);

			System.out.println("Enter a number: ");
	         	int option = input.nextInt();


		  switch (option) {
			case 1: System.out.println("Type of view");
				break;
			case 2: System.out.println("Memory Status");
			        break;
			default:
				break;
			}
		  break; 
		  case 9: System.out.println("Speed dials");
			  break;
		  case 10: System.out.println("Voice tags");
			  break;
	               	}
	                  break;





	 
	        case 2: System.out.println("Messages");
			System.out.println();
		 String message = """
				  1. Write Messages
				  2. Inbox
				  3. Outbox
				  4. Pictures messages
				  5. Templates
				  6. Smileys
				  7. Message settings
				  8. Info service
				  9. Voice mailbox number
				  10. Service command editor
							    """;
			System.out.println(message);
	       System.out.println("Enter a number from above to continue: ");
	       int messages = input.nextInt();

	        switch (messages) {
		
		case 1: System.out.println("Write messages");
			break;
		case 2: System.out.println("Inbox");
			break;
		case 3: System.out.println("Outbox");
			break;
		case 4: System.out.println("Picture Messages");
			break;
		case 5: System.out.println("Templates");
			break;
		case 6: System.out.println("Smileys");
			break;
		case 7: System.out.println("Message settings");
			System.out.println();
			String setting = """
					  1. Set 1
					  2. Common
						     """;
			System.out.println(setting);
			System.out.println();
			
			System.out.print("Enter number: ");
			int messageSetting = input.nextInt();
			System.out.println();
		
			int common = 2;
			
			switch (messageSetting) {
			
				case 1: System.out.println("Set 1");
					String sets1 = """
						        1. Message centre number
							2. Message sent as
							3. Message validity
									""";
					System.out.println(sets1);
					System.out.print("Enter a number");
					 int set1 = input.nextInt();
					System.out.println();

				   switch (set1) {
					  case 1: System.out.println("Message centre number");
						   break;
					  case 2: System.out.println("Message sent as");
						   break; 
					  case 3:  System.out.println("Message validity");
			  			   break;
					  default:
						  break;
					   }
				  break; 
				case 2: System.out.println("Common");
					System.out.println();
					String common1 = """
							1. Delivery reports
							2. Reply via same centre
							3. Character support
									""";
					System.out.println(common1);
					System.out.print("Enter a number from above to continue: ");
					 common = input.nextInt();

				  switch (common) {
					  case 1: System.out.println("Delivery reports");
						  break;
					  case 2: System.out.println("Reply via same centre");
						  break;
					  case 3: System.out.println("Character support");
						  break;
					  default:
						 break;
					  }
					break;
			       }
				break;
		 case 8: System.out.println("Info service");
			 break;
		 case 9: System.out.println("Voice mailbox number");
			 break; 
		 case 10: System.out.println("Service command editor");
			break;
		default:
			break;
			}
			break;


		
	       case 3: System.out.println("Chat");
       			break;
  
	        case 4: System.out.println("Call register");
			System.out.println();
			String callregisters = """
					      1. Missed calls
					      2. Recieved calls
					      3. Dialled numbers
					      4. Erase recent call lists
					      5. Show call duration
					      6. Show call costs
					      7. Call cost settings
					      8. Prepaid credit
							        """;
			System.out.println(callregisters);
			
			System.out.print("Enter a number to continue: ");
			int register = input.nextInt();

	 	 	
				switch (register) {
		  
				case 1: System.out.println("Missed calls");
					break;
				case 2: System.out.println("Recieved calls");
					break;
				case 3: System.out.println("Dialled numbers");
					break;
				case 4: System.out.println("Erase recent call lists");
					break;
				case 5: System.out.println("Show call duration");
				System.out.println();
				String callduration = """
						      1. Last call duration
						      2. All calls duration
						      3. Received calls duration
						      4. Dialled calls duration
						      5. Clear times
								   """;
				System.out.println(callduration);

				System.out.print("Enter a number from above to continue: ");
				int duration = input.nextInt();

				switch (duration) {
				 case 1: System.out.println("Last call duration");
					 break;
				 case 2: System.out.println("All call's duration");
					 break;
				 case 3: System.out.println("Received call duration");
					 break;
				 case 4: System.out.println("Dialled calls duration");
					 break;
				 case 5: System.out.println("Clear timers");
					break;
				default: System.out.println("Invalid");
					break; 
					}
					break;
				case 6: System.out.println("Show call costs");
				 System.out.println();
				String showcall = """
						  1. Last call duration
						  2. All calls cost
						  3. Clear counters
							  	""";
				System.out.println(showcall);

				System.out.print("Enter a number from the list above to continue: ");
				int callcosts = input.nextInt();
				System.out.println();
				
				switch (callcosts){
				 case 1: System.out.println("Last call cost");
					 break;
				 case 2: System.out.println("All calls cost");
					 break;
				 case 3: System.out.println("Clear counters");
					 break;
				  default: System.out.println("Invalid");
					  break;
					}
					break;
				 case 7: System.out.println("Call cost settings");
				 
				String callcost = """
						  1. Call cost limit
						  2. Show costs in
								""";
				System.out.println(callcost);

				System.out.println("Enter a number");
				int costsetting = input.nextInt();
				
				switch (costsetting){
				case 1: System.out.println("Call cost limit");
					break;
			 	case 2: System.out.println("Show costs in");
					break;
				default: System.out.println("Invalid");
					break;
					}
				break;
				case 8: System.out.print("Prepaid credit");
					break;
				default: System.out.println("Invalid");
					break;
					}
					break;


	case 5:  System.out.println("Tones");
		 System.out.println();
		 String tone = """
				  1. Ringing tone
				  2. Ringing volume
				  3. Incoming call alert
				  4. Composer
				  5. Message alert tone
				  6. Keypad tones
				  7. Warning and games tones 
				  8. Vibrating alert
				  9. Screen saver
						 """;
		System.out.println(tone);
		System.out.println();

		System.out.print("Enter a number: ");
		int tones = input.nextInt();

		switch (tones) {
			case 1: System.out.println("Ringing tone");
				break;
			case 2: System.out.println("Ringing Volume");
				break;
			case 3: System.out.println("Incoming call alert");
				break;
			case 4: System.out.println("Composer");
				break;
			case 5: System.out.println("Message alert tone");
				break;
			case 6: System.out.println("Keypad tones");
				break;
			case 7: System.out.println("Warning and games tones");
				break;
			case 8:	System.out.println("Vibrating alert");
				break;
			case 9: System.out.println("Screen saver");
				break;
			default: 
				break;
			}
			break;






	case 6:  System.out.println("Settings");
		 System.out.println();
		 String setting = """
				     1. Call settings 
				     2. Phone settings
				     3. Security settings
				     4. Restore factory settings
						""";
			System.out.println(setting);
			System.out.println();

		      System.out.print("Enter a number: ");
		       Settings = input.nextInt();

		      switch (Settings) { 
		      case 1: System.out.println("Call Setting");
		    	      System.out.println();

			      String callsetting = """
						   1. Automatic redial
						   2. Speed dialing
						   3. Call waiting options 
						   4. Own number sending
						   5. Phone line in use 
						   6. Automatic answer
								""";
				System.out.println(callsetting); 
				System.out.println();
				
		      System.out.print("Enter a number: ");
		      int Call = input.nextInt();
			
				switch (Call) {
				case 1: System.out.println("Automatic redial");
					break;
				case 2: System.out.println("Speed dialing");
					break;
				case 3: System.out.println("Call waiting options");
					break;
				case 4: System.out.println("Own number sending");
					break;
				case 5: System.out.println("Phone line in use");
					break;
				case 6: System.out.println("Automatic answer");
					break;
				default:
					break;
					}
					break;

		    case 2: System.out.println("Phone Settings");
			    System.out.println(); 

				String phone = """
						  1. Language
				    2. Cell info display
						  3. Welcome note
						  4. Network selection
						  5. Lights
						  6. Confirm SIM service actions
			     				""";
				System.out.println(phone);
				System.out.println();

			        System.out.print("Enter a number to continue: ");
				int phonesetting = input.nextInt();
				

				switch (phonesetting){
				 case 1: System.out.println("Language");
					 break;
				 case 2: System.out.println("Cell info display");
					 break;
				 case 3: System.out.println("Welcome note");
					 break;
				 case 4: System.out.println("Network selection");
					 break;
				 case 5: System.out.println("Lights");
					 break;
				 case 6: System.out.println("Confrim SIM service actions");
					 break;
				 default: System.out.println("Invalid");
					  break;
					 }
					break;


		   case 3: System.out.println("Security settings");
			   System.out.println();
			  
				 String securitysetting = """
							  1. PIN code request
							  2. Call barring service
							  3. Welcome note 
							  4. Closed user group
							  5. Phone security
							  6. Change access codes
								""";
				 System.out.println(securitysetting);
				 System.out.println(); 

				 System.out.print("Enter a number to continue: ");
				 int security = input.nextInt();

				 switch (security)  {
				 case 1: System.out.println("PIN code request");
					 break;
				 case 2: System.out.println("Call barring service");
					 break;
				 case 3: System.out.println("Fixed dialling");
					 break;
				 case 4: System.out.println("Closed user group");
					 break;
				 case 5: System.out.println("Phone Security");
					 break;
				 case 6: System.out.println("Change access codes");
					 break;
				 default: System.out.println("Invalid");
					  break;
					}
				      break;

		  case 4: System.out.println("Restore factory settings");
			  break;	
		  default: System.out.println("Invalid");
		   	  break; 			
		        }
			break;
	



	case 7: System.out.println("Call divert");
		break;
	case 8: System.out.println("Games");
		break;
	case 9: System.out.println("Calculator");
		break;
	case 10: System.out.println("Remainders");
		break;
	case 11: System.out.println(Clock);
		 System.out.println();
		 
		 String clocksetting = """
					1. Alarm clock
					2. Clock setting
					3. Date setting 
					4. Stopwatch
					5. Countdown timer
					6. Auto update of date and time
								""";
		System.out.println(clocksetting);
		 
		System.out.print("Enter a number to continue: ");
		 int clock = input.nextInt();

		  switch (clock){
			case 1: System.out.println("Alarm clock");
				break;
			case 2: System.out.println("Clock settings");
				break;
			case 3: System.out.println("Date setting");
				break;
			case 4: System.out.println("Stop watch");
				break;
			case 5: System.out.println("Countdown timer");
				break;
			case 6: System.out.println("Auto update of date and time");
				break;
			default: 
				break;
				}
		  break;
	case 12: System.out.println("Profiles");
		 break;
	case 13: System.out.print("SIM services");
		 break;
	default: 
		break;
		

}






}



}