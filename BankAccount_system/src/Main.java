public class Main {
    public static void main(String[] args){
        SavingsAccount savingsAccount = new SavingsAccount(1 , "shams" , 2000);
        CurrentAccount currentAccount = new CurrentAccount(2 , "samir" , 4000);
        savingsAccount.deposit(1000);
        savingsAccount.withdraw(1500);
        currentAccount.deposit(900 , " Salary");
        currentAccount.withdraw(1800);
        System.out.println(savingsAccount);
        System.out.println(currentAccount);
        BankAccount bankAccount1 = new SavingsAccount(3 , "Amr" , 6000);
        bankAccount1.withdraw(1000);
        System.out.println("Total Account" + BankAccount.getTotal());
    }
}
