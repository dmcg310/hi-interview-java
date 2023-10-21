public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(long accountNumber, String accountHolderName, double initialBalance, double interestRate) {
        super(accountNumber, accountHolderName, initialBalance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = checkBalance() * (interestRate / 100);
        deposit(interest);
    }

    @Override
    public void displayAccountDetails() {
        System.out.println(this);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}