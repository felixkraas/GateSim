package de.germanspacebuild.gatesim.circuit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Felix on 27.09.2016
 * for GateSim
 *
 * @author Felix
 */
public class GateConnectorMulti implements IConnector {
    private GateConnectionPoint start;
    private List<GateConnectionPoint> destinations = new ArrayList<>();

    public GateConnectorMulti(GateConnectionPoint start, GateConnectionPoint... destinations) {
        this.start = start;
        this.destinations = Arrays.asList(destinations);
    }

    public GateConnectorMulti(GateConnector connector) {
        this.start = connector.getStart();
        this.destinations.add(connector.getDestination());
    }

    public void addDestination(GateConnectionPoint destination) {
        this.destinations.add(destination);
    }

    public GateConnectionPoint getStart() {
        return start;
    }

    public void setStart(GateConnectionPoint start) {
        this.start = start;
    }

    public List<GateConnectionPoint> getDestinations() {
        return destinations;
    }

    public void setDestinations(List<GateConnectionPoint> destinations) {
        this.destinations = destinations;
    }
}
