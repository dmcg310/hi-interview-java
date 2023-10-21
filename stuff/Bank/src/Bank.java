import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts = new ArrayList<>();

    public void createAccount(Account account) {
        accounts.add(account);
        System.out.println("Account created: " + account.getAccountNumber());
    }

    public void closeAccount(long accountNumber) {
        accounts.removeIf(account -> account.getAccountNumber() == accountNumber);
        System.out.println("Account closed: " + accountNumber);
    }

    public void listAccounts() {
        for (Account account : accounts) {
            account.displayAccountDetails();
        }
    }

    public void applyInterestToSavingsAccounts() {
        for (Account account : accounts) {
            if (account instanceof SavingsAccount) {
                ((SavingsAccount) account).applyInterest();
            }
        }
    }
}