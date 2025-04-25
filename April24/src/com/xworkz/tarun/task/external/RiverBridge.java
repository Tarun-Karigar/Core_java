package com.xworkz.tarun.task.external;

import com.xworkz.tarun.task.internal.Bridge;

public class RiverBridge implements Bridge {
    @Override
    public void bridgeLength(){
        System.out.println("The Bridge length of River Bridge is 10km");
    }
}
