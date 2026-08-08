
public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("shams samir" , 202 , 2500);
        bankAccount.display();
        bankAccount.deposit(500);
        bankAccount.display();
        bankAccount.withdraw(500);
        bankAccount.display();
        bankAccount.withdraw(4000);
        bankAccount.display();
        System.out.println("Balance is: " + bankAccount.getBalance());
    }
}