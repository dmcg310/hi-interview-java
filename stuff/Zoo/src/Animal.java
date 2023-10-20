public class Animal {
    String name;
    String gender;
    String species;
    int age;

    public Animal(String name, String gender, String species, int age) {
        this.name = name;
        this.gender = gender;
        this.species = species;
        this.age = age;
    }

    public void eat() {
        System.out.printf("%s is eating!\n", this.name);
    }

    public void sleep() {
        System.out.printf("%s is sleeping!\n", this.name);
    }

    @Override
    public String toString() {
        return this.name + " " + this.species + " " + this.gender + " " + this.age;
    }
}