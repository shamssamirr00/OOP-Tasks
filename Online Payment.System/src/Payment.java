abstract class Payment {
    private int paymentId;
    private double amount;
    private String paymentDate;
    private String paymentStatus;

    public Payment(int id, double amount, String paymentDate) {
        this.paymentId = id;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.paymentStatus = "Pending";
    }
    public int getPaymentId() {
        return paymentId;
    }
    public double getAmount() {
        return amount;
    }
    public String getPaymentDate() {
        return paymentDate;
    }
    public String getPaymentStatus() {
        return paymentStatus;
    }
    public void setPaymentStatus (String paymentStatus ){
        this.paymentStatus = paymentStatus;
    }
    public abstract void processPayment();

    public void display(){
        System.out.println("Payment Id: " + paymentId);
        System.out.println("Amount: " + amount);
        System.out.println("Payment Date: " + paymentDate);
        System.out.println("Payment Status: " + paymentStatus);
    }
}
