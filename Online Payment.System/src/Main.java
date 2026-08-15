public class Main {
    public static void main(String[] args) {
        Payment p1 =new Credit_Card( 1 , 1500 , "15/8/2026") ;
        Payment p2 =new Credit_Card( 2 , 3000 , "15/8/2026");
        Payment p3 =new Credit_Card( 3 , 4500 , "15/8/2026");
        Payment p4 =new Credit_Card( 4 , 5500 , "15/8/2026");
        p1.processPayment();
        p1.display();
        p2.processPayment();
        p2.display();
        p3.processPayment();
        p3.display();
        p4.processPayment();
        p4.display();
    }
}