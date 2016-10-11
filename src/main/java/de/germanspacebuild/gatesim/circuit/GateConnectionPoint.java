package de.germanspacebuild.gatesim.circuit;

import de.germanspacebuild.gatesim.gates.Gate;

/**
 * Created by Felix on 27.09.2016
 * for GateSim
 *
 * @author Felix
 */
public class GateConnectionPoint implements ICircuitItem {

    private boolean value = false;
    private Gate gate;

    public GateConnectionPoint(boolean value) {
        this.value = value;
    }

    public GateConnectionPoint(boolean value, Gate gate) {
        this.value = value;
        this.gate = gate;
    }

    public void write(boolean value) {
        this.value = value;
    }

    public boolean read() {
        return this.value;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    @Override
    public String toString() {
        return "GateConnectionPoint{" +
                "value=" + value +
                '}';
    }
}
