package org.amaap.trooptraining.domain.model.exception;

public class QuantityExceededCapacityException  extends InvalidTroopException{
    public QuantityExceededCapacityException(String message) {
        super(message);
    }
}
