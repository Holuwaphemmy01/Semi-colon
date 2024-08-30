package bank;

public class Account {
    private int balance;
    private String pin;

    public void createPin(String pin) {
        this.pin = pin;
    }
    public int getBalance(String pin) {
        if (this.pin.equals(pin))
            return balance;
        else
            return 0;
    }
    public void deposit(int amount) {
        boolean amountGreaterThanZero = amount > 0;
        if (amountGreaterThanZero) balance += amount;
    }
    public void withdraw(int amount, String pin) {
        if (this.pin.equals(pin)) {
            boolean amountIsPositive = amount > 0;
            boolean isSufficient = balance >= amount;
            if (amountIsPositive && isSufficient) balance -= amount;
        }
    }


    public void UpdatePin(String correctPin, String newPin) {
        if (this.pin.equals(correctPin)) {
            this.pin = newPin;
        }
    }
}
