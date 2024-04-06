package org.amaap.troopsimulator.service;

import org.amaap.troopsimulator.domain.model.TroopType;
import org.amaap.troopsimulator.domain.service.TrainTroop;
import org.amaap.troopsimulator.service.exception.InvalidTroopCountException;
import org.amaap.troopsimulator.service.exception.InvalidTroopTypeException;

import static org.amaap.troopsimulator.service.validator.TroopTypeValidator.isNotInEnum;

public class TroopService {
    public static  boolean train(int trooperCount, String troopType) throws InvalidTroopCountException, InvalidTroopTypeException {
        if(trooperCount <= 0)
            throw new InvalidTroopCountException("Invalid TroopType Count Exception "+trooperCount);
        if(isNotInEnum(troopType, TroopType.class))
            throw new InvalidTroopTypeException("Invalid TroopType Type Exception "+troopType);

        return TrainTroop.train(trooperCount,troopType);
    }
}
