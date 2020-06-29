public class Main {
    Bank account;

    public Main(Bank account) {
        this.account = account;
    }

    public void printAccountNum() {
        System.out.println("Dear " + account.getName() +  ", Your Account Number Is " + account.getAccountNum());
    }

    public void printBalance() {
        System.out.println("Dear " + account.getName() +  ", Your Current Balance Is $" + account.getBalance());
    }

    public void deposit(int amount) {
        account.deposit(amount);
        System.out.println("You Have Deposited $" + amount + ".");
        System.out.println("Your New Balance is " + account.getBalance());
    }

    public void withdraw(int amount) {
        account.withdraw(amount);
        if (amount < account.getBalance()){
            System.out.println("You Have Withdrawn $" + amount + ".");
            System.out.println("Your New Balance is " + account.getBalance());
        }
    }

    public void printInfo() {
        account.printInfo();
    }

    public void exit() {
        System.exit(0);
    }

    public static void main(String[] args) {
        Bank richard = new Bank(999, "Richard",
                "Richard@Flexon.com", 1231231234);
        Main start = new Main(richard);
    }
}
