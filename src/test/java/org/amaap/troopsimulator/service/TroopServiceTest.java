package org.amaap.troopsimulator.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TroopServiceTest {

    @Test
    void shouldBeAbleToTrainTroopWithValidInputs() {
        // arrange
        int trooperCount = 10;
        String trooperType = "Barbarian";
        String expected = "Training Completed..";

        // act
        String actual = TroopService.train(trooperCount, trooperType);

        // assert
        assertEquals(expected, actual);
    }

}