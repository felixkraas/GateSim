package de.germanspacebuild.gatesim.circuit;

import de.germanspacebuild.gatesim.gates.Gate;

/**
 * Created by Felix on 30.09.2016
 * for GateSim
 *
 * @author Felix
 */
public class GateConnectionBuilder {

    public static void connectGatesToCircuit(Gate gateA, Gate gateB, Circuit circuit) {
        if (gateA.getOutputPoint() == null) {
            gateA.setOutputPoint(new GateConnectionPoint(false, gateA));
            circuit.addGate(gateB);
        } else {
            if (circuit.connectorByGate(gateA) instanceof GateConnector) {
                GateConnectorMulti connectorMulti = new GateConnectorMulti(((GateConnector) circuit.connectorByGate(gateA)));
                connectorMulti.addDestination(((GateConnector) circuit.connectorByGate(gateA)).getDestination());
                circuit.removeConnection(circuit.connectorByGate(gateA));
                circuit.addConnection(connectorMulti);
            } else {
                circuit.connectorByGate(gateA).addDestination(gateB.getInputAPoint());
            }
            circuit.addGate(gateB);
        }
    }

}
