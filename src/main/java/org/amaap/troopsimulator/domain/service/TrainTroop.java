package org.amaap.troopsimulator.domain.service;

import org.amaap.troopsimulator.domain.model.Archer;
import org.amaap.troopsimulator.domain.model.Barbarian;

import java.util.LinkedList;
import java.util.Queue;

public class TrainTroop {
    private static Queue<Barbarian> barbarianWaitListQueue = new LinkedList<>();
    private static Queue<Archer> archerWaitListQueue = new LinkedList<>();

    public static boolean train(int trooperCount, String troopType) {
        switch (troopType.toLowerCase()) {
            case "barbarian":
                trainBarbarian(trooperCount);
                break;
            case "archer":
                trainArcher(trooperCount);
                break;
            default:
                throw new IllegalArgumentException("Invalid troop type: " + troopType);
        }
        return true;
    }

    private static void trainBarbarian(int trooperCount) {
        Barbarian troop = new Barbarian();
        for (int i = 0; i < trooperCount; i++) {
            barbarianWaitListQueue.add(troop);
        }
    }

    private static void trainArcher(int trooperCount) {
        Archer troop = new Archer();
        for (int i = 0; i < trooperCount; i++) {
            archerWaitListQueue.add(troop);
        }
    }

    public static Queue<Barbarian> getBarbarianWaitListQueue() {
        return barbarianWaitListQueue;
    }

    public static Queue<Archer> getArcherWaitListQueue() {
        return archerWaitListQueue;
    }

    public static void clearWaitListQueues() {
        barbarianWaitListQueue.clear();
        archerWaitListQueue.clear();
    }
}
