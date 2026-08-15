public class Bank_Trasfer extends Payment{
    public Bank_Trasfer( int id , double amount , String date ){
        super(id,amount,date);
    }
    @Override
    public void processPayment() {
        System.out.println("processing payPal");
        setPaymentStatus("Successful");
    }
}
