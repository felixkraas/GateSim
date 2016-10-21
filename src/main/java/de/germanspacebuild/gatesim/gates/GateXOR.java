package de.germanspacebuild.gatesim.gates;

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

    @Override
    public void process() {
        setOutput(getInputAPoint().read() ^ getInputBPoint().read());
    }
}
