import java.util.Scanner;
public class SnackFunction{
public static void main(String... args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of packages delivered successfully: ");
		int number = input.nextInt();
		
		int ridersWage = SnackFunction1.ridersWage(number);
}

}