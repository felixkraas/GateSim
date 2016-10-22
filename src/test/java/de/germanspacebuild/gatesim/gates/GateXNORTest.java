package de.germanspacebuild.gatesim.gates;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Felix on 22.10.2016
 * for GateSim
 *
 * @author Felix
 */
public class GateXNORTest {

    private GateXNOR gate;

    @Before
    public void setUp() throws Exception {
        gate = new GateXNOR(false, false);
    }

    @Test
    public void processTrueTrue() throws Exception {
        gate.setInputA(true);
        gate.setInputB(true);
        gate.process();
        assertTrue(gate.getOutput());
    }

    @Test
    public void processTrueFalse() throws Exception {
        gate.setInputA(true);
        gate.setInputB(false);
        gate.process();
        assertFalse(gate.getOutput());
    }

    @Test
    public void processFalseTrue() throws Exception {
        gate.setInputA(false);
        gate.setInputB(true);
        gate.process();
        assertFalse(gate.getOutput());
    }

    @Test
    public void processFalseFalse() throws Exception {
        gate.setInputA(false);
        gate.setInputB(false);
        gate.process();
        assertTrue(gate.getOutput());
    }
}