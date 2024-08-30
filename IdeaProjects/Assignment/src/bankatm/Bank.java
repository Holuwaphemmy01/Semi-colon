package bankatm;

import java.util.ArrayList;


public class Bank {
    int accountNumberForUser = 0;
    ArrayList<Account>accounts = new ArrayList<>();

public int createAccountFor(String firstName, String lastName, String pin) {
   Account account = new Account(firstName, lastName, pin, accountNumberForUser++);
    accounts.add(account);
    return accountNumberForUser;
    }
    public int countAccount(){
        return accountNumberForUser;
    }

   public void  depositFor(double amount, int receiverAccount) {
    Account account = accounts.get(receiverAccount - 1);
    if (account != null) {
        account.deposit(amount);
        }
    }

    public double checkBalance(int accountNumber, String pin) {
          return accounts.get(accountNumber - 1).getBalance(pin);
        }


    public void withdrawFor(double amount, int accountNumber, String pin) {
        accounts.get(accountNumber - 1).withdraw(amount, pin);
    }

    public void transferFor(int senderAccount, int receiverAccount, int amount, String pin) {
            accounts.get(senderAccount - 1).withdraw(amount, pin);
            accounts.get(receiverAccount - 1).deposit(amount);
    }

    public void changePinFor(int accountNumber, String oldPin, String newPin) {
        accounts.get(accountNumber - 1).updatePin(oldPin, newPin);
    }

    public void closeAccountFor(int accountNumber, String pin) {
            accounts.remove(accountNumber-1);

    }
}
