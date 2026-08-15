public class Bat extends Animal implements CanSee ,CanFly {
    public Bat(String name , int age) {
        super(name , age , "Bat");
    }
    @Override
    public void see(){
        System.out.println("Bat can see");
    }
    @Override
    public void fly() {
        System.out.println("Bat can fly");
    }
}
