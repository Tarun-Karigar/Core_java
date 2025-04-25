package com.xworkz.tarun.task.external;

import com.xworkz.tarun.task.internal.Bike;

public class BikeInfo {
    private Bike bike;
   public BikeInfo(Bike bike){
       this.bike=bike;
   }
   public void BikeInformatin(){
       if(bike !=null){
           System.out.println("The Bike is running in Bike info");
       }
       else {
           System.err.println("The Bike is Not Running ");
       }

   }
}
