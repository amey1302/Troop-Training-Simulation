package org.amaap.troopsimulator.domain;

import org.amaap.troopsimulator.domain.model.Archer;
import org.amaap.troopsimulator.domain.model.Barbarian;

import java.util.LinkedList;

public class ArmyCamp {
    private LinkedList<Barbarian> trainedBarbarians = new LinkedList<>();
    private LinkedList<Archer> trainedArchers = new LinkedList<>();

    public void receiveTrainedTroops(LinkedList<Barbarian> barbarians, LinkedList<Archer> archers) {
        trainedBarbarians.addAll(barbarians);
        trainedArchers.addAll(archers);
    }

    public LinkedList<Barbarian> getTrainedBarbarians() {
        return trainedBarbarians;
    }

    public LinkedList<Archer> getTrainedArchers() {
        return trainedArchers;
    }
}
