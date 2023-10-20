public class Main {
    public static void main(String[] args) {
        Animal max = new Animal("Max", "Male", "Canis", 3);
        max.eat();
        max.sleep();

        Bird birdy = new Bird("Birdy", "Female", "Animalia", 2, "74");
        birdy.eat();
        birdy.fly();
        birdy.sleep();

        System.out.println(max + "\n" + birdy);
    }
}