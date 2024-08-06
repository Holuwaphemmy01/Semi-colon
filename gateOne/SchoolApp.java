import java.util.Scanner;
import java.util.Arrays;
public class SchoolApp{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.print("Enter total number of student: ");
int studentNumber = scanner.nextInt();
 
System.out.print("Enter total number of subject: ");
int totalSubject = scanner.nextInt();


 
int [][] student = new int [studentNumber][totalSubject];
int [] total = new int [studentNumber];
int [] newTotal =  new int [studentNumber];
double [] average = new double [studentNumber];
int [] position = new int [studentNumber];

for(int index = 0, counter = 1; index < studentNumber; index++, counter++){
	int sum = 0; 
	for (int element = 0, count =  1; element < totalSubject; element++, count++){
		System.out.print("Entering score for student "+counter+" \nEnter score for subject " + count+": ");
		student[index][element] = scanner.nextInt();
		System.out.println("Saving >>>>>>>>>>>>>>>>");
		System.out.print("Saved successfully");
		System.out.println();
		
		sum += student[index][element];
		
		System.out.println();

					}
		total[index] = sum;
		newTotal[index] = sum;
		average[index] = sum / totalSubject;
		
					}



		Arrays.sort(newTotal);

		for(int index = 0, count = 1; index < student.length; index++, count++){

			for(int element = 0; element < student.length; element++){
			if(total[index] == newTotal[element]){
				position[index] = student.length - element;
					}
				
				}

					} 


		System.out.print("STUDENT  ");
		
		for(int index = 1; index <= totalSubject; index++){
			System.out.printf("%10s", "SUB" +index);

					}
		System.out.printf("%10s%10s%10s%n", "TOTAL ", "AVERAGE ", "POSITION");
	
		for(int index = 0, count = 1; index < studentNumber; index++, count++){
				System.out.print("Student "+ count);
				

			for(int element = 0; element < totalSubject; element++){
				System.out.printf("%10d", student[index][element]);
						}
				System.out.printf("%8d%9.2f%10d", total[index], average[index],position[index]);
				System.out.println();

					}

	

	}


		}