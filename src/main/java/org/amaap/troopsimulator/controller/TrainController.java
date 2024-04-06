package org.amaap.troopsimulator.controller;

import org.amaap.troopsimulator.service.TroopService;

public class TrainController {
    public String train(int trooperCount, String trooperType) {
        return TroopService.train(trooperCount, trooperType);
    }
}
