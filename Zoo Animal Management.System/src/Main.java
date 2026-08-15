public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Lion("Simba", 2),
                new Eagle("Eagle", 3),
                new Fish("Nemo", 4),
                new Bat("Batman", 5),
                new Penguin("Pingu", 6),
                new Dolphin("Rissos", 7),
                new Dog("Alx", 8)
        };
        for (Animal animal : animals) {
            animal.display();
            animal.eat();
        }
    }
}