import SOLID.dependency_inversion.*;
import assigment2.AbstractFactoryPattern.Laptop;
import assigment2.AbstractFactoryPattern.Smartphone;
import assigment2.BuilderPattern.House;
import assigment2.BuilderPattern.HouseBuilder;
import assigment2.FactoryMethodPattern.Notification;
import assigment2.FactoryMethodPattern.NotificationFactory;
import assigment2.PrototypePattern.Shape;
import assigment2.PrototypePattern.ShapeCache;
import assigment2.SingletonPattern.DatabaseConnection;

public class Main {
    public static void main(String[] args) {
        // Singleton Pattern Example
        System.out.println("Singleton Pattern:");
        DatabaseConnection connection1 = DatabaseConnection.getInstance();
        DatabaseConnection connection2 = DatabaseConnection.getInstance();
        System.out.println(connection1 == connection2); // true, same instance
        System.out.println();
// Factory Method Pattern Example
        System.out.println("Factory Method Pattern:");
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification emailNotification = notificationFactory.createNotification("EMAIL");
        Notification smsNotification = notificationFactory.createNotification("SMS");
        emailNotification.notifyUser();
        smsNotification.notifyUser();
        System.out.println();
// Abstract Factory Pattern Example
        System.out.println("Abstract Factory Pattern:");

// Builder Pattern Example
        System.out.println("Builder Pattern:");
        House house = new House( new HouseBuilder("a", "b").withGarage(true) );
        System.out.println(house);
        System.out.println();

// Prototype Pattern Example

        System.out.println("Prototype Pattern:");
        ShapeCache.loadCache();
        Shape clonedShape1 = ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape1.getType());
        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());
    }
}