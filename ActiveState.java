public class ActiveState implements AccountState {
    @Override
    public void deposit(Account account, Double amount) {
        account.setBalance(account.getBalance() + amount);
        System.out.println("Deposited " + amount + ". " + account);
    }

    @Override
    public void withdraw(Account account, Double amount) {
        account.setBalance(account.getBalance() - amount);
        System.out.println("Withdrew " + amount + ". " + account);
    }

    @Override
    public void activate(Account account) {
        System.out.println("Account is already activated!");
    }

    @Override
    public void suspend(Account account) {
        account.setState(new SuspendedState());
        System.out.println("Account is suspended!");
    }

    @Override
    public void close(Account account) {
        account.setState(new ClosedState());
        System.out.println("Account is closed!");
    }
}
