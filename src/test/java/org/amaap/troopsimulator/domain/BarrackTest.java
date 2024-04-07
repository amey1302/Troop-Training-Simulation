package org.amaap.troopsimulator.domain;

import org.amaap.troopsimulator.domain.model.Archer;
import org.amaap.troopsimulator.domain.model.Barbarian;
import org.amaap.troopsimulator.domain.service.TrainTroop;
import org.amaap.troopsimulator.domain.util.BarrackUtil;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BarrackTest {
    BarrackUtil barrackUtil = new BarrackUtil();
    private ArmyCamp armyCamp = new ArmyCamp();

    @AfterEach
    void setUp() {
        barrackUtil.clearTrainedListQueues();
    }

    @Test
    void shouldBeAbleToTrainBarbarianInGivenTimeWhenSentToBarrack() throws InterruptedException {
        // arrange
        TrainTroop trainTroop = new TrainTroop();
        int troopCount = 20;
        String troopType = "Barbarian";
        trainTroop.train(troopCount, troopType);

        // act
        Barrack barrack = new Barrack();
        barrack.trainTroops();
        barrack.transferTrainedTroopsToArmyCamp(armyCamp);

        // assert
        LinkedList<Barbarian> trainedBarbarians = armyCamp.getTrainedBarbarians();
        assertEquals(troopCount, trainedBarbarians.size());
    }

    @Test
    void shouldBeAbleToTrainArcherInGivenTimeWhenIsSentToBarrack() throws InterruptedException {
        // arrange
        TrainTroop trainTroop = new TrainTroop();
        int troopCount = 30;
        String troopType = "Archer";
        trainTroop.train(troopCount, troopType);
        Queue<Archer> expected = new LinkedList<>(TrainTroop.getArcherWaitListQueue());

        // act
        Barrack barrack = new Barrack();
        barrack.trainTroops();
        barrack.transferTrainedTroopsToArmyCamp(armyCamp);

        // assert
        LinkedList<Archer> actual = armyCamp.getTrainedArchers();
        assertEquals(expected, actual);
    }

    @Test
    void shouldBeAbleToTrainBothArcherAndBarbarianInGivenTimeWhenSentToBarrack() throws InterruptedException {
        // arrange
        TrainTroop trainTroop = new TrainTroop();
        int troopCountForBarbarian = 5;
        String troopTypeForBarbarian = "Barbarian";
        trainTroop.train(troopCountForBarbarian, troopTypeForBarbarian);

        int troopCountForArcher = 4;
        String troopTypeForArcher = "Archer";
        trainTroop.train(troopCountForArcher, troopTypeForArcher);

        // act
        Barrack barrack = new Barrack();
        barrack.trainTroops();
        barrack.transferTrainedTroopsToArmyCamp(armyCamp);

        // assert
        LinkedList<Barbarian> trainedBarbarians = armyCamp.getTrainedBarbarians();
        LinkedList<Archer> trainedArchers = armyCamp.getTrainedArchers();

        LinkedList<Object> trainedTroopers = new LinkedList<>();
        trainedTroopers.addAll(trainedBarbarians);
        trainedTroopers.addAll(trainedArchers);

        assertEquals(troopCountForBarbarian + troopCountForArcher, trainedTroopers.size());
    }
}
