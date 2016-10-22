package de.germanspacebuild.gatesim.gates;

import de.germanspacebuild.gatesim.circuit.GateConnectionPoint;

/**
 * Created by Felix on 22.10.2016
 * for GateSim
 *
 * @author Felix
 */
public class GateAND extends Gate {

    public GateAND(boolean inputA, boolean inputB) {
        super(inputA, inputB, GateType.AND);
    }

    public GateAND() {
        super(GateType.AND);
    }

    @Override
    public void process() {
        setOutputPoint(new GateConnectionPoint(getInputAPoint().read() && getInputBPoint().read()));
    }
}
