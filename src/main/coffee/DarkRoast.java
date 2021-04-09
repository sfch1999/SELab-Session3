package main.coffee;
import main.interfaces.Beverage;

public class DarkRoast implements Beverage {
    @Override
    public String getDescription() {
        return "Delicious Dark Roast";
    }

    @Override
    public Double cost() {
        return 0.99;
    }
}