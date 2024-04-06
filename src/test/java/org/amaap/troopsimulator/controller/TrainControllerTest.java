package org.amaap.troopsimulator.controller;

import org.amaap.troopsimulator.service.exception.InvalidTroopCountException;
import org.amaap.troopsimulator.service.exception.InvalidTroopTypeException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainControllerTest {
    @Test
    void shouldBeAbleToTakeInputs() throws InvalidTroopCountException, InvalidTroopTypeException {
        // arrange
        TrainController trainController = new TrainController();
        int trooperCount = 10;
        String trooperType = "Barbarian";

        // act
        boolean  actual = trainController.train(trooperCount, trooperType);

        // assert
        assertTrue(actual);
    }

}