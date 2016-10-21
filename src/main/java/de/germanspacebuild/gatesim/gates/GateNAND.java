package de.germanspacebuild.gatesim.gates;

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

    @Override
    public void process() {
        setOutput(!(getInputAPoint().read() & getInputBPoint().read()));
    }
}
