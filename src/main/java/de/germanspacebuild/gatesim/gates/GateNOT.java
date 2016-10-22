package de.germanspacebuild.gatesim.gates;

import de.germanspacebuild.gatesim.circuit.GateConnectionPoint;

/**
 * Created by Felix on 22.10.2016
 * for GateSim
 *
 * @author Felix
 */
public class GateNOT extends Gate {

    public GateNOT(boolean input) {
        super(input, input, GateType.NOT);
    }

    public GateNOT() {
        super(GateType.NOT);
    }

    @Override
    public void process() {
        setInputB(getInputAPoint().read());
        setOutputPoint(new GateConnectionPoint(!getInputAPoint().read()));
    }
}
