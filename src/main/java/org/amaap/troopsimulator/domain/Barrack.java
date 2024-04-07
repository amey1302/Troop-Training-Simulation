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

    public void trainTroops() throws InterruptedException {
        Queue<Barbarian> barbarianWaitListQueue = TrainTroop.getBarbarianWaitListQueue();
        Queue<Archer> archerWaitListQueue = TrainTroop.getArcherWaitListQueue();

        while (!barbarianWaitListQueue.isEmpty() || !archerWaitListQueue.isEmpty()) {
            int trainedCount = 0;
            while (trainedCount < maxCapacity) {
                if (!barbarianWaitListQueue.isEmpty() && trainedCount < maxCapacity) {
                    trainTrooperAndWait(barbarianWaitListQueue.poll());
                    trainedCount++;
                }
                if (!archerWaitListQueue.isEmpty() && trainedCount < maxCapacity) {
                    trainTrooperAndWait(archerWaitListQueue.poll());
                    trainedCount++;
                }

                if (barbarianWaitListQueue.isEmpty() && archerWaitListQueue.isEmpty() || trainedCount >= maxCapacity) {
                    break;
                }
            }
            if (trainedCount >= maxCapacity) Thread.sleep(1000);

        }

    }

    private void trainTrooperAndWait(Barbarian barbarian) throws InterruptedException {
        Thread.sleep(barbarian.getTrainingTime() * 1);
        trainedBarbarians.add(barbarian);
    }

    private void trainTrooperAndWait(Archer archer) throws InterruptedException {
        Thread.sleep(archer.getTrainingTime() * 1);
        trainedArchers.add(archer);
    }

    public void transferTrainedTroopsToArmyCamp(ArmyCamp armyCamp) {
        armyCamp.receiveTrainedTroops(trainedBarbarians, trainedArchers);
        trainedBarbarians.clear();
        trainedArchers.clear();
    }

}
