public class Cash_on_Delivery extends Payment{
    public Cash_on_Delivery(int id , double amount , String date) {
        super(id, amount, date);
    }
    @Override
    public void processPayment() {
        System.out.println("processing cash on Delivery");
        setPaymentStatus("pending");
    }
}
