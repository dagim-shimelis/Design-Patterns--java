package strategy_pattern.duck_simulator;

public class Silent implements QuackBehavior {
    public void quack() {
        System.out.println("<Silent>");
    }
}
