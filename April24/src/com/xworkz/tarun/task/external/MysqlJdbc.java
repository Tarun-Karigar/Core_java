package com.xworkz.tarun.task.external;

import com.xworkz.tarun.task.internal.JDBC;

public class MysqlJdbc implements JDBC {
    @Override
    public void save(){
        System.out.println("orcale is running in jdbc");
    }

}
