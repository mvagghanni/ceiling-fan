package io.coding.challenge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CeilingFanTest {

    @Test
    public void testSpeedCord() {
        CeilingFan fan = new CeilingFan();

        assertEquals(0, fan.getSpeed());

        fan.pullSpeedCord();
        assertEquals(1, fan.getSpeed());

        fan.pullSpeedCord();
        assertEquals(2, fan.getSpeed());

        fan.pullSpeedCord();
        assertEquals(3, fan.getSpeed());

        fan.pullSpeedCord();
        assertEquals(0, fan.getSpeed());
    }

    @Test
    public void testDirectionCord() {
        CeilingFan fan = new CeilingFan();

        assertEquals("Normal", fan.getDirection());

        fan.pullDirectionCord();
        assertEquals("Reversed", fan.getDirection());

        fan.pullDirectionCord();
        assertEquals("Normal", fan.getDirection());
    }

    @Test
    public void testSpeedAndDirectionTogether() {
        CeilingFan fan = new CeilingFan();


        fan.pullSpeedCord();
        assertEquals(1, fan.getSpeed());
        assertEquals("Normal", fan.getDirection());

        fan.pullDirectionCord();
        assertEquals("Reversed", fan.getDirection());

        fan.pullSpeedCord();
        assertEquals(2, fan.getSpeed());
        assertEquals("Reversed", fan.getDirection());

        fan.pullSpeedCord();
        assertEquals(3, fan.getSpeed());
        assertEquals("Reversed", fan.getDirection());

        fan.pullSpeedCord();
        assertEquals(0, fan.getSpeed());
        assertEquals("Reversed", fan.getDirection());
    }
}

