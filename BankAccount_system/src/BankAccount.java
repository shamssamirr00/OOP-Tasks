public class BankAccount {
    private int id;
    private String name;
    private double balance;
    private static int total = 0;
    static final String BANK_ACCOUNT_NAME = "Bank Account";

    public BankAccount(int id , String name , double balance ){
    this.id = id;
    this.name = name;
    this.balance = balance;
    total++;
    }
    public void deposit(double amount ){
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposited Successfully");
        }else{
            System.out.println("Invalid amount");
        }
    }
    public void deposit(double amount , String description){
          if (amount > 0) {
              balance += amount;
              System.out.println("Deposited " + description);
          }else{
                 System.out.println("Invalid amount");
          }
    }
    public void withdraw ( double amount){
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw Successfully");
        } else {
        System.out.println("Invalid amount");
        }
    }
    public double getBalance() {
         return balance;
    }
    protected void reduceBalance(double amount) {
        balance -= amount;
    }
    public int getId() {
         return id;
    }
    public String getName(){;
         return name;
    }
    public static int getTotal(){
        return total;
    }
    @Override
    public String toString () {
        return "Bank:" + BANK_ACCOUNT_NAME +
                "\n ID :" + id +
                "\n Ownername :" + name +
                "\n Balance :" + balance;
    }
}
