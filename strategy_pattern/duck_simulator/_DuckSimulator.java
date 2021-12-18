package strategy_pattern.duck_simulator;

public class _DuckSimulator {
  public static void main(String[] args){
      Duck mallard = new MallardDuck();
      mallard.display();
      mallard.performFly();
      mallard.performQuack();

      System.out.println("------------------------------------------------");
      mallard.setFlyBehavior(new FlyNoWay());
      mallard.setQuackBehavior(new Silent());
      mallard.performFly();
      mallard.performQuack();
  }  
}
