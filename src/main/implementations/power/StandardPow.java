package main.implementations.power;

import main.interfaces.Mult;
import main.interfaces.Power;

public class StandardPow extends Power {

    public StandardPow(Mult mult) {
        super(mult);
    }

    @Override
    public Integer power(int base, int exponent) {
        int result = 1;
        while (exponent != 0) {
            result = mult.mult(result, base);
            --exponent;
        }
        return result;
    }
}