package assigment4.task5;

public class MediatorDemo {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        Colleague colleague1 = new ConcreteColleague1((Mediator) mediator);
        Colleague colleague2 = new ConcreteColleague2((Mediator) mediator);

        mediator.setColleague1(colleague1);
        mediator.setColleague2(colleague2);

        colleague1.send("Hello, Colleague2!");
        colleague2.send("Hi, Colleague1!");
    }
}
