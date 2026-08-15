public class Dolphin extends Animal implements CanSee , CanSwim{
    public Dolphin(String name, int age) {
        super(name , age , "Dolphin");
    }
    @Override
    public void see() {
        System.out.println("Dolphin can sees");
    }
    @Override
    public void swim() {
        System.out.println("Dolphin can swim");
    }
}
