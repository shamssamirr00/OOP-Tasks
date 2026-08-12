public class CurrentAccount extends BankAccount {
    public CurrentAccount(int id , String name, double balance) {
        super(id,name,balance);
    }
    @Override
    public void withdraw(double amount) {
        if (amount > 0 &&  amount <= getBalance() + 500) {
            reduceBalance(amount);
        }else
            System.out.println("Insufficient funds!");
    }
}
