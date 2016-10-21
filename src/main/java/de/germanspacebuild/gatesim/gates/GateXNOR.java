package de.germanspacebuild.gatesim.gates;

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

    @Override
    public void process() {
        setOutput(getInputAPoint().read() == getInputBPoint().read());
    }
}
