package de.germanspacebuild.gatesim.gates;

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

    @Override
    public void process() {
        setOutput(getInputAPoint().read() || getInputBPoint().read());
    }
}
