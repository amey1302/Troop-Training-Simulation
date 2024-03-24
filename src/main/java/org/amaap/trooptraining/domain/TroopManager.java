package org.amaap.trooptraining.domain;

import org.amaap.trooptraining.domain.model.Troop;
import org.amaap.trooptraining.domain.model.Troopers;
import org.amaap.trooptraining.domain.model.exception.InvalidTroopQuantityException;
import org.amaap.trooptraining.domain.model.exception.InvalidTroopTypeException;

public class TroopManager {
    public Troop createTroop(Troopers troopType, int quantity) throws InvalidTroopTypeException, InvalidTroopQuantityException {
        return Troop.create(troopType,quantity);
    }
}
