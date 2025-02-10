public interface AccountState {
    void deposit(Account account, Double amount);
    void withdraw(Account account, Double amount);
    void activate(Account account);
    void suspend(Account account);
    void close(Account account);
}
