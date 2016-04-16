package headfirst.strategy;

import headfirst.strategy.behaviorImpl.FlyRocketPowered;
import headfirst.strategy.duck.MallardDuck;
import headfirst.strategy.duck.ModelDuck;

/**
 * Created by rakesh.barik on 16-04-2016.
 */
public class Test {
    /*
    * Principle used :
    * Favor Composition over Inheritance.
    *
    * Definition
     * The Strategy Pattern : Defines a family of algorithms,
     *                         encapsulates each one,
     *                         and make them interchangeable.
     *   Strategy lets the algorithm vary independently from clients
     *   that use it.
    * */



    public static void main(String arg[]){
        BaseDuck bd = new MallardDuck();
        bd.swim();
        bd.display();
        bd.performFly();
        bd.performQuack();

        BaseDuck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
