package com.xworkz.tarun.task.external;

import com.xworkz.tarun.task.internal.JDBC;

public class OracleJDBC implements JDBC {
    @Override
    public void save(){
        System.out.println("Jdbc is running in oracle");
    }
}
