package SOLID.liskov_subsitution;

public class Sparrow extends Bird implements Flyable {
    public void fly() {
        System.out.println("Sparrow flying");
    }
}
