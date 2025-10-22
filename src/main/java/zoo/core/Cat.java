package zoo.core;

public class Cat extends Animal {
    // Constructor
    public Cat (int id, String name, int age) {
        super(id, name, age);
    }

    // Overritten Methods
    @Override
    public void makeSound() {
        System.out.print(getName() + " says " + "Meow!\n");
    }
    @Override
    public String getSpecies() {
        return "Cat";
    }
    @Override 
    public void feed() {
        System.out.print(getName() + " ate fish.\n");
    }
}