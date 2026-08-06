package features.entities;

public class Account {

    private final int accNumber;
    private String name;
    private double balance;

    public Account(int accNumber, String name) {
        this.accNumber = accNumber;
        setName(name);
    }

    public Account(int accNumber, String name, double initialDeposit) {
        this(accNumber, name);
        deposit(initialDeposit);
    }

    public void deposit(double value) {
        if (value > 0) {
            balance += value;
        }
    }

    public boolean withdraw(double amount) {
        double totalDeduction = amount + 5.0;

        if (amount > 0 && balance >= totalDeduction) {
            balance -= totalDeduction;
            return true;
        }

        return false;
    }


    public int getAccNumber() {
        return accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            String nameClean = name.trim();
            this.name = nameClean.substring(0, 1).toUpperCase() + nameClean.substring(1);
        }
    }

    @Override
    public String toString() {
        return "Account Data: " + accNumber + "\nHolder: " + name + "\nBalance: $ " + String.format("%.2f", balance);
    }
}