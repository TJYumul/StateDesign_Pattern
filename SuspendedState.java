public class SuspendedState implements AccountState {
    @Override
    public void deposit(Account account, Double amount) {
        System.out.println("You cannot deposit on a suspended account. " + account);
    }

    @Override
    public void withdraw(Account account, Double amount) {
        System.out.println("You cannot withdraw on a suspended account. " + account);
    }

    @Override
    public void activate(Account account) {
        account.setState(new ActiveState());
        System.out.println("Account is activated!");
    }

    @Override
    public void suspend(Account account) {
        System.out.println("Account is already suspended.");
    }

    @Override
    public void close(Account account) {
        account.setState(new ClosedState());
        System.out.println("Account is closed!");
    }
}
