package com.xworkz.tarun.task.external;

import com.xworkz.tarun.task.internal.Notification;

public class EmailNoti implements Notification {
    @Override
    public void typeOfNoti(){
        System.out.println("The notification is Running in Email app");
    }

}
