package strategy_pattern.duck_simulator;

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}
