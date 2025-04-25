package com.xworkz.tarun.task.external;

import com.xworkz.tarun.task.internal.Bridge;

public class BridgeInfo {
    private Bridge bridge;


    public  BridgeInfo(Bridge bridge){
   this.bridge=bridge;
    }
    public void bridgeInformation(){
        if(bridge != null){
            System.out.println("The Bridge is running in Bridge information");
        }
        else {
            System.err.println("There is a error in running a bridge class");
        }

    }


}
