package Collections.BankingSystem;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class WithdrawalRequest {
    String accountNumber;
    double amount;

    public WithdrawalRequest(String accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "WithdrawalRequest{accountNumber='" + accountNumber + "', amount=" + String.format("%.2f", amount) + "}";
    }
}

public class BankingSystem {

    private Map<String, Account> accountsHashMap;

    
    private Map<Account, Account> accountsTreeMap;

    private Queue<WithdrawalRequest> withdrawalQueue;

    public BankingSystem() {
        accountsHashMap = new HashMap<>();
        accountsTreeMap = new TreeMap<>();
        withdrawalQueue = new LinkedList<>();
    }

    // Add a new account
    public void addAccount(Account account) {
        if (accountsHashMap.containsKey(account.getAccountNumber())) {
            System.out.println("Account with number " + account.getAccountNumber() + " already exists.");
            return;
        }
        accountsHashMap.put(account.getAccountNumber(), account);
        accountsTreeMap.put(account, account); // Add to TreeMap for sorting
        System.out.println("Account added: " + account);
    }

    public Account getAccount(String accountNumber) {
        return accountsHashMap.get(accountNumber);
    }

    public void makeDeposit(String accountNumber, double amount) {
        Account account = getAccount(accountNumber);
        if (account != null) {
            accountsTreeMap.remove(account);
            account.deposit(amount);
            accountsTreeMap.put(account, account);
        } else {
            System.out.println("Account " + accountNumber + " not found.");
        }
    }

    public void requestWithdrawal(String accountNumber, double amount) {
        if (getAccount(accountNumber) == null) {
            System.out.println("Withdrawal request failed: Account " + accountNumber + " not found.");
            return;
        }
        WithdrawalRequest request = new WithdrawalRequest(accountNumber, amount);
        withdrawalQueue.offer(request);
        System.out.println("Withdrawal request enqueued: " + request);
    }
 
    public void processNextWithdrawalRequest() {
        if (withdrawalQueue.isEmpty()) {
            System.out.println("No withdrawal requests to process.");
            return;
        }
        WithdrawalRequest request = withdrawalQueue.poll();
        System.out.println("Processing withdrawal request: " + request);
        Account account = getAccount(request.accountNumber);
        if (account != null) {
            accountsTreeMap.remove(account);
            if (account.withdraw(request.amount)) {
                accountsTreeMap.put(account, account);
            } else {
                accountsTreeMap.put(account, account);
            }
        } else {
            System.out.println("Error: Account " + request.accountNumber + " not found during processing.");
        }
    }

    public void displayAccountsSortedByBalance() {
        if (accountsTreeMap.isEmpty()) {
            System.out.println("No accounts to display.");
            return;
        }
        for (Map.Entry<Account, Account> entry : accountsTreeMap.entrySet()) {
            System.out.println(entry.getKey()); 
        }
    }

    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();


        // Add accounts
        Account acc1 = new Account("ACC001", "Sohil", 1500.00);
        Account acc2 = new Account("ACC002", "Raj", 500.00);
        Account acc3 = new Account("ACC003", "Tanuj", 2000.00);
        Account acc4 = new Account("ACC004", "nikhil", 100.00);

        bank.addAccount(acc1);
        bank.addAccount(acc2);
        bank.addAccount(acc3);
        bank.addAccount(acc4);

        bank.displayAccountsSortedByBalance();

        // Make some deposits
        bank.makeDeposit("ACC001", 200.00);
        bank.makeDeposit("ACC004", 50.00);

        bank.displayAccountsSortedByBalance();

        // Request withdrawals
        bank.requestWithdrawal("ACC002", 600.00); 
        bank.requestWithdrawal("ACC001", 300.00);
        bank.requestWithdrawal("ACC003", 1000.00);
        bank.requestWithdrawal("ACC005", 100.00);

        bank.processNextWithdrawalRequest();
        bank.processNextWithdrawalRequest(); 
        bank.processNextWithdrawalRequest(); 
        bank.processNextWithdrawalRequest(); 

        bank.displayAccountsSortedByBalance();

        Account acc1Direct = bank.getAccount("ACC001");
        if (acc1Direct != null) {
            bank.accountsTreeMap.remove(acc1Direct);
            acc1Direct.withdraw(100.00);
            bank.accountsTreeMap.put(acc1Direct, acc1Direct);
        }
        bank.displayAccountsSortedByBalance();
    }
}