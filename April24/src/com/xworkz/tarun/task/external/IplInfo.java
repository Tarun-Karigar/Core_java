package com.xworkz.tarun.task.external;

import com.xworkz.tarun.task.internal.JDBC;

public class IplInfo{

   private JDBC jdbc;
    public  IplInfo(JDBC jdbc)
    {
        System.out.println("Running ipl app ");
        this.jdbc=jdbc;
    }


    public void saveinfo() {
        if (jdbc != null){
            System.out.println("The save info is running");
        }
        else
        {
            System.err.println("Therre is error");
        }
    }
}
