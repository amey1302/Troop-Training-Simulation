package org.amaap.troopsimulator.domain;

import org.amaap.troopsimulator.domain.model.Archer;
import org.amaap.troopsimulator.domain.model.Barbarian;
import org.amaap.troopsimulator.domain.service.TrainTroop;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BarrackTest {
    @Test
    void shouldBeAbleToTrainBarbarianInGivenTimeWhenSentToBarrack() {
        // arrange
        TrainTroop trainTroop = new TrainTroop();
        int troopCount = 20;
        String troopType = "Barbarian";
        trainTroop.train(troopCount, troopType);
        Queue<Barbarian> expected = new LinkedList<>(TrainTroop.getBarbarianWaitListQueue());

        // act
        Barrack barrack = new Barrack();
        barrack.trainTroops();
        Queue<Barbarian> actual = barrack.getTrainedBarbarians();

        // assert
        assertEquals(expected, actual, "Trained ");
    }


    @Test
    void shouldBeAbleToTrainArcherInGivenTimeWhenIsSentToBarrack() {
        // arrange
        TrainTroop trainTroop = new TrainTroop();
        int troopCount = 30;
        String troopType = "Archer";
        trainTroop.train(troopCount, troopType);
        Queue<Archer> expected = new LinkedList<>(TrainTroop.getArcherWaitListQueue());

        // act
        Barrack barrack = new Barrack();
        barrack.trainTroops();
        Queue<Archer> actual = barrack.getTrainedArchers();

        // assert
        assertEquals(expected, actual);

    }

    @Test
    void shouldBeAbleToTrainBothArcherAndBarbarianInGivenTimeWhenSentToBarrack()
    {
        // arrange
        TrainTroop trainTroop = new TrainTroop();
        int troopCountForBarbarian = 5;
        String troopTypeForBarbarian = "Barbarian";
        trainTroop.train(troopCountForBarbarian, troopTypeForBarbarian);

        int troopCountForArcher = 4;
        String troopTypeForArcher = "Archer";
        trainTroop.train(troopCountForArcher, troopTypeForArcher);
        Barrack barrack = new Barrack();

        // act
        barrack.trainTroops();

        // assert
        LinkedList<Barbarian> trainedBarbarians = barrack.getTrainedBarbarians();
        LinkedList<Archer> trainedArchers = barrack.getTrainedArchers();

        LinkedList<Object> trainedTroopers = new LinkedList<>();
        trainedTroopers.addAll(trainedBarbarians);
        trainedTroopers.addAll(trainedArchers);

        assertEquals(9, trainedTroopers.size());

    }
}