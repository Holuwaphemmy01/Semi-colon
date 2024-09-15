package excercise11_4;

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumMain {
    public static void main(String[] args) {
        Maximum maximum = new Maximum();
        ArrayList <Integer> list = new ArrayList<>();
        int number = -1;

        while(number != 0){
            print("Enter a number or 0 to exit");
            number = Integer.parseInt(input());
            list.add(number);
        }
        print("Largest number in the list is "+String.valueOf(maximum.Largest(list)));


    }
    private static void print(String word) {
        System.out.println(word);
    }
    private static String input() {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        return word;

    }
}
