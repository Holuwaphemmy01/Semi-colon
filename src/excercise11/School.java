package excercise11;

import java.util.Scanner;

public class School {
    public static void main(String[] args) {
        String welcome = """
                Welcome to the school program.
                1. Create Student.
                2. Create Faculty Members.
                3. Create Staff Members.
                4. Exist.
                """;
        prompt(welcome);
        int option = Integer.parseInt(input());

        switch (option):
        case 1:



    }
    private static String input(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    private static void prompt(String prompt){
        System.out.println(prompt);
    }

    private static String student(){
        Student student = new Student();
        prompt(student.setName());
    }


}
