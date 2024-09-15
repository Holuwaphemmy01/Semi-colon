import java.util.*;
public class WhileLoop{
public static void main(String[] args){

	Scanner input = new Scanner (System.in);
	
	System.out.print("Enter Grade: ");
	int grade = input.nextInt();
	int counter = 1;
	
	while (counter <= 5) {
	if (grade >= 80){
	 System.out.println("Your letter grade is A");
	}
	else if (grade >= 70){
	  System.out.println("Your letter grade is B");
	}
	else if (grade >= 60){
	  System.out.println("Your letter grade is C");
	}
	else if (grade >= 50){
	  System.out.println("Your letter grade is D");
	}
	else {
	System.out.println("Your letter grade is F");
	}

}

}


}