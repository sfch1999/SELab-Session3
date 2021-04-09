package main.interfaces;

import main.interfaces.Beverage;

public abstract class PreservativeDecorator  implements Beverage {
    private Beverage beverage;

    public PreservativeDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public Double cost() {
        return beverage.cost();
    }
}