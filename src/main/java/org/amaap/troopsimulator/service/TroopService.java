package org.amaap.troopsimulator.service;

import org.amaap.troopsimulator.domain.model.Trooper;
import org.amaap.troopsimulator.service.exception.InvalidTroopCountException;
import org.amaap.troopsimulator.service.exception.InvalidTroopTypeException;

import java.util.EnumSet;

import static org.amaap.troopsimulator.service.validator.TroopTypeValidator.isNotInEnum;

public class TroopService {
    public static String train(int trooperCount, String troopType) throws InvalidTroopCountException, InvalidTroopTypeException {
        if(trooperCount <= 0)
            throw new InvalidTroopCountException("Invalid Troop Count Exception "+trooperCount);
        if(isNotInEnum(troopType, Trooper.class))
            throw new InvalidTroopTypeException("Invalid Troop Type Exception "+troopType);

        return "Training Completed..";
    }
}
