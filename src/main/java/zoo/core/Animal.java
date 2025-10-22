package zoo.core;

/**
 * Represents a general animal in the zoo.
 * Provides basic validation for name and age.
 * Subclasses must implement makeSound() and getSpecies().
 */
public abstract class Animal {
    // Data fields
    private final int id;
    private String name;
    private int age;

    // Constructor
    public Animal(int id, String name, int age) {
        this.id = id;
        this.name = name;
        setAge(age);
    }

    // Geters and Setters
    public int getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) { 
        validateName(name);
        this.name = name;
    }

    public int getAge() { return age; }
    public void setAge(int age) {
        validateAge(age);
        this.age = age;
    }

    // Abstract Methods
    public abstract void makeSound();
    public abstract String getSpecies();

    // Concrete Methods
    @Override
    public String toString() {
        return String.format(
            "Animal{id=%d, species=%s, name='%s', age=%d}",
            id, getSpecies(), name, age
        );
    }

    public void info() {
        System.out.println("#" + id + " - " + getSpecies() + " - " + name + " (" + age + " yaşında)");
    }

    // Util Methods
    protected void validateName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null.");
        }
        if (name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty or only whitespace.");
        }
        if (name.length() > 64) {
            throw new IllegalArgumentException("Name length cannot exceed 64 characters.");
        }
    }

    protected void validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age can not be smaller than zero: " + age);
        }
    }
}