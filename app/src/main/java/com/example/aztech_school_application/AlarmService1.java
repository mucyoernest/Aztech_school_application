package com.example.aztech_school_application;

import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class AlarmService1 extends IntentService
{
    private NotificationManager alarmNotificationManager;

    public AlarmService1() {
        super("AlarmService");
    }

    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    public AlarmService1(String name) {
        super(name);
    }

    @Override
    public void onHandleIntent(Intent intent) {
        sendNotification("It is time!");
    }

    private void sendNotification(String msg) {
        Log.d("AlarmService", "Preparing to send notification...: " + msg);
        alarmNotificationManager = (NotificationManager) this
                .getSystemService(Context.NOTIFICATION_SERVICE);

        PendingIntent contentIntent = PendingIntent.getActivity(this, 0,
                new Intent(this, MainActivity.class), 0);

        NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        Notification myNotication;

        Intent intent = new Intent("com.rj.notitfications.SECACTIVITY");

        PendingIntent pendingIntent = PendingIntent.getActivity(getApplicationContext(), 1, intent, 0);

        Notification.Builder builder = new Notification.Builder(getApplicationContext());

        builder.setAutoCancel(false);
        //builder.setTicker("this is ticker text");
        builder.setContentTitle("Alarm Notification");
        builder.setContentText("Alarm Playing");
        builder.setSmallIcon(R.drawable.alupay);
        builder.setContentIntent(pendingIntent);
        builder.setOngoing(true);
        builder.setSubText("This is subtext...");   //API level 16
        builder.setNumber(100);
        builder.build();

        myNotication = builder.getNotification();
        manager.notify(11, myNotication);

    }
}
