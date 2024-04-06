package org.amaap.troopsimulator.service;

import org.amaap.troopsimulator.service.exception.InvalidTroopCountException;
import org.amaap.troopsimulator.service.exception.InvalidTroopTypeException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TroopServiceTest {

    @Test
    void shouldBeAbleToTrainTroopWithValidInputs() throws InvalidTroopCountException, InvalidTroopTypeException {
        // arrange
        int trooperCount = 10;
        String trooperType = "Barbarian";
        String expected = "Training Completed..";

        // act
        String actual = TroopService.train(trooperCount, trooperType);

        // assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldThrowAnInvalidTroopCountException() {
        // arrange
        int trooperCount = -1;
        // act & assert
        Exception exception = assertThrows(InvalidTroopCountException.class,()->{
            TroopService.train(trooperCount,"Barbarian");
        });
        assertEquals("Invalid Troop Count Exception "+trooperCount,exception.getMessage());

        assertThrows(InvalidTroopCountException.class,()->{
            TroopService.train(0,"Barbarian");
        });
    }
    @Test
    void shouldThrowAnInvalidTroopTypeException() {
        // arrange
        String troopType = "Magician";
        // act & assert
        Exception exception = assertThrows(InvalidTroopTypeException.class,()->{
            TroopService.train(10,troopType);
        });
        assertEquals("Invalid Troop Type Exception "+troopType,exception.getMessage());
    }
}