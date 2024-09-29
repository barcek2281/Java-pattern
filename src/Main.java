import SOLID.dependency_inversion.*;

public class Main {
    public static void main(String[] args) {
        Button button = new Button(new Light());
        button.press();
        button.release();
    }
}