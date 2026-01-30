public class JunitTestCase {

    public static void main(String[] args) {
        testDepositValidAmount();
        testDepositNegativeAmount();
        testWithdrawValidAmount();
        testWithdrawInsufficientFunds();
        System.out.println("All tests passed!");
    }

    public static void testDepositValidAmount() {
        Program account = new Program(100);
        account.deposit(50);
        if (account.getBalance() != 150.0) {
            throw new AssertionError("Expected 150.0, got " + account.getBalance());
        }
    }

    public static void testDepositNegativeAmount() {
        Program account = new Program(100);
        String actualMessage = "";
        try {
            account.deposit(-20);
        } catch (Exception e) {
            actualMessage = e.getMessage();
        }
        if (!"Deposit amount cannot be negative".equals(actualMessage)) {
            throw new AssertionError("Expected 'Deposit amount cannot be negative', got '" + actualMessage + "'");
        }
    }

    public static void testWithdrawValidAmount() {
        Program account = new Program(200);
        account.withdraw(50);
        if (account.getBalance() != 150.0) {
            throw new AssertionError("Expected 150.0, got " + account.getBalance());
        }
    }

    public static void testWithdrawInsufficientFunds() {
        Program account = new Program(100);
        String actualMessage = "";
        try {
            account.withdraw(150);
        } catch (Exception e) {
            actualMessage = e.getMessage();
        }
        if (!"Insufficient funds.".equals(actualMessage)) {
            throw new AssertionError("Expected 'Insufficient funds.', got '" + actualMessage + "'");
        }
    }
}
