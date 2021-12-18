package strategy_pattern.duck_simulator;
public abstract class Duck {
    Duck(){};
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performFly(){
        flyBehavior.fly();
    };
    public void performQuack(){
        quackBehavior.quack();
    };
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    };
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    };

    public abstract void display();

    public void swim(){
        System.out.println("All ducks can swim so im swimming!");
    };
}