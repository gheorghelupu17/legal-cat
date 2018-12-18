package com.wakatech.invatarejuridica;

import android.annotation.SuppressLint;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.support.annotation.RequiresApi;
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

import com.wakatech.invatarejuridica.helper.Auth;
import com.wakatech.invatarejuridica.helper.BaseApp;
import com.wakatech.invatarejuridica.helper.IntrebareFactory;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class PlayMode extends AppCompatActivity {

    private LinearLayout rootLinearLayout;
    private TextView levelDescription;
    private ScrollView rootScrollView;
    private String intrebari;
    private int terminat = 0;
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

        final SharedPreferences sharedPref = this.getSharedPreferences("login_info",MODE_PRIVATE);
        String token = sharedPref.getString("token",null);
        String email = sharedPref.getString("username", null);

        Retrofit retrofit = new Retrofit.Builder().
                baseUrl("https://legal-cat.wakatech.ro/").
                addConverterFactory(GsonConverterFactory.create())
                .build();

        PlayClient playClient = retrofit.create(PlayClient.class);

        Call<Leader> call = playClient.getScore(email, token);
        call.enqueue(new Callback<Leader>() {
            @Override
            public void onResponse(Call<Leader> call, Response<Leader> response) {
                SharedPreferences.Editor editor = sharedPref.edit();
                intrebari = response.body().intrebari;
                editor.putString("intrebari", intrebari);
                editor.apply();
                //Toast.makeText(PlayMode.this, response.body().intrebari,Toast.LENGTH_LONG ).show();
                char[] nivele = intrebari.toCharArray();

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

                    final int firstLevel = i*2+1;
                    final int secondLevel = i*2+2;

                    if (nivele[firstLevel-1]=='0' && firstLevel!=1 && nivele[firstLevel-2]=='0')
                        first.setBackgroundResource(R.drawable.unlock);
                    else
                    {
                        first.addView(getLayoutInflater().inflate(R.layout.cardview_design, null));

                        LinearLayout firstCardViewLayout = (LinearLayout) first.getChildAt(0);

                        TextView firstText = (TextView) firstCardViewLayout.getChildAt(0);

                        firstText.setText(IntrebareFactory.getLevelNameByNumber(firstLevel-1));

                        TextView textScoreFirst = (TextView) firstCardViewLayout.getChildAt(1);

                        textScoreFirst.setText(getNumberOfIntrebari(nivele[firstLevel-1])+"/10");

                        LinearLayout firstPlayBoard = (LinearLayout) firstCardViewLayout.getChildAt(2);
                        ImageButton playFirst = (ImageButton) firstPlayBoard.getChildAt(0);
                        ImageButton learnFirst = (ImageButton) firstPlayBoard.getChildAt(1);

                        playFirst.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                playQuizLevel(firstLevel);

                            }
                        });
                    }
                    if (nivele[secondLevel-1]=='0' && secondLevel!=1 && nivele[secondLevel-2]=='0')
                        second.setBackgroundResource(R.drawable.unlock);
                    else
                    {
                        second.addView(getLayoutInflater().inflate(R.layout.cardview_design, null));

                        LinearLayout secondCardViewLayout = (LinearLayout) second.getChildAt(0);

                        TextView secondText = (TextView) secondCardViewLayout.getChildAt(0);

                        secondText.setText(IntrebareFactory.getLevelNameByNumber(secondLevel - 1));

                        TextView textScoreSecond = (TextView) secondCardViewLayout.getChildAt(1);

                        textScoreSecond.setText(getNumberOfIntrebari(nivele[secondLevel - 1]) + "/10");

                        LinearLayout secondPlayBoard = (LinearLayout) secondCardViewLayout.getChildAt(2);
                        ImageButton playSecond = (ImageButton) secondPlayBoard.getChildAt(0);
                        ImageButton learnSecond = (ImageButton) secondPlayBoard.getChildAt(1);

                        playSecond.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                playQuizLevel(secondLevel);
                            }
                        });
                    }

                }

            }
            @Override
            public void onFailure(Call<Leader> call, Throwable t) {
                Toast.makeText(PlayMode.this, "eraore",Toast.LENGTH_LONG ).show();
            }
        });
    }

    private int getNumberOfIntrebari(char c) {
        int result = 0;
        switch (c)
        {
            case '1':
                result = 8;
                break;
            case '2':
                result = 9;
                break;
            case '3':
                result = 10;
            default:
                break;
        }
        return result;
    }

    @Override
    public boolean onSupportNavigateUp() {
        super.onBackPressed();
        return true;
    }


    public void playQuizLevel(int level) {
        Intent intent = new Intent(this, PlayLevel.class);
        intent.putExtra("level_number",level);
        startActivity(intent);
        finish();
    }

}
