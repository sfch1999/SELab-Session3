package main.decorators;

import main.interfaces.Beverage;
import main.interfaces.PreservativeDecorator;

public class Mocha extends PreservativeDecorator {

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return super.getDescription() + " with mocha";
    }

    public Double cost() {
        return super.cost() + 0.20;
    }
}