abstract class Animal {
    private String name;
    private int age;
    private String species;

    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }
    public String getName() {
        return name;
    }
    public int getAge(String name) {
        return age;
    }
    public String getSpecies(){
        return species;
    }
    public void eat(){
        System.out.println(name+" is eating");
    }
    public void display(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Species : " + species);
    }
}
