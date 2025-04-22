package com.xworkz.tarun.external;

import com.xworkz.tarun.internal.rule.Hospital;

public class AppollHospital implements Hospital {
    @Override
    public  void clean(){
        System.out.println("The clean is running in Appollohospital....");
    }

}
