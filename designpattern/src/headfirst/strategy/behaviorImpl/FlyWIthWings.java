package headfirst.strategy.behaviorImpl;

import headfirst.strategy.changableBehavior.FlyBehavior;

/**
 * Created by rakesh.barik on 16-04-2016.
 */
public class FlyWIthWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I Fly");
    }
}
