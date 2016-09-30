package de.germanspacebuild.gatesim.gates;

import de.germanspacebuild.gatesim.circuit.CircuitItem;
import de.germanspacebuild.gatesim.circuit.GateConnectionPoint;

/**
 * Created by Felix on 23.09.2016
 * for GateSim
 *
 * @author Felix
 */
public abstract class Gate implements CircuitItem {

    protected GateType type;
    private GateConnectionPoint inputA;
    private GateConnectionPoint inputB;
    private GateConnectionPoint output;

    public Gate(boolean inputA, boolean inputB) {
        this.inputA = new GateConnectionPoint(inputA);
        this.inputB = new GateConnectionPoint(inputB);
        this.output = new GateConnectionPoint(false);
    }

    public abstract void process();

    public boolean isInputA() {
        return inputA.read();
    }

    public void setInputA(boolean inputA) {
        this.inputA.write(inputA);
    }

    public boolean isInputB() {
        return inputB.read();
    }

    public void setInputB(boolean inputB) {
        this.inputB.write(inputB);
    }

    public boolean getOutput() {
        return output.read();
    }

    public void setOutput(boolean output) {
        this.output.write(output);
    }

    public GateType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Gate{" +
                "type=" + type +
                ", inputA=" + inputA +
                ", inputB=" + inputB +
                ", output=" + output +
                '}';
    }
}
