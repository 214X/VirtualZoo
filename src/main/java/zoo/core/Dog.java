package zoo.core;

public class Dog extends Animal{
    // Constrcutor 
    public Dog (int id, String name, int age) {
        super(id, name, age);
    }

    // Overritten Methods
    @Override
    public void makeSound() {
        System.out.print(getName() + " says " + "Woof woof!\n");
    }
    @Override
    public String getSpecies() {
        return "Dog";
    }
    @Override 
    public void feed() {
        System.out.print(getName() + " ate bone.\n");
    }
}