package strategy_pattern.duck_simulator;

public class FlyWithWings implements FlyBehavior {
    public void fly(){
        System.out.println("im flying");
    }
}
