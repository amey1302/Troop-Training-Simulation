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
    void shouldBeAbleToGetTheTotalWaitingListWhenBarbarianIsSentToBarrack() {
        // arrange
        TrainTroop trainTroop = new TrainTroop();
        int troopCount = 20;
        String troopType = "Barbarian";
        trainTroop.train(troopCount, troopType);
        Queue<Barbarian> expected = TrainTroop.getBarbarianWaitListQueue();

        // act
        Barrack barrack = new Barrack();
        barrack.setBarbarianQueue(new LinkedList<>(TrainTroop.getBarbarianWaitListQueue()));
        Queue<Barbarian> actual = barrack.getWaitQueOfBarbarian();

        // assert
        assertEquals(expected, actual);
    }


    @Test
    void shouldBeAbleToGetTheTotalWaitingListWhenArcherIsSentToBarrack() {
        // arrange
        TrainTroop trainTroop = new TrainTroop();
        int troopCount = 30;
        String troopType = "Archer";
        trainTroop.train(troopCount, troopType);
        Queue<Archer> expected = TrainTroop.getArcherWaitListQueue();

        // act
        Barrack barrack = new Barrack();
        barrack.setArcherQueue(new LinkedList<>(TrainTroop.getArcherWaitListQueue()));
        Queue<Archer> actual = barrack.getWaitQueOfArcher();

        // assert
        assertEquals(expected, actual);
    }

}