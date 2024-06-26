package org.amaap.trooptraining.domain;

import org.amaap.trooptraining.domain.model.Barracks;
import org.amaap.trooptraining.domain.model.Troop;
import org.amaap.trooptraining.domain.model.Trooper;
import org.amaap.trooptraining.domain.model.exception.InvalidTroopException;
import org.amaap.trooptraining.domain.model.exception.InvalidTroopQuantityException;
import org.amaap.trooptraining.domain.model.exception.InvalidTroopTypeException;
import org.amaap.trooptraining.domain.model.exception.QuantityExceededCapacityException;
import org.amaap.trooptraining.domain.util.ArmyCampUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TroopManagerTest {
    @BeforeEach
    void setUp() {
        // Clear trained troop list before each test
        ArmyCampUtil.clearTrainedTroops();
    }
    @Test
    void shouldAbleToCreateTroopWithTypeBarbarian() throws InvalidTroopException {
        //Arrange
        Trooper troopType = Trooper.Barbarian;
        Troop expected = Troop.create(troopType);

        //Act
        TroopManager troopTrainingManager = new TroopManager();
        Troop actual = troopTrainingManager.createTroop(troopType);
        //Assert
        assertEquals(expected, actual);

    }

    @Test
    void shouldAbleToCreateTroopWithTypeArcher() throws InvalidTroopException {
        //Arrange
        Trooper troopType = Trooper.Archer;
        Troop expected = Troop.create(troopType);

        //Act
        TroopManager troopTrainingManager = new TroopManager();
        Troop actual = troopTrainingManager.createTroop(troopType);

        //Assert
        assertEquals(expected, actual);

    }

    @Test
    void shouldAbleToTrainTrooperWithTypeArcher() throws InvalidTroopTypeException, InvalidTroopQuantityException, InterruptedException, QuantityExceededCapacityException {
        //Arrange
        Troop troop = Troop.create(Trooper.Archer);
        Barracks.getCapacity();
        int quantityBeingTrained = 5;
        boolean expected = Barracks.trainTroop(troop,quantityBeingTrained);
        //Act
        TroopManager troopTrainingManager = new TroopManager();

        boolean actual = troopTrainingManager.TrainTroop(troop,quantityBeingTrained);

        //Assert
        assertEquals(expected, actual);

    }@Test
    void shouldAbleToViewTheTroopFromArmyCamp() throws InvalidTroopTypeException, InvalidTroopQuantityException, InterruptedException, QuantityExceededCapacityException {
        //Arrange
        Troop troop = Troop.create(Trooper.Archer);
        int quantityBeingTrained = 5;


        //Act
        TroopManager troopTrainingManager = new TroopManager();
        troopTrainingManager.TrainTroop(troop,quantityBeingTrained);
        List<Troop> trainedTroops = troopTrainingManager.viewTroopCamp();


        //Assert
        assertEquals(quantityBeingTrained, trainedTroops.size());

    }

}
