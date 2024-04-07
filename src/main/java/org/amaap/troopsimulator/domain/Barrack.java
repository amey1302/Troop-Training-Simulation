package org.amaap.troopsimulator.domain;

import org.amaap.troopsimulator.domain.model.Archer;
import org.amaap.troopsimulator.domain.model.Barbarian;
import org.amaap.troopsimulator.domain.service.TrainTroop;

import java.util.LinkedList;
import java.util.Queue;

public class Barrack {

    private final int maxCapacity = 10;
    private LinkedList<Barbarian> trainedBarbarians = new LinkedList<>();
    private LinkedList<Archer> trainedArchers = new LinkedList<>();

    public void trainTroops() {
        Queue<Barbarian> barbarianWaitListQueue = TrainTroop.getBarbarianWaitListQueue();
        Queue<Archer> archerWaitListQueue = TrainTroop.getArcherWaitListQueue();

        int totalBarbarians = barbarianWaitListQueue.size();
        int totalArchers = archerWaitListQueue.size();

        while (!barbarianWaitListQueue.isEmpty() || !archerWaitListQueue.isEmpty()) {
            int trainedCount = 0;
            while (trainedCount < maxCapacity) {
                if (!barbarianWaitListQueue.isEmpty() && trainedCount < maxCapacity) {
                    trainTrooperAndWait(barbarianWaitListQueue.poll(), "Barbarian");
                    trainedCount++;
                    totalBarbarians--; // Decrement only if a barbarian is trained
                }
                if (!archerWaitListQueue.isEmpty() && trainedCount < maxCapacity) {
                    trainTrooperAndWait(archerWaitListQueue.poll(), "Archer");
                    trainedCount++;
                    totalArchers--; // Decrement only if an archer is trained
                }
                // If both queues are empty or if the trained count equals or exceeds maxCapacity, break the loop
                if (barbarianWaitListQueue.isEmpty() && archerWaitListQueue.isEmpty() || trainedCount >= maxCapacity) {
                    break;
                }
            }
            // Print the message only if the trained count equals or exceeds maxCapacity
            if (trainedCount >= maxCapacity) {
                System.out.println("Barrack is full after training " + maxCapacity + " troops. Remaining troops in the queue: Barbarian - " +
                        totalBarbarians + ", Archer - " + totalArchers);
            }
        }

        int totalTroops = trainedBarbarians.size() + trainedArchers.size();
        if (totalTroops > 0) {
            System.out.println("Total trained troops: " + totalTroops);
        } else {
            System.out.println("No troops trained.");
        }

        if (!trainedBarbarians.isEmpty()) {
            System.out.println("Total trained Barbarians: " + trainedBarbarians.size());
        }
        if (!trainedArchers.isEmpty()) {
            System.out.println("Total trained Archers: " + trainedArchers.size());
        }


    }


    private void trainTrooperAndWait(Barbarian barbarian, String troopType) {
        try {
            System.out.println(troopType + " " + barbarian.getId() + " is training...");
            Thread.sleep(barbarian.getTrainingTime() * 100); // Convert seconds to milliseconds
            trainedBarbarians.add(barbarian);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void trainTrooperAndWait(Archer archer, String troopType) {
        try {
            System.out.println(troopType + " " + archer.getId() + " is training...");
            Thread.sleep(archer.getTrainingTime() * 100); // Convert seconds to milliseconds
            trainedArchers.add(archer);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public LinkedList<Barbarian> getTrainedBarbarians() {
        return trainedBarbarians;
    }

    public LinkedList<Archer> getTrainedArchers() {
        return trainedArchers;
    }
}
