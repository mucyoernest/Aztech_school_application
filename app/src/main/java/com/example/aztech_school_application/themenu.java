package com.example.aztech_school_application;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import java.util.Random;

public class themenu extends AppCompatActivity {

    private static final String CHANNEL_ID = "channel_id";
    private static final int NOTIFICATION_ID = 12345;
    ImageView notification;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_themenu);
        Toolbar toolbar = findViewById(R.id.toolbar);
        notification = (ImageView) findViewById(R.id.imageView12);
        notification.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v){
                displayNotification(v);
            }
        });

        clearExistingNotifications();
//        setActionBar(toolbar);
    }  public void displayNotification(View view) {

        int randomRequestCode = new Random().nextInt(54325);

        //PendingIntent that restarts the current activity instance.
        Intent resultIntent = new Intent(this, MainActivity.class);
        resultIntent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        //Set a unique request code for this pending intent
        PendingIntent resultPendingIntent = PendingIntent.getActivity(this, randomRequestCode, resultIntent, PendingIntent.FLAG_UPDATE_CURRENT);

        //Notification Action with RemoteInput instance added.
        NotificationCompat.Action replyAction = new NotificationCompat.Action.Builder(
                android.R.drawable.sym_action_chat, "REPLY", resultPendingIntent)
                .setAllowGeneratedReplies(true)
                .build();



        Intent DismissIntent = new Intent(this, settings1.class);
        DismissIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);

        PendingIntent DismissPendingIntent = PendingIntent.getActivity(this, 0 ,
                DismissIntent, PendingIntent.FLAG_ONE_SHOT);


        CreateNotificationChannel();
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, CHANNEL_ID);
        builder.setSmallIcon(R.drawable.ic_launcher_foreground);
        builder.setContentTitle("Settings");
        builder.setContentText("You are about to change settings");
        builder.setPriority(NotificationCompat.PRIORITY_DEFAULT);
        builder.setAutoCancel(true);
        builder.addAction(replyAction);
        builder.addAction(R.drawable.ic_launcher_background, "DISMISS", DismissPendingIntent);

        NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(this);
        notificationManagerCompat.notify(NOTIFICATION_ID, builder.build());
        Intent mass = new Intent(this,settings1.class);
        startActivity(mass);


    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);

    }


    public void CreateNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence name = "Personal Notifications";
            String description = "Include All Personal notifications";
            int importance = NotificationManager.IMPORTANCE_DEFAULT;

            NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID, name, importance);
            notificationChannel.setDescription(description);

            NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    private void clearExistingNotifications()
    {
        int notificationId = getIntent().getIntExtra("notificationId", 0);
        NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        manager.cancel(notificationId);
    }


































    public void opencourses(View View){
        Intent mass = new Intent(this,courses.class);
        startActivity(mass);
    }

    public void openclassroom(View View){
        Intent mass = new Intent(this,myclasses.class);
        startActivity(mass);
    }

    public void opennews(View View){
        Intent mass = new Intent(this,news.class);
        startActivity(mass);
    }
    public void openevents(View View){
        Intent mass = new Intent(this,calendar1.class);
        startActivity(mass);
    }

    public void openpodcast(View View){
        Intent mass = new Intent(this,podcast1.class);
        startActivity(mass);
    }

    public void openalupay(View View){
        Intent mass = new Intent(this,pay1.class);
        startActivity(mass);
    }

    public void opensvp(View View){
        Intent mass = new Intent(this,svp1.class);
        startActivity(mass);
    }


    public void openregistrar(View View){
        Intent mass = new Intent(this,Registrar.class);
        startActivity(mass);
    }


    public void opensetting(View View){
        Intent mass = new Intent(this,settings1.class);
        startActivity(mass);

    }

    public void open_library(View View){
        Intent mass = new Intent(this,library.class);
        startActivity(mass);
    }


}
