public class Flatter{
public static void main(String[] args) {
	

	/*System.out.printf("%-15s %-15s %-10s", "a", "b",  "pow(a, b)");**/

	double a = 1;
	double b = 2;
	double power = Math.pow(a,b);

	for (a = 1; a <= 5; a++) {
		System.out.printf("%f", a++);    
	}
	for (b = 2; b <= 6; b++) {
		System.out.printf("%f", b++);
	}

	/*power = Math.pow(a,b);
	
	

	System.out.printf("%n%-15f  %-15f %-10f", a++, b++, power);**/


    }

}
