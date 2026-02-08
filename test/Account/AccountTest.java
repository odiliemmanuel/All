package Account;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    Account account;

    @BeforeEach
    public void startEachWith(){

        account = new Account();
    }


    @Test
    public void testThatMyBalanceIsZero(){

        assertEquals(0, account.checkBalance());
    }

    @Test
    public void testThatICanDeposit(){
        assertEquals(0, account.deposit(0));

    }

    @Test
    public void testThatIDepositTwoThousand_AndBalanceIsTwoThousand(){
        assertEquals(0, account.checkBalance());
        assertEquals(2000, account.deposit(2_000));


    }


    @Test
    public void testThatMinimumDepositIs50(){
        assertEquals(0,account.checkBalance());
        assertEquals(50, account.deposit(50));
        assertEquals(50,account.checkBalance());
    }


    @Test
    public void testThatIDepositANegativeAmountAndBalanceRemainsTheSame(){
        assertEquals(0, account.checkBalance());
        assertEquals(20_000, account.deposit(20_000));
        assertEquals(20_000, account.checkBalance());
        assertEquals(20_000, account.deposit(-5_000));


    }


    @Test
    public void testThatIfIWithdraw5000_balanceChanges(){
        assertEquals(0,account.checkBalance());
        assertEquals(3_000,account.deposit(3_000));
        assertEquals(1_000,account.withdraw(2_000, "4567"));

    }
//
//
    @Test
    public void testThatWithdrawalOfANegativeValueOrAmountDoesntAffectBalance(){
        assertEquals(0, account.checkBalance());
        assertEquals(9_000, account.deposit(9_000));
        assertEquals(9_000, account.checkBalance());
        assertEquals(9_000, account.withdraw(-2000, "4567"));

    }


    @Test
    public void testThatIfMyBalanceIs10k_AndIWithdraw11k_BalanceStillRemains10k(){
        assertEquals(0, account.checkBalance());
        assertEquals(10_000, account.deposit(10_000));
        assertEquals(10_000, account.checkBalance());
        assertEquals(10_000, account.withdraw(11_000, "4567"));

    }

    @Test
    public void testThatIfITransfer20k_BalanceBecomes10k(){
        assertEquals(0, account.checkBalance());
        assertEquals(30_000, account.deposit(30_000));
        assertEquals(30_000, account.checkBalance());
        assertEquals(10_000, account.transfer(20_000, "4567"));

    }

    @Test
    public void testThatIfMyBalanceIs20k_AndITransfer30k_Balance_Remains20k(){
        assertEquals(0, account.checkBalance());
        assertEquals(20_000, account.deposit(20_000));
        assertEquals(20_000, account.checkBalance());
        assertEquals(20_000, account.transfer(30_000, "4567"));

    }


    @Test
    public void testThatIfTransferANegativeAmount_BalanceRemainsTheSame(){
        assertEquals(0, account.checkBalance());
        assertEquals(20_000, account.deposit(20_000));
        assertEquals(20_000, account.checkBalance());
        assertEquals(20_000, account.transfer(-5000, "4567"));
    }

}
