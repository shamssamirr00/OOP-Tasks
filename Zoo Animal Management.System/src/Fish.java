public class Fish extends Animal implements CanSee , CanSwim {
    public Fish(String name, int age) {
        super(name, age, "Fish");
    }
    @Override
    public void see() {
    System.out.println("Fish can see");
    }
    @Override
    public void swim() {
        System.out.println("Fish can swim");
    }
}
