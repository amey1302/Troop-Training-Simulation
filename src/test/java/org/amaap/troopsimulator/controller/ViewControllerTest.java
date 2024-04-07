package org.amaap.troopsimulator.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ViewControllerTest {

    @Test

    void shouldBeAbleToGetTheTrainedTrooperData()
    {
        ViewController viewController=new  ViewController();

       boolean actual= viewController.getTrainedData();

       assertTrue(actual);

    }
}
