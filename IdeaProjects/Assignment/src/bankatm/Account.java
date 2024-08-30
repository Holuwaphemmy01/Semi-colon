package bankatm;

public class Account {

    private String name;
    private String pin;
    private double balance;
    private int accountNumber = 0;


    public Account(String firstName, String SecondName, String pin, int accountNumber) {
        this.name = firstName +" "+ SecondName;
        this.pin = pin;
        this.balance = 0;
        this.accountNumber = accountNumber;
    }
    public String getName() {
        return this.name;
    }

    public void createPin(String pin) {
        this.pin = pin;
    }

    public  void deposit(double amount) {
        if(amount > 0)this.balance += amount;
    }

    public double getBalance(String pin) {
        if(pin.equals(this.pin))return this.balance;
        else return 0;
    }

    public void  withdraw(double amount, String pin) {
        if(amount > 0 && amount <= this.balance && this.pin.equals(pin))
     this.balance -= amount;
    }

    public void updatePin(String oldPin, String newPin) {
        if(oldPin.equalsIgnoreCase(this.pin))
            this.pin = newPin;
    }
}
