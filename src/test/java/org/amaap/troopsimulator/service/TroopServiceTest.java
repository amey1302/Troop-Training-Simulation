package org.amaap.troopsimulator.service;

import org.amaap.troopsimulator.service.exception.InvalidTroopCountException;
import org.amaap.troopsimulator.service.exception.InvalidTroopTypeException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TroopServiceTest {

    @Test
    void shouldBeAbleToTrainTroopWithValidInputOfBarbarian() throws InvalidTroopCountException, InvalidTroopTypeException {
        // arrange
        int trooperCount = 10;
        String trooperType = "Barbarian";


        // act
        boolean actual = TroopService.train(trooperCount, trooperType);

        // assert
        assertTrue(actual);
    }

    @Test
    void shouldBeAbleToTrainTroopWithValidInputOfArcher() throws InvalidTroopCountException, InvalidTroopTypeException {
        // arrange
        int trooperCount = 10;
        String trooperType = "Archer";


        // act
        boolean actual = TroopService.train(trooperCount, trooperType);

        // assert
        assertTrue(actual);
    }

    @Test
    void shouldThrowAnInvalidTroopCountException() {
        // arrange
        int trooperCount = -1;
        // act & assert
        Exception exception = assertThrows(InvalidTroopCountException.class, () -> {
            TroopService.train(trooperCount, "Barbarian");
        });
        assertEquals("Invalid TroopType Count Exception " + trooperCount, exception.getMessage());

        assertThrows(InvalidTroopCountException.class, () -> {
            TroopService.train(0, "Barbarian");
        });
    }

    @Test
    void shouldThrowAnInvalidTroopTypeException() {
        // arrange
        String troopType = "Magician";

        // act & assert
        Exception exception = assertThrows(InvalidTroopTypeException.class, () -> {
            TroopService.train(10, troopType);
        });
        assertEquals("Invalid TroopType Type Exception " + troopType, exception.getMessage());
        // arrange

    }


}
