package org.amaap.troopsimulator.domain.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TrainTroopTest {

    @BeforeEach
    void setUp() {
        // Clear the wait list queues before each test
        TrainTroop.clearWaitListQueues();
    }

    @Test
    void shouldBeAbleCreateTheNumberOfBarbarianTroopsBeforeTraining() {
        // arrange
        TrainTroop trainTroop = new TrainTroop();
        int troopCount = 20;
        String troopType = "Barbarian";

        // act
        boolean actual = trainTroop.train(troopCount, troopType);

        // assert
        System.out.println(trainTroop.getBarbarianWaitListQueue());
        assertTrue(actual);
    }


    @Test
    void shouldBeAbleCreateTheNumberOfArcherTroopsBeforeTraining() {
        // arrange
        TrainTroop trainTroop = new TrainTroop();
        int troopCount = 30;
        String troopType = "Archer";

        // act
        boolean actual = trainTroop.train(troopCount, troopType);

        // assert
        System.out.println(trainTroop.getArcherWaitListQueue());
        assertTrue(actual);
    }
}