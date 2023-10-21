public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(long accountNumber, String accountHolderName, double initialBalance, double overdraftLimit) {
        super(accountNumber, accountHolderName, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (checkBalance() + overdraftLimit) >= amount) {
            super.withdraw(amount);
        } else {
            System.out.println("Invalid withdrawal amount or exceeding overdraft limit.");
        }
    }

    @Override
    public void displayAccountDetails() {
        System.out.println(this);
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}