public class Account {
    private String accountNumber;
    private double balance;
    private AccountState state;

    public Account(String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.state = new ActiveState();
    }

    public AccountState getState() {
        return state;
    }

    public void setState(AccountState state) {
        this.state = state;
    }

    public void deposit(Double amount) {
        state.deposit(this, amount);
    }

    public void withdraw(Double amount) {
        state.withdraw(this, amount);
    }

    public void activate() {
        state.activate(this);
    }

    public void suspend() {
        state.suspend(this);
    }

    public void close() {
        state.close(this);
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return "Account " + accountNumber + " | Balance: " + balance;
    }
}
