package de.germanspacebuild.gatesim.gates;

import de.germanspacebuild.gatesim.circuit.GateConnectionPoint;

/**
 * Created by Felix on 22.10.2016
 * for GateSim
 *
 * @author Felix
 */
public class GateNOR extends Gate {

    public GateNOR(boolean inputA, boolean inputB) {
        super(inputA, inputB, GateType.NOR);
    }

    public GateNOR() {
        super(GateType.NOR);
    }

    @Override
    public void process() {
        setOutputPoint(new GateConnectionPoint(!(getInputAPoint().read() | getInputBPoint().read())));
    }
}
