package com.xworkz.tarun.task.runner;

import com.xworkz.tarun.task.external.NotificationInfo;
import com.xworkz.tarun.task.external.SMSNoti;
import com.xworkz.tarun.task.internal.Notification;

public class NotificationRunner {
    public static void main(String[] args) {
        Notification notification=new SMSNoti();
        notification.typeOfNoti();
        NotificationInfo notificationInfo=new NotificationInfo(notification);
        notificationInfo.Notificationinfo1();

    }
}
