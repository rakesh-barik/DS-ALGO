package headfirst.strategy.duck;

import headfirst.strategy.BaseDuck;

/**
 * Created by rakesh.barik on 16-04-2016.
 */
public class MallardDuck extends BaseDuck {

    public MallardDuck() {

    }

    @Override
    public void display() {
        System.out.println("I am real Mallard Duck");
    }
}
