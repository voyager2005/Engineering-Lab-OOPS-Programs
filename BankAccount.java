package lab4;

class BankAccount 
{
    private String depositorName;
    private String accountNumber;
    private String accountType;
    private double balance;
    private static double rateOfInterest = 4.5; // Static data member

    
    public BankAccount() 
    {
        this.depositorName = "Divyansh Gupta";
        this.accountNumber = "235890236";
        this.accountType = "Savings";
        this.balance = 70000000.0;
    }

    // Parameterized constructor
    public BankAccount(String depositorName, String accountNumber, String accountType, double balance) 
    {
        this.depositorName = depositorName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    // Method to deposit amount
    public void deposit(double amount) 
    {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw amount
    public void withdraw(double amount) 
    {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    // Method to display all details of an account holder
    public void displayAccountDetails() 
    {
        System.out.println("Depositor Name: " + depositorName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }

    // Static method to display rate of interest
    public static void displayRateOfInterest() 
    {
        System.out.println("Rate of Interest: " + rateOfInterest + "%");
    }

    // Main method to illustrate usage
    public static void main(String[] args) {
        // Using default constructor
        BankAccount acc1 = new BankAccount();
        acc1.displayAccountDetails();
        acc1.deposit(1000);
        acc1.withdraw(500);
        acc1.displayAccountDetails();
        
        // Using parameterized constructor
        BankAccount acc2 = new BankAccount("Akshat G", "235890190", "Checking", 50.0);
        acc2.displayAccountDetails();
        acc2.deposit(500);
        acc2.withdraw(200);
        acc2.displayAccountDetails();
        
        // Displaying rate of interest
        BankAccount.displayRateOfInterest();
    }
}
