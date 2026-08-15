public class Penguin extends Animal implements CanSee , CanSwim{
    public Penguin(String name, int age) {
        super(name , age , "Penguin");
    }
    @Override
    public void see() {
        System.out.println("Penguin can see");
    }
    @Override
    public void swim() {
        System.out.println("Penguin can swim");
    }
}
