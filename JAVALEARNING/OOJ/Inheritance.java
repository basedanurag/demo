
class Account {
    private String accNo;
    private String name;
    private String address;
    private String phno;
    private String dob;
    protected long balance; // protected so subclasses can access

    public Account(String acc, String n, String add, String phno, String dob) {
        accNo = acc;
        name = n;
        address = add;
        this.phno = phno;
        this.dob = dob;
        balance = 0;
    }

    public String getAccNo() { return accNo; }
    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getPhno() { return phno; }
    public String getDOB() { return dob; }
    public long getBalance() { return balance; }

    public void setAddress(String add) { address = add; }
    public void setPhno(String phno) { this.phno = phno; }
}

class SavingsAccount extends Account {
    public SavingsAccount(String acc, String n, String add, String phno, String dob) {
        super(acc, n, add, phno, dob); // calling parent constructor
    }

    public void deposit(long amt) {
        balance += amt;
    }

    public void withdraw(long amt) {
        balance -= amt;
    }
}

class LoanAccount extends Account {
    public LoanAccount(String acc, String n, String add, String phno, String dob) {
        super(acc, n, add, phno, dob); // calling parent constructor
    }

    public void payEMI(long amt) {
        balance -= amt;
    }

    public void repay(long amt) {
        if (balance == amt) {
            balance = 0;
        }
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // Create a Savings Account
        SavingsAccount sa = new SavingsAccount("1001", "Rahul", "Delhi", "9876543210", "01-01-2000");

        // Deposit and Withdraw
        sa.deposit(5000);
        System.out.println("Savings Account Balance after deposit: " + sa.getBalance());

        sa.withdraw(1500);
        System.out.println("Savings Account Balance after withdrawal: " + sa.getBalance());

        // Create a Loan Account
        LoanAccount la = new LoanAccount("2001", "Priya", "Mumbai", "9123456780", "05-05-1995");

        // Simulate Loan repayment
        la.balance = 10000; // setting loan amount directly for demo
        la.payEMI(2000);
        System.out.println("Loan Account Balance after EMI: " + la.getBalance());

        la.repay(8000);
        System.out.println("Loan Account Balance after full repayment: " + la.getBalance());
    }
}
