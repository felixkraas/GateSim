package de.germanspacebuild.gatesim.circuit;

/**
 * Created by Felix on 27.09.2016
 * for GateSim
 *
 * @author Felix
 */
public class GateConnector implements IConnector, ICircuitItem {
    private GateConnectionPoint start;
    private GateConnectionPoint destination;

    public GateConnector(GateConnectionPoint start, GateConnectionPoint destination) {
        this.start = start;
        this.destination = destination;
    }

    @Override
    public boolean isDestination(GateConnectionPoint connectionPoint) {
        return destination == connectionPoint;
    }

    @Override
    public boolean isStart(GateConnectionPoint connectionPoint) {
        return start == connectionPoint;
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

    @Override
    public void addDestination(GateConnectionPoint destination) {
        setDestination(destination);
    }
}
