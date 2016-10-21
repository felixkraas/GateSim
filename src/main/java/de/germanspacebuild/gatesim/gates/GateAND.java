package de.germanspacebuild.gatesim.gates;

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

    @Override
    public void process() {
        setOutput(getInputAPoint().read() && getInputBPoint().read());
    }
}
