package tests;
import main.implementations.multiply.RecursiveMult;
import main.implementations.multiply.StandardMult;
import main.implementations.power.RecursivePow;
import main.implementations.power.StandardPow;
import main.interfaces.Power;
import org.junit.Test;
import org.junit.Assert;

public class PowerTest {
    @Test
    public void testPowerStandardRecursive() {
        Power power = new StandardPow(new RecursiveMult());
        Assert.assertEquals(81, power.power(3, 4), 0);
    }

    @Test
    public void testPowerRecursiveRecursive() {
        Power power = new RecursivePow(new RecursiveMult());
        Assert.assertEquals(81, power.power(3, 4), 0);
    }

    @Test
    public void testPowerRecursiveStandard(){
        Power power = new RecursivePow(new StandardMult());
        Assert.assertEquals(81, power.power(3, 4), 0);
    }

    @Test
    public void testPowerStandardStandard(){
        Power power = new StandardPow(new StandardMult());
        Assert.assertEquals(81, power.power(3, 4), 0);
    }
}