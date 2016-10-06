package de.germanspacebuild.gatesim.circuit;

/**
 * Created by Felix on 29.09.2016
 * for GateSim
 *
 * @author Felix
 */
public interface IConnector {

    GateConnectionPoint getStart();

    void setStart(GateConnectionPoint start);

    void addDestination(GateConnectionPoint destination);
}
