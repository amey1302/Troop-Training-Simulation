package org.amaap.trooptraining.domain.model;

import org.amaap.trooptraining.domain.model.Troop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArmyCamp {
    private static List<Troop> trainedTroops = Collections.synchronizedList(new ArrayList<>());

    public static void addTrainedTroops(List<Troop> troops) {
        trainedTroops.addAll(troops);
    }

    public static List<Troop> getTrainedTroops() {
        return trainedTroops;
    }
}
