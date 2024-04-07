package org.amaap.troopsimulator.repository;

import org.amaap.troopsimulator.domain.model.Archer;
import org.amaap.troopsimulator.domain.model.Barbarian;

import java.util.LinkedList;

public class FakeTroopDatabase {
    private LinkedList<Object> trainedTroops = new LinkedList<>();

    public LinkedList<Object> getTrainedTroops() {
        return trainedTroops;
    }

    public void setTrainedTroops(LinkedList<Object> trainedTroops) {
        this.trainedTroops = trainedTroops;
    }

    public void storeCombinedTrainedTroops(LinkedList<Object> combinedTroops) {
        trainedTroops.addAll(combinedTroops);
        setTrainedTroops(trainedTroops);
    }
}
