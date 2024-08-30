package bankatm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class BankTest {

    @Test
    public void testThatCreatesAccountFor(){
        Bank bank = new Bank();
        bank.createAccountFor("femi", "victor", "correctPin");
        Assertions.assertEquals(1, bank.countAccount());
    }

    @Test
    public void testThatDeposit2kToAccountAndCheckBalanceOf2k(){
        Bank bank = new Bank();
        bank.createAccountFor("femi", "victor", "correctPin");
        bank.depositFor(5000, 1);
        double balance = bank.checkBalance(1, "correctPin");
        Assertions.assertEquals(5000, balance);
    }

    @Test
    public void testThatWithdraw2kToAccountAndCheckBalanceOf3k(){
        Bank bank = new Bank();
        bank.createAccountFor("femi", "victor", "correctPin");
        bank.depositFor(5000, 1);
        bank.withdrawFor(2000, 1, "correctPin");
        double balance = bank.checkBalance(1, "correctPin");
        Assertions.assertEquals(3000, balance);
    }

    @Test
    public void testThatTransferFromOneAccountToAnotherAccount(){
        Bank bank = new Bank();
        bank.createAccountFor("femi", "victor", "correctPin");
        bank.depositFor(5000, 1);
        bank.createAccountFor("tobi", "adeleke", "correctPi");
        bank.transferFor(1, 2, 3000, "correctPin");
        Assertions.assertEquals(2000, bank.checkBalance(1, "correctPin"));
        Assertions.assertEquals(3000, bank.checkBalance(2, "correctPi"));

    }

    @Test
    public void testThatChangePinAndUpdatePin(){
        Bank bank = new Bank();
        bank.createAccountFor("femi", "victor", "correctPin");
        bank.changePinFor(1, "correctPin", "newPin");
        Assertions.assertEquals(0, bank.checkBalance(1, "newPin"));
    }

    @Test
    public void testThatCheckIfAnAccountIsClosed(){
        Bank bank = new Bank();
        bank.createAccountFor("femi", "victor", "correctPin");
        bank.depositFor(5000, 1);
        bank.createAccountFor("ayo", "jacob", "correct");
        bank.depositFor(2000, 1);
        bank.closeAccountFor(1, "correctPin");
        bank.checkBalance(1, "correctPin");
        Assertions.assertEquals(0, bank.checkBalance(1, "correctPin"));
    }

}
