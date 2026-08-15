public class Lion extends Animal implements CanSee {
    public Lion(String name, int age) {
        super(name , age , "Lion");
    }
    @Override
    public void see() {
        System.out.println("Lion can see");
    }
}
