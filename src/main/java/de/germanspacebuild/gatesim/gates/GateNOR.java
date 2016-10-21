package de.germanspacebuild.gatesim.gates;

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

    @Override
    public void process() {
        setOutput(!(getInputAPoint().read() | getInputBPoint().read()));
    }
}
