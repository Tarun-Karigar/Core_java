package com.xworkz.tarun.task.runner;

import com.xworkz.tarun.task.external.IplInfo;
import com.xworkz.tarun.task.external.MysqlJdbc;
import com.xworkz.tarun.task.external.OracleJDBC;
import com.xworkz.tarun.task.internal.JDBC;


public class JdbcRunner {
    public static void main(String[] args) {
        JDBC jdbc =new MysqlJdbc();
        IplInfo iplInfo=new IplInfo(jdbc);
        iplInfo.saveinfo();

        }
    }

