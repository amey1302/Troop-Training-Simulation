package org.amaap.troopsimulator.domain.model;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArcherTest {

    @Test
    void shouldBeAbleToGetTheTrainingTime() {
        // arrange
        Archer archer = new Archer();
        int expectedTrainingTime = 6;

        // act
        int actualTrainingTime = archer.getTrainingTime();

        // assert
        assertEquals(expectedTrainingTime, actualTrainingTime);

    }


    @Test
    void shouldBeAbleToGetTheTrainingCost() {
        // arrange
        Archer archer = new Archer();
        int expectedTrainingCost = 20;

        // act
        int actualTrainingTime = archer.getTrainingCost();

        // assert
        assertEquals(expectedTrainingCost, actualTrainingTime);

    }


}


