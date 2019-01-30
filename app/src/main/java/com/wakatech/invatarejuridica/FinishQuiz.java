package com.wakatech.invatarejuridica;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.wakatech.invatarejuridica.helper.Auth;
import com.wakatech.invatarejuridica.helper.IntrebareFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class FinishQuiz extends AppCompatActivity {

    private ProgressBar circleScore;
    private TextView scoreText;
    private TextView textFelicitari;
    private TextView restartNivel;
    private TextView nextNivel;
    int levelCompleted;
    int scoreLevelCompleted;
    private String email;
    private String token;
    private String intrebari;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish_quiz);

        levelCompleted = getIntent().getIntExtra("level_number",-1);
        scoreLevelCompleted = getIntent().getIntExtra("score",-1);

        Toolbar toolbar = findViewById(R.id.custom_toolbar_finishquiz);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Nivelul "+levelCompleted);

        circleScore = findViewById(R.id.progress_circle);
        scoreText = findViewById(R.id.score_tv_finish_quiz);
        textFelicitari = findViewById(R.id.felicitari_tv);
        restartNivel = findViewById(R.id.restart_level_finish);
        nextNivel = findViewById(R.id.next_level_finish);

        SharedPreferences sharedPref = this.getSharedPreferences("login_info",MODE_PRIVATE);
        token = sharedPref.getString("token",null);
        email = sharedPref.getString("username", null);
        intrebari = sharedPref.getString("intrebari", null);

        SharedPreferences hintPrefs = this.getSharedPreferences("hints", MODE_PRIVATE);
        SharedPreferences.Editor hintEditor = hintPrefs.edit();
        int numberOfTries = hintPrefs.getInt("Level"+levelCompleted,1);
        hintEditor.putInt("Level"+levelCompleted, numberOfTries+1);
        hintEditor.apply();

        char[] nivele = intrebari.toCharArray();
        char result = transformLevelEncoding(scoreLevelCompleted);
        if (nivele[levelCompleted-1]<result)
        {
            nivele[levelCompleted-1] =  result;
            StringBuilder builder = new StringBuilder();
            for (char c:nivele)
            {
                builder.append(c);
            }
            intrebari = builder.toString();
            sentServerUpdates();
        }

        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("intrebari", intrebari);
        editor.apply();

        if (scoreLevelCompleted<8 || levelCompleted==18) {
            nextNivel.setClickable(false);
            nextNivel.setVisibility(View.INVISIBLE);
        }

        if (scoreLevelCompleted>=8)
            textFelicitari.setText("Felicitări, ai trecut nivelul "+levelCompleted+" !");
        else
            textFelicitari.setText("Nu ai trecut nivelul "+levelCompleted+" :(");
        scoreText.setText(scoreLevelCompleted+"/10");
        circleScore.setProgress(scoreLevelCompleted*10);


    }

    private void sentServerUpdates() {
        Retrofit retrofit = new Retrofit.Builder().
                baseUrl("https://legal-cat.wakatech.ro/").
                addConverterFactory(GsonConverterFactory.create())
                .build();

        PlayClient playClient = retrofit.create(PlayClient.class);


        Call<Auth> call = playClient.postScore(email, token, intrebari);
        call.enqueue(new Callback<Auth>() {
            @Override
            public void onResponse(Call<Auth> call, Response<Auth> response) {
                if (!response.body().msg)
                    //Toast.makeText(FinishQuiz.this, "ok",Toast.LENGTH_LONG ).show();
                    Toast.makeText(FinishQuiz.this, "Check Internet connection",Toast.LENGTH_LONG ).show();
            }

            @Override
            public void onFailure(Call<Auth> call, Throwable t) {
                Toast.makeText(FinishQuiz.this, "Check Internet conction",Toast.LENGTH_LONG ).show();
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        super.onBackPressed();
        return super.onSupportNavigateUp();
    }

    public void restartLevel(View view) {
        Intent intent = new Intent(this, PlayLevel.class);
        intent.putExtra("level_number", levelCompleted);
        startActivity(intent);
        finish();
    }

    public void nextLevel(View view) {
        Intent intent = new Intent(this, PlayLevel.class);
        intent.putExtra("level_number", levelCompleted+1);
        startActivity(intent);
        finish();
    }

    public char transformLevelEncoding(int score)
    {
        char result;
        switch (score)
        {
            case 8:
                result = '1';
                break;
            case 9:
                result = '2';
                break;
            case 10:
                result = '3';
                break;
            default:
                result = '0';
                break;
        }
        return result;
    }
}
