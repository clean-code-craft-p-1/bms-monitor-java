package vitals;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import vitals.VitalsChecker;


public class VitalsCheckerTest {

  @Test
  public void testNotOkWhenAnyVitalIsOffRange() throws InterruptedException {
    assertFalse(VitalsChecker.vitalsOk(99f, 102, 70));
    assertTrue(VitalsChecker.vitalsOk(98.1f, 70, 98));
  }
}
