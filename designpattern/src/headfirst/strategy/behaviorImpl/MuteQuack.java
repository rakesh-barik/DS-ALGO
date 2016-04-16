package headfirst.strategy.behaviorImpl;

import headfirst.strategy.changableBehavior.QuackBehavior;

/**
 * Created by rakesh.barik on 16-04-2016.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Silence");
    }
}
