package main.implementations.power;

import main.interfaces.Mult;
import main.interfaces.Power;

public class RecursivePow extends Power {

    public RecursivePow(Mult mult) {
        super(mult);
    }

    @Override
    public Integer power(int base, int exponent) {
        if (exponent != 0) {
            return mult.mult(base, power(base, exponent - 1));
        }
        else {
            return 1;
        }
    }
}