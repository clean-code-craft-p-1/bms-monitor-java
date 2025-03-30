package vitals;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;



public class VitalsCheckerTest {

    @Test
    public void testBatteryIsOkWithinRange() {
        assertTrue(VitalsChecker.batteryIsOk(25, 50, 0.5f));
    }

    @Test
    public void testBatteryIsOkTemperatureOutOfRange() {
        assertFalse(VitalsChecker.batteryIsOk(-1, 50, 0.5f));
        assertFalse(VitalsChecker.batteryIsOk(46, 50, 0.5f));
    }

    @Test
    public void testBatteryIsOkSocOutOfRange() {
        assertFalse(VitalsChecker.batteryIsOk(25, 19, 0.5f));
        assertFalse(VitalsChecker.batteryIsOk(25, 81, 0.5f));
    }

    @Test
    public void testBatteryIsOkChargeRateOutOfRange() {
        assertFalse(VitalsChecker.batteryIsOk(25, 50, 0.9f));
    }
}