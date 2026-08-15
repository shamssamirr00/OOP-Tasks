public class Dog extends Animal implements CanSee ,CanSwim{
    public Dog(String name, int age) {
        super(name , age , "Dog");
    }
    @Override
    public void see() {
        System.out.println("Dog can see");
    }
    @Override
    public void swim() {
        System.out.println("Doل can swim");
    }
}
