public class TablesSquares {
public static void main(String[] args){
	
	System.out.printf("%s %s %s%n", "Number", "Square", "Cube");
	int number = 0;

	for (number = 0; number <= 10; number++) {
	    int Square = number * number; 
	    int Cube = Square * number;

    	System.out.printf("%-5d %-10d %-10d%n", number, Square, Cube);

	}
		
    }
}