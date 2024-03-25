package org.amaap.trooptraining.domain;

import org.amaap.trooptraining.domain.model.ArmyCamp;
import org.amaap.trooptraining.domain.model.Barracks;
import org.amaap.trooptraining.domain.model.Troop;
import org.amaap.trooptraining.domain.model.Trooper;
import org.amaap.trooptraining.domain.model.exception.InvalidTroopException;
import org.amaap.trooptraining.domain.model.exception.InvalidTroopQuantityException;
import org.amaap.trooptraining.domain.model.exception.QuantityExceededCapacityException;

import java.util.List;

public class TroopManager {
    public Troop createTroop(Trooper troop) throws InvalidTroopException{
        return Troop.create(troop);
    }


    public boolean TrainTroop(Troop troop, int quantity) throws InvalidTroopQuantityException, InterruptedException, QuantityExceededCapacityException {
        return  Barracks.trainTroop(troop,quantity);
    }
    public List<Troop> viewTroopCamp(){
        return ArmyCamp.getTrainedTroops();
    }
}
