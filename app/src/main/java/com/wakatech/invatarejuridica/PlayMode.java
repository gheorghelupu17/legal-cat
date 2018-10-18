package com.wakatech.invatarejuridica;

import android.annotation.SuppressLint;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.wakatech.invatarejuridica.helper.BaseApp;

public class PlayMode extends AppCompatActivity {

    private LinearLayout rootLinearLayout;
    private TextView levelDescription;
    private ScrollView rootScrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_mode);

        Toolbar toolbar = findViewById(R.id.toolbar_playmode);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Select level");

        rootLinearLayout = findViewById(R.id.root_linear_layout);
        rootScrollView = findViewById(R.id.scrolPlayMode);

        /// ne ocupam de notificari

        Intent intent = new Intent(this, PlayMode.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this,0,intent,PendingIntent.FLAG_UPDATE_CURRENT);

        NotificationCompat.Builder notification = new NotificationCompat.Builder(this,BaseApp.CHANNEL_1_ID)
                .setAutoCancel(true)
                .setContentTitle("Joaca!")
                .setContentText("Hai si joaca-te nivelul 5")
                .setSmallIcon(R.mipmap.baseline_people_white_18)
                .setContentIntent(pendingIntent);

        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        nm.notify(1,notification.build());

// notificationId is a unique int for each notification that you must define


        ///ne am ocupat de notificari


        for (int i = 0; i < rootLinearLayout.getChildCount(); i++) {

            LinearLayout layout = (LinearLayout) rootLinearLayout.getChildAt(i);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) layout.getLayoutParams();
            layoutParams.setMargins(0, 0, 0, 90);
            layout.setLayoutParams(layoutParams);


            CardView first = (CardView) layout.getChildAt(0);
            CardView second = (CardView) layout.getChildAt(1);

            ViewGroup.LayoutParams params = first.getLayoutParams();
            params.height = 330;
            first.setLayoutParams(params);
            second.setLayoutParams(params);


            first.addView(getLayoutInflater().inflate(R.layout.cardview_design, null));
            second.addView(getLayoutInflater().inflate(R.layout.cardview_design, null));

            LinearLayout firstCardViewLayout = (LinearLayout) first.getChildAt(0);
            LinearLayout secondCardViewLayout = (LinearLayout) second.getChildAt(0);

            TextView firstText = (TextView) firstCardViewLayout.getChildAt(0);
            TextView secondText = (TextView) secondCardViewLayout.getChildAt(0);
            firstText.setText("Nivel "+(i*2+1));
            secondText.setText("Nivel "+(i*2+2));

            LinearLayout firstPlayBoard = (LinearLayout) firstCardViewLayout.getChildAt(2);
            ImageButton playFirst = (ImageButton) firstPlayBoard.getChildAt(0);
            ImageButton learnFirst = (ImageButton) firstPlayBoard.getChildAt(1);

            LinearLayout secondPlayBoard = (LinearLayout) secondCardViewLayout.getChildAt(2);
            ImageButton playSecond = (ImageButton) secondPlayBoard.getChildAt(0);
            ImageButton learnSecond = (ImageButton) secondPlayBoard.getChildAt(1);

            final int firstLevel = i*2+1;
            final int secondLevel = i*2+2;

            playFirst.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    playQuizLevel(firstLevel);
                }
            });

            learnFirst.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    learnLevel(firstLevel);
                }
            });

            playSecond.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    playQuizLevel(secondLevel);
                }
            });

            learnSecond.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    learnLevel(secondLevel);
                }
            });

        }


    }

    @Override
    public boolean onSupportNavigateUp() {
        super.onBackPressed();
        return true;
    }

    public void learnLevel(int level) {
        Intent intent = new Intent(this, LearnLevel.class);
        intent.putExtra("level_number",level);
        startActivity(intent);
    }

    public void playQuizLevel(int level) {
        Intent intent = new Intent(this, PlayLevel.class);
        intent.putExtra("level_number",level);
        startActivity(intent);
    }

}
