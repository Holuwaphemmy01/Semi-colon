package bankatm;

import java.util.Scanner;

public class BankAtm {
    static Bank bank = new Bank();

    public static void main(String[] args) {
        gotoMainMethod();
    }


    private static void gotoMainMethod() {
        String welcome = """
                Welcome to the Bank Atm!!!
                1. Create Account.
                2. Deposit
                3. Withdraw
                4. Transfer
                5. Check Balance
                6. Change Pin
                7. Exit
                """;

        int userInput = Integer.parseInt(input(welcome));
        int accountNumber;
        String pin;
        double amount;

        switch (userInput) {
            case 1: String firstName = input("Enter Your First Name");
                    String lastName = input("Enter Your Last Name");
                    pin =  input("Enter Your Pin");
                    accountNumber = bank.createAccountFor(firstName, lastName, pin);
                    print("This is your account number: " + accountNumber);
                    print("Account created successfully");
                    gotoMainMethod();


            case 2: amount = Double.parseDouble(input("Enter Your Amount"));
                    int receiverAccountNumber = Integer.parseInt(input("Enter receiver  Account number: "));
                    bank.depositFor(amount, receiverAccountNumber);
                    print("Deposited " + amount + " to " + receiverAccountNumber+ "\nDeposit successfully");
                    gotoMainMethod();


            case 3: accountNumber = Integer.parseInt(input("Enter your account number: "));
                    pin = input("Enter your  account pin");
                    amount = Integer.parseInt(input("Enter amount to withdraw: "));
                    bank.withdrawFor(amount, accountNumber, pin);
                    print("Withdrawn " + amount + " from " + accountNumber+ "\nWithdraw successfully");
                    gotoMainMethod();
                    break;

            case 5: accountNumber = Integer.parseInt(input("Enter your account number: "));
                    pin = input("Enter your  account pin");
                    double balance = bank.checkBalance(accountNumber, pin);
                    print("Check balance of " + accountNumber + " is " + balance);
                    gotoMainMethod();
                    break;
        }

    }
    private static String input(String prompt){
        print(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static void  print(String prompt){
        System.out.println(prompt);
    }

}


