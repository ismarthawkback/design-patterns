package strategy;

import utils.Duck;
import utils.duckimpls.MallardDuck;

public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.fly();
        mallardDuck.quack();
    }
}
