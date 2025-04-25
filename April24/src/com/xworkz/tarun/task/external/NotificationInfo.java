package com.xworkz.tarun.task.external;

import com.xworkz.tarun.task.internal.Notification;

public class NotificationInfo {
    private Notification notification;
    public NotificationInfo(Notification notification){
    this.notification=notification;
    }
    public void  Notificationinfo1(){
        if(notification!= null){
            System.out.println("The Notification is running in Notification app");
        }
        else {
            System.err.println("The notification contains some errors");
        }
    }
}
