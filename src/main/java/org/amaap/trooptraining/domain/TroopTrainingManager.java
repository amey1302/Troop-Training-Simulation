package org.amaap.trooptraining.domain;

import org.amaap.trooptraining.domain.model.Troop;
import org.amaap.trooptraining.domain.model.Troopers;

public class TroopTrainingManager {
    public Troop createTroop(Troopers troopType, int trainingTime) {
        return new Troop(troopType,trainingTime);
    }
}
