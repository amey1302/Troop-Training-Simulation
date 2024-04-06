package org.amaap.troopsimulator.domain.model;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BarbarianTest {

    @Test
    void shouldBeAbleToGetTheTrainingTime() {
        // arrange
        Barbarian barbarian = new Barbarian();
        int expectedTrainingTime = 3;

        // act
        int actualTrainingTime = barbarian.getTrainingTime();

        // assert
        assertEquals(expectedTrainingTime, actualTrainingTime);
    }

    @Test
    void shouldBeAbleToGetTheTrainingCost() {
        // arrange
        Barbarian barbarian = new Barbarian();
        int expectedTrainingCost = 10;

        // act
        int actualTrainingTime = barbarian.getTrainingCost();

        // assert
        assertEquals(expectedTrainingCost, actualTrainingTime);
    }
}


