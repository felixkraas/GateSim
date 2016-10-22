package de.germanspacebuild.gatesim.gates;

import de.germanspacebuild.gatesim.circuit.GateConnectionPoint;

/**
 * Created by Felix on 22.10.2016
 * for GateSim
 *
 * @author Felix
 */
public class GateOR extends Gate {

    public GateOR(boolean inputA, boolean inputB) {
        super(inputA, inputB, GateType.OR);
    }

    public GateOR() {
        super(GateType.OR);
    }

    @Override
    public void process() {
        setOutputPoint(new GateConnectionPoint(getInputAPoint().read() || getInputBPoint().read()));
    }
}
