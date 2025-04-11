package utils;

public abstract class Duck {
    public QuackBehaviour quackBehaviour;
    public FlyBehaviour flyBehaviour;


    public void fly() {
        flyBehaviour.fly();
    }

    public void quack() {
        quackBehaviour.quack();
    }
}
