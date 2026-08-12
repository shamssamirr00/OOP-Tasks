public class SavingsAccount extends BankAccount {
    public  SavingsAccount(int id , String name, double balance) {
        super(id , name , balance);
    }
    @Override
    public void withdraw(double amount){
        if (amount >0 && amount <=  getBalance()){
            super.withdraw(amount);
        }else {
            System.out.println("Insufficient Balance");
        }
    }
}
