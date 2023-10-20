public class Bird extends Animal {
    String wingSpan; // CM

    public Bird(String name, String gender, String species, int age, String wingSpan) {
        super(name, gender, species, age);
        this.wingSpan = wingSpan;
    }

    public void fly() {
        System.out.printf("%s is flying!\n", this.name);
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.wingSpan + "CM";
    }
}