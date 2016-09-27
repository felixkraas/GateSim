package de.germanspacebuild.gatesim.circuit;

/**
 * Created by Felix on 27.09.2016
 * for GateSim
 *
 * @author Felix
 */
public class GateConnector {
    private GateConnectionPoint start;
    private GateConnectionPoint destination;

    public GateConnector(GateConnectionPoint start, GateConnectionPoint destination) {
        this.start = start;
        this.destination = destination;
    }

    public GateConnectionPoint getStart() {
        return start;
    }

    public void setStart(GateConnectionPoint start) {
        this.start = start;
    }

    public GateConnectionPoint getDestination() {
        return destination;
    }

    public void setDestination(GateConnectionPoint destination) {
        this.destination = destination;
    }
}
