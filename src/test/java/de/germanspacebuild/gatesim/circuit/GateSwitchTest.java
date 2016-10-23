package de.germanspacebuild.gatesim.circuit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Felix on 23.10.2016
 * for GateSim
 *
 * @author Felix
 */
public class GateSwitchTest {

    private GateSwitch gateSwitch;

    @Before
    public void setUp() throws Exception {
        gateSwitch = new GateSwitch(false);
    }

    @Test
    public void switchStateTest() throws Exception {
        boolean oldState = gateSwitch.getOutput();
        gateSwitch.switchState();
        assertTrue(gateSwitch.getOutput() == !oldState);
    }

    @Test
    public void getOutputTest() throws Exception {
        assertFalse(gateSwitch.getOutput());
    }

    @Test
    public void setOutputTest() throws Exception {
        gateSwitch.setOutput(true);
        assertTrue(gateSwitch.getOutput());
        gateSwitch.setOutput(false);
        assertFalse(gateSwitch.getOutput());
    }

}