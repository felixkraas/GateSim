package de.germanspacebuild.gatesim.gates;

import de.germanspacebuild.gatesim.circuit.GateConnectionPoint;

/**
 * Created by Felix on 22.10.2016
 * for GateSim
 *
 * @author Felix
 */
public class GateXNOR extends Gate {

    public GateXNOR(boolean inputA, boolean inputB) {
        super(inputA, inputB, GateType.XNOR);
    }

    public GateXNOR() {
        super(GateType.XNOR);
    }

    @Override
    public void process() {
        setOutputPoint(new GateConnectionPoint(getInputAPoint().read() == getInputBPoint().read()));
    }
}
