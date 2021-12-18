package strategy_pattern.duck_simulator;

public class FlyNoWay implements FlyBehavior {
    public void fly(){
        System.out.println("i cant fly");
    }
}
