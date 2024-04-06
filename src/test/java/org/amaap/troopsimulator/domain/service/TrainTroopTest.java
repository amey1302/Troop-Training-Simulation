package org.amaap.troopsimulator.domain.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TrainTroopTest {

    @Test
    void shouldBeAbleToTrainTheBarbarian() {
        // arrange
        int troopCount = 10;
        String troopType = "Barbarian";

        // act
        boolean actual = TrainTroop.train(troopCount, troopType);

        // assert
        assertTrue(actual);
    }
}