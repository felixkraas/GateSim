package de.germanspacebuild.gatesim.gates;

import de.germanspacebuild.gatesim.circuit.GateConnectionPoint;

/**
 * Created by Felix on 22.10.2016
 * for GateSim
 *
 * @author Felix
 */
public class GateNAND extends Gate {

    public GateNAND(boolean inputA, boolean inputB) {
        super(inputA, inputB, GateType.NAND);
    }

    public GateNAND() {
        super(GateType.NAND);
    }

    @Override
    public void process() {
        setOutputPoint(new GateConnectionPoint(!(getInputAPoint().read() & getInputBPoint().read())));
    }
}
