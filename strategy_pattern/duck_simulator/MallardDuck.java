package strategy_pattern.duck_simulator;

public class MallardDuck extends Duck {
    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Squeak();
    };

    public void display(){
        System.out.println("im a MallardDuck");
    }
}
