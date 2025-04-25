package com.xworkz.tarun.task.external;

import com.xworkz.tarun.task.internal.Bridge;

public class SeaBridge implements Bridge {
    @Override
    public void bridgeLength(){
        System.out.println("The Bridge length of Sea Bridge is 10km");
    }
}
