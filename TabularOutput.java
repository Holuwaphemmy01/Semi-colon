public class TabularOutput {
public static void main(String[] args){
	int N;
	System.out.printf("%-5s %-10s %-10s %-15s%n", "N", "N2", "N3", "N4" );

	for (N = 0; N <= 5; N++) {
		int N2 = N * N;
		int N3 = N * N * N;
		int N4 = N * N * N * N;
	System.out.printf("%-5d %-10d %-10d %-15d%n", N, N2, N3, N4);
	}
	}
}