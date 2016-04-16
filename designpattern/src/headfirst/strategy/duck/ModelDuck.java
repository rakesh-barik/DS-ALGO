package headfirst.strategy.duck;

import headfirst.strategy.BaseDuck;
import headfirst.strategy.behaviorImpl.FlyNoWay;
import headfirst.strategy.behaviorImpl.Quack;

/**
 * Created by rakesh.barik on 16-04-2016.
 */
public class ModelDuck extends BaseDuck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();

    }

    @Override
    public void display() {
        System.out.println("I m Model Duck");
    }
}
