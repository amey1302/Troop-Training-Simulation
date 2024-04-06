package org.amaap.troopsimulator.controller;

import org.amaap.troopsimulator.service.TroopService;
import org.amaap.troopsimulator.service.exception.InvalidTroopCountException;
import org.amaap.troopsimulator.service.exception.InvalidTroopTypeException;

public class TrainController {
    public String train(int trooperCount, String trooperType) throws InvalidTroopCountException, InvalidTroopTypeException {
        return TroopService.train(trooperCount, trooperType);
    }
}
