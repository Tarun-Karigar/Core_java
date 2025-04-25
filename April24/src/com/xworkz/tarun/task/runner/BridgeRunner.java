package com.xworkz.tarun.task.runner;

import com.xworkz.tarun.task.external.BridgeInfo;
import com.xworkz.tarun.task.external.RiverBridge;
import com.xworkz.tarun.task.internal.Bridge;

public class BridgeRunner {
    public static void main(String[] args) {

        Bridge bridge = new RiverBridge();
        BridgeInfo bridgeInfo = new BridgeInfo(bridge);
        bridge.bridgeLength();
        bridgeInfo.bridgeInformation();

    }
}
