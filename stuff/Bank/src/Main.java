public class Main {
    public static void main(String[] args) {
        Bank myBank = new Bank();

        CheckingAccount johnsChecking = new CheckingAccount(
                1001, "John Doe", 5000, 1000);
        SavingsAccount annsSavings = new SavingsAccount(
                1002, "Ann Smith", 3000, 2.5);

        myBank.createAccount(johnsChecking);
        myBank.createAccount(annsSavings);

        System.out.println("\nInitial Bank Accounts:");
        myBank.listAccounts();

        johnsChecking.deposit(1000);
        annsSavings.withdraw(500);

        System.out.println("\nBank Accounts After Operations:");
        myBank.listAccounts();

        myBank.applyInterestToSavingsAccounts();

        System.out.println("\nBank Accounts After Applying Interest:");
        myBank.listAccounts();

        myBank.closeAccount(1001);

        System.out.println("\nBank Accounts After Closing John's Account:");
        myBank.listAccounts();
    }
}