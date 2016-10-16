package de.germanspacebuild.gatesim.circuit;

import de.germanspacebuild.gatesim.exceptions.GateNotInCircuitException;
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
    private List<Gate> gates = new ArrayList<>();

    public Circuit(Gate gate) {
        gates.add(gate);
    }

    public IConnector connectorByGate(Gate gate) {
        for (IConnector connection : connections) {
            if (connection.getStart().getGate() == gate) {
                return connection;
            }
        }
        throw new GateNotInCircuitException("Gate " + gate + " is not part of the circuit.");
    }

    public void addConnection(IConnector connector) {
        connections.add(connector);
    }

    public void addGate(Gate gate) {
        gates.add(gate);
    }

    public void removeConnection(IConnector connection) {
        connections.remove(connection);
    }

    public List<IConnector> getConnections() {
        return connections;
    }

    public List<Gate> getGates() {
        return gates;
    }
}
