package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest{
    private Account account;

    @BeforeEach
    public void setUp(){
         account = new Account();
         account.createPin("correctPin");
    }

    @Test
    public void newAccount_balanceIsZeroTest(){
        assertEquals(0, account.getBalance("correctPin"));
    }

    @Test
    public void deposit2kAndBalanceIs2kTest(){
        assertEquals(0, account.getBalance("correctPin"));
        account.deposit(2000);
        assertEquals(2000, account.getBalance("correctPin"));
    }

    @Test
    public void depositMinus2kAndBalanceIsZeroTest(){
        assertEquals(0, account.getBalance("correctPin"));
        account.deposit(-2000);
        assertEquals(0, account.getBalance("correctPin"));
    }
    @Test
    public void balanceOf2kAndWithdrawalMinus5kTest(){
            account.deposit(2000);
            assertEquals(2000, account.getBalance("correctPin"));
            account.withdraw(-5000, "correctPin");
            assertEquals(2000, account.getBalance("correctPin"));
    }

    @Test
    public void balanceOf2kAndWithdraw1kAndBalanceIs1kTest(){
        account.deposit(2000);
        account.withdraw(1000, "correctPin");
        assertEquals(1000, account.getBalance("correctPin"));
    }

    @Test
    public void changePinAndCheckBalanceTest(){
        account.deposit(2000);
        assertEquals(2000, account.getBalance("correctPin"));
        account.UpdatePin("correctPin", "newPin");
        assertEquals(0, account.getBalance("correctPin"));
        assertEquals(2000, account.getBalance("newPin"));
    }
}
