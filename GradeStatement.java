import java.util.*;
public class GradeStatement{
public static void main(String[] args){

	Scanner input = new Scanner (System.in);

	 System.out.print("Enter grade ");
	 int grade = input.nextInt();


	  if (grade >= 80 && grade <= 100) {
		System.out.println("Your letter Grade is A");
	  }

	  if ( grade >= 70 && grade <= 79 ) {
		System.out.println("Your letter Grade is B");
	  }
	
	 if (grade >= 60 && grade <= 69) {
		System.out.println("Your leter Grade is C");
	 }

	if (grade >= 50 && grade <= 59) {
		System.out.println("Your letter Grade is D");
	 }
	
	if (grade <= 49) {
		System.out.println("Your letter Grade is F");
	}

	}


}