package headfirst.strategy;

import headfirst.strategy.changableBehavior.FlyBehavior;
import headfirst.strategy.behaviorImpl.FlyWIthWings;
import headfirst.strategy.behaviorImpl.Quack;
import headfirst.strategy.changableBehavior.QuackBehavior;

/**
 * Created by rakesh.barik on 16-04-2016.
 */
public abstract class BaseDuck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public BaseDuck() {
        flyBehavior = new FlyWIthWings();
        quackBehavior = new Quack();
    }

    public void swim(){
        System.out.println("Duck swim");
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }
    public abstract void display();

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
