package utils.flybehaviours;

import utils.FlyBehaviour;

public class FlyWithNoWings implements FlyBehaviour{
    
    public void fly() {
        System.out.println("No Wings!, can't fly");
    }
}
