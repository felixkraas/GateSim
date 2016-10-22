package de.germanspacebuild.gatesim.gates;

import de.germanspacebuild.gatesim.circuit.GateConnectionPoint;

/**
 * Created by Felix on 22.10.2016
 * for GateSim
 *
 * @author Felix
 */
public class GateXOR extends Gate {

    public GateXOR(boolean inputA, boolean inputB) {
        super(inputA, inputB, GateType.XOR);
    }

    public GateXOR() {
        super(GateType.XOR);
    }

    @Override
    public void process() {
        setOutputPoint(new GateConnectionPoint(getInputAPoint().read() ^ getInputBPoint().read()));
    }
}
