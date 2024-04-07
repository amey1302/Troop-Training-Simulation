package org.amaap.troopsimulator.domain.util;

import org.amaap.troopsimulator.domain.model.Archer;
import org.amaap.troopsimulator.domain.model.Barbarian;

import java.util.LinkedList;

public class BarrackUtil {
    private LinkedList<Barbarian> trainedBarbarians = new LinkedList<>();
    private LinkedList<Archer> trainedArchers = new LinkedList<>();

    public void clearTrainedListQueues() {

        trainedArchers.clear();
        trainedBarbarians.clear();
    }
}
