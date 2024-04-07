package org.amaap.troopsimulator.domain.service.util;

import org.amaap.troopsimulator.domain.model.Archer;
import org.amaap.troopsimulator.domain.model.Barbarian;

import java.util.LinkedList;
import java.util.Queue;

public class Util {
    private static Queue<Barbarian> barbarianWaitListQueue = new LinkedList<>();
    private static Queue<Archer> archerWaitListQueue = new LinkedList<>();

    public static void clearWaitListQueues() {
        barbarianWaitListQueue.clear();
        archerWaitListQueue.clear();
    }
}
