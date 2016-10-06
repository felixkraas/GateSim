package de.germanspacebuild.gatesim.circuit;

import de.germanspacebuild.gatesim.gates.Gate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Felix on 30.09.2016
 * for GateSim
 *
 * @author Felix
 */
public class Circuit {

    private List<IConnector> connections = new ArrayList<>();


    public IConnector connectorByGate(Gate gate) {
        for (IConnector connection : connections) {
            if (connection.getStart().getGate() == gate) {
                return connection;
            }
        }
        return null;
    }

    public void addConnection(IConnector connector) {
        connections.add(connector);
    }

    public void removeConnection(IConnector connection) {
        connections.remove(connection);
    }

    public List<IConnector> getConnections() {
        return connections;
    }
}
