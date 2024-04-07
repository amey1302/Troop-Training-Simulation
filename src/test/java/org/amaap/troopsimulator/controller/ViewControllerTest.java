package org.amaap.troopsimulator.controller;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ViewControllerTest {

    @Test
    void shouldBeAbleToGetTheTrainedTrooperData() throws InterruptedException {
        // arrange
        ViewController viewController = new ViewController();

        // act
        LinkedList<Object> actual = viewController.getTrainedData();

        // assert
        assertEquals(0, actual.size());

    }
}