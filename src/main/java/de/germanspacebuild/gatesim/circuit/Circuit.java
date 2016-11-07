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

    /**
     * Main logic for the circuit.
     * Goes through all gates by their order in the circuit and processes them.
     */
    public void resolve() {

    }

    /**
     * Returns connector that starts at the mentioned gate.
     *
     * @param gate Gate the connector starts at
     * @return Connector that starts at the gate
     */
    public IConnector connectorByGate(Gate gate) {
        for (IConnector connection : connections) {
            if (connection.getStart().getGate() == gate) {
                return connection;
            }
        }
        throw new GateNotInCircuitException("Gate " + gate + " is not part of the circuit.");
    }

    /**
     * Returns list of all {@link GateConnectionPoint}s that are inputs of the circuit.
     *
     * @return List of all input points of circuit
     */
    public List<GateConnectionPoint> getCircuitInputPoints() {
        List<GateConnectionPoint> points = new ArrayList<>();
        List<GateConnectionPoint> outputs = new ArrayList<>();
        for (IConnector connection : connections) {
            if (connection instanceof GateConnector) {
                outputs.add(((GateConnector) connection).getDestination());
            } else if (connection instanceof GateConnectorMulti) {
                outputs.addAll(((GateConnectorMulti) connection).getDestinations());
            }
        }
        for (Gate gate : gates) {
            if (!outputs.contains(gate.getInputAPoint())) {
                points.add(gate.getInputAPoint());
            } else if (!outputs.contains(gate.getInputBPoint())) {
                points.add(gate.getInputBPoint());
            }
        }
        return points;
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
