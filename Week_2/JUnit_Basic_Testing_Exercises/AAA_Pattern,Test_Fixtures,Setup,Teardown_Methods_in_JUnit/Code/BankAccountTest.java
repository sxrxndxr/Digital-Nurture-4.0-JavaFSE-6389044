import org.junit.*;

import static org.junit.Assert.*;

public class BankAccountTest {
    BankAccount account;

    @Before
    public void setUp() {
        account = new BankAccount();
    }

    @Test
    public void testDeposit() {
        // Arrange already done
        account.deposit(100); // Act
        assertEquals(100, account.getBalance()); // Assert
    }

    @After
    public void tearDown() {
        account = null;
    }
}
