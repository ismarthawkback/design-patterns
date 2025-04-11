package utils.duckimpls;

import strategy.flybehaviours.FlappyFly;
import strategy.quackbehaviours.Quack;
import utils.Duck;
import utils.FlyBehaviour;
import utils.QuackBehaviour;

public class MallardDuck extends Duck {

    private MallardDuck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        super(flyBehaviour, quackBehaviour);
    }

    public MallardDuck() {
        super(new FlappyFly(), new Quack());
    }
    
}
