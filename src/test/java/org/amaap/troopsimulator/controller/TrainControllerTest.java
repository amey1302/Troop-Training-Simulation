package org.amaap.troopsimulator.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainControllerTest {
    @Test
    void shouldBeAbleToTakeInputs() {
        // arrange
        TrainController trainController = new TrainController();
        int trooperCount = 10;
        String trooperType = "Barbarian";
        String expected = "Training Completed..";

        // act
        String actual = trainController.train(trooperCount, trooperType);

        // assert
        assertEquals(expected, actual);
    }

}