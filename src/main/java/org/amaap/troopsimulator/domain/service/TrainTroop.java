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
        for (int i = 0; i < trooperCount; i++) {
            Barbarian barbarian = new Barbarian(); // Create a new instance for each trooper
            barbarianWaitListQueue.add(barbarian);
        }
    }

    private static void trainArcher(int trooperCount) {
        for (int i = 0; i < trooperCount; i++) {
            Archer archer = new Archer(); // Create a new instance for each trooper
            archerWaitListQueue.add(archer);
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
