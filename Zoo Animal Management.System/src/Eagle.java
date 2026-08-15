public class Eagle extends Animal implements CanSee , CanFly{
    public Eagle(String name, int age) {
        super (name , age , "Eagle");
    }
    @Override
    public void see(){
        System.out.println("Eagle can see");
    }
    @Override
    public void fly(){
        System.out.println("Eagle can fly");
    }
}
