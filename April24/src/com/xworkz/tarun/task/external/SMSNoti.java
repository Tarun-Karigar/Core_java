package com.xworkz.tarun.task.external;

import com.xworkz.tarun.task.internal.Notification;

public class SMSNoti implements Notification {
    @Override
    public void typeOfNoti(){
        System.out.println("The Notification is Running in SMS app");
    }

}
