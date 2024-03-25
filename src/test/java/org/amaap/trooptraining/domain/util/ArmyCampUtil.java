package org.amaap.trooptraining.domain.util;

import static org.amaap.trooptraining.domain.model.ArmyCamp.getTrainedTroops;

public class ArmyCampUtil {
    public static void clearTrainedTroops() {
        getTrainedTroops().clear();
    }
}
