 package bankatm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    Account account;

@BeforeEach
    public void setUp() {
    account = new Account("oluwafemi", "jacob", "",0);
    account.createPin("oluwafemi");
    }

    @Test
    public void testThatIfDepositAddToTheBalance(){
    account.deposit(5000);
    assertEquals(5000, account.getBalance("oluwafemi"));
    }

    @Test
    public void testThatIfDepositAmountWillAddToTheBalance(){
    account.deposit(-5000);
    assertEquals(0, account.getBalance("oluwafemi"));
    }

    @Test
    public void testThatIfWithdrawAmountWillSubtractFromTheBalance(){
    account.deposit(5000);
    account.withdraw(3000, "oluwafemi");
    assertEquals(2000, account.getBalance("oluwafemi"));
    }

    @Test
    public void testThatifWithdrawAmountWillSubtractFromTheBalance(){
    account.deposit(5000);
    account.withdraw(-3000, "oluwafemi");
    assertEquals(5000, account.getBalance("oluwafemi"));
    }

    @Test
    public void testThatIfWithdrawAmountIsHigherThanTheBalanceWillWithdrawAmount(){
    account.deposit(5000);
    account.withdraw(7000, "oluwafemi");
    assertEquals(5000, account.getBalance("oluwafemi"));
    }

    @Test
    public void testThatNewPinWillUpdateTheOldPin(){
    account.deposit(5000);
    account.updatePin("oluwafemi", "femi");
    assertEquals(5000, account.getBalance("femi"));
    }

}
