package org.amaap.trooptraining.domain;

import org.amaap.trooptraining.domain.model.Troop;
import org.amaap.trooptraining.domain.model.TroopType;

public class TroopTrainingManager {
    public Troop createTroop(TroopType troopType, int trainingTime, int trainingCost) {
        return new Troop(troopType,trainingTime,trainingCost);
    }
}
