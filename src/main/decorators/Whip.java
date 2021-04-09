package main.decorators;

import main.interfaces.Beverage;
import main.interfaces.PreservativeDecorator;

public class Whip extends PreservativeDecorator {

    public Whip(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return super.getDescription() + " with whip";
    }

    public Double cost() {
        return super.cost() + 0.10;
    }
}