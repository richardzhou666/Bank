import java.util.Random;

public class Bank {
    private final int accountNum;
    private double balance;
    private final String name;
    private final String email;
    private final long phone;

    public Bank(double balance, String name, String email, long phone) {
        Random rand = new Random();
        accountNum = (int) (Math.pow(10, 8) + 9 * rand.nextInt((int) Math.pow(10, 8)));
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.println("Dear " + name);
        System.out.println("Your Account Number is " + accountNum);
        System.out.println("Your Phone Number is " + phone);
        System.out.println("Your Email is " + email);
        System.out.println("Your Account Balance is $" + balance);
        System.out.println("Thank You For Your Business. Have A Nice Day!");
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Dear " + name + ", Your Balance Is Insufficient!");
            System.out.println("Your Current Available Balance Is $" + getBalance());
            return;
        }
        balance -= amount;
    }
}
