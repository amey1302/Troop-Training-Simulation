package org.amaap.troopsimulator.domain.service;

import org.amaap.troopsimulator.domain.ArmyCamp;
import org.amaap.troopsimulator.domain.model.Archer;
import org.amaap.troopsimulator.domain.model.Barbarian;
import org.amaap.troopsimulator.domain.util.BarrackUtil;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ViewTroopTest {
    BarrackUtil barrackUtil = new BarrackUtil();

    @AfterEach
    void setUp() {
        barrackUtil.clearTrainedListQueues();
    }

    @Test
    void shouldBeAbleToViewTrainedBarbarians() {
        // Arrange
        ArmyCamp armyCamp = new ArmyCamp();
        LinkedList<Barbarian> mockBarbarians = new LinkedList<>();
        mockBarbarians.add(new Barbarian());
        mockBarbarians.add(new Barbarian());
        mockBarbarians.add(new Barbarian());
        armyCamp.receiveTrainedTroops(mockBarbarians, new LinkedList<>());

        // Act
        ViewTroop viewTroop = new ViewTroop(armyCamp);
        LinkedList<Barbarian> trainedBarbarians = viewTroop.viewTrainedBarbarians();

        // Assert
        assertEquals(3, trainedBarbarians.size());
    }

    @Test
    void shouldBeAbleToViewTrainedArchers() {
        // Arrange
        ArmyCamp armyCamp = new ArmyCamp();
        LinkedList<Archer> mockArchers = new LinkedList<>();
        mockArchers.add(new Archer());
        mockArchers.add(new Archer());
        armyCamp.receiveTrainedTroops(new LinkedList<>(), mockArchers);

        // Act
        ViewTroop viewTroop = new ViewTroop(armyCamp);
        LinkedList<Archer> trainedArchers = viewTroop.viewTrainedArchers();

        // Assert
        assertEquals(2, trainedArchers.size());
    }

    @Test
    void shouldBeAbleToViewCombinedTrainedTroops() {
        // arrange
        ArmyCamp armyCamp = new ArmyCamp();
        LinkedList<Barbarian> mockBarbarians = new LinkedList<>();
        mockBarbarians.add(new Barbarian());
        mockBarbarians.add(new Barbarian());
        LinkedList<Archer> mockArchers = new LinkedList<>();
        mockArchers.add(new Archer());
        armyCamp.receiveTrainedTroops(mockBarbarians, mockArchers);

        // act
        ViewTroop viewTroop = new ViewTroop(armyCamp);
        LinkedList<Object> combinedTroops = viewTroop.viewCombinedTrainedTroops();

        // assert
        assertEquals(3, combinedTroops.size()); // Combined count of barbarians and archers
    }
}
