package com.wakatech.invatarejuridica.helper;

import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.graphics.Color;
import android.os.Build;

public class BaseApp extends Application {
    public static final String CHANNEL_1_ID = "CHANNEL1ID";

    @Override
    public void onCreate() {
        super.onCreate();

        createNotificatoinChannel();
}

    private void createNotificatoinChannel() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel(
                    CHANNEL_1_ID,
                    "Notificari",
                    NotificationManager.IMPORTANCE_DEFAULT
            );
            channel.setLightColor(Color.CYAN);
            channel.setDescription("Notificari");

            NotificationManager nm = getSystemService(NotificationManager.class);
            nm.createNotificationChannel(channel);

        }
    }



}
