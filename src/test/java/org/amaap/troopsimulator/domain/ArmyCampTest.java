package org.amaap.troopsimulator.domain;

import org.amaap.troopsimulator.domain.model.Archer;
import org.amaap.troopsimulator.domain.model.Barbarian;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArmyCampTest {

    @Test
    void shouldBeAbleToReceiveTrainedTroops() {
        // arrange
        ArmyCamp armyCamp = new ArmyCamp();
        LinkedList<Barbarian> trainedBarbarians = new LinkedList<>();
        LinkedList<Archer> trainedArchers = new LinkedList<>();

        Barbarian barbarian1 = new Barbarian();
        Barbarian barbarian2 = new Barbarian();
        trainedBarbarians.add(barbarian1);
        trainedBarbarians.add(barbarian2);
        Archer archer1 = new Archer();
        Archer archer2 = new Archer();
        trainedArchers.add(archer1);
        trainedArchers.add(archer2);

        // act
        armyCamp.receiveTrainedTroops(trainedBarbarians, trainedArchers);

        // assert
        assertEquals(2, armyCamp.getTrainedBarbarians().size());
        assertEquals(2, armyCamp.getTrainedArchers().size());
    }

    @Test
    void shouldBeAbleReturnEmptyListsIfNoTroopsReceived() {
        // arrange
        ArmyCamp armyCamp = new ArmyCamp();

        // act
        LinkedList<Barbarian> trainedBarbarians = armyCamp.getTrainedBarbarians();
        LinkedList<Archer> trainedArchers = armyCamp.getTrainedArchers();

        // assert
        assertEquals(0, trainedBarbarians.size());
        assertEquals(0, trainedArchers.size());
    }

    @Test
    void shouldBeAbleToReturnValidTrooperCount() {
        // arrange
        ArmyCamp armyCamp = new ArmyCamp();
        LinkedList<Barbarian> trainedBarbarians1 = new LinkedList<>();
        LinkedList<Archer> trainedArchers1 = new LinkedList<>();
        LinkedList<Barbarian> trainedBarbarians2 = new LinkedList<>();
        LinkedList<Archer> trainedArchers2 = new LinkedList<>();

        Barbarian barbarian1 = new Barbarian();
        Barbarian barbarian2 = new Barbarian();
        trainedBarbarians1.add(barbarian1);
        trainedBarbarians1.add(barbarian2);

        Archer archer1 = new Archer();
        Archer archer2 = new Archer();
        trainedArchers1.add(archer1);
        trainedArchers1.add(archer2);

        Barbarian barbarian3 = new Barbarian();
        trainedBarbarians2.add(barbarian3);

        Archer archer3 = new Archer();
        Archer archer4 = new Archer();
        trainedArchers2.add(archer3);
        trainedArchers2.add(archer4);

        // act
        armyCamp.receiveTrainedTroops(trainedBarbarians1, trainedArchers1);
        armyCamp.receiveTrainedTroops(trainedBarbarians2, trainedArchers2);

        // assert
        assertEquals(3, armyCamp.getTrainedBarbarians().size());
        assertEquals(4, armyCamp.getTrainedArchers().size());
    }
}
