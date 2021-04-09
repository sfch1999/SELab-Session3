package main.decorators;

import main.interfaces.Beverage;
import main.interfaces.PreservativeDecorator;

public class SteamedMilk extends PreservativeDecorator {
    public SteamedMilk(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return super.getDescription() + " with milk";
    }

    public Double cost() {
        return super.cost() + 0.10;
    }
}