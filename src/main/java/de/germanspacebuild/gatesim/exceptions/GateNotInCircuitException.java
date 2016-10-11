package de.germanspacebuild.gatesim.exceptions;

/**
 * Created by Felix on 10.10.2016
 * for GateSim
 *
 * @author Felix
 */
public class GateNotInCircuitException extends RuntimeException {

    public GateNotInCircuitException() {
        super();
    }

    public GateNotInCircuitException(String message) {
        super(message);
    }
}
