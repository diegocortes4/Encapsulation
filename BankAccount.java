public class BankAccount {
    private double balance;  // Private attribute for the balance
    private String accountHolder;  // Private attribute for the account holder's name

    // Constructor to initialize the balance and account holder
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Getter to retrieve the balance
    public double getBalance() {
        return balance;
    }

    // Setter to deposit funds
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Setter to withdraw funds
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    // Getter to retrieve the account holder's name
    public String getAccountHolder() {
        return accountHolder;
    }

    // Setter to change the account holder (with controlled access)
    public void setAccountHolder(String newAccountHolder) {
        if (newAccountHolder != null && !newAccountHolder.isEmpty()) {
            accountHolder = newAccountHolder;
        }
    }

    // Method to print account information
    public void printInformation() {
        System.out.println("Account of: " + accountHolder);
        System.out.println("Current balance: $" + balance);
    }

    public static void main(String[] args) {
        // Create a new instance of BankAccount
        BankAccount account = new BankAccount("John Doe", 1000.0);

        // Print the initial account information
        account.printInformation();

        // Deposit and withdraw funds
        account.deposit(500.0);
        account.withdraw(200.0);

        // Print updated account information
        account.printInformation();

        // Change the account holder's name
        account.setAccountHolder("Jane Smith");

        // Print account information after changing the account holder's name
        account.printInformation();
    }
}
