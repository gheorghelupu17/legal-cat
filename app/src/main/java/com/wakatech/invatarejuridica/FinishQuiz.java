package com.wakatech.invatarejuridica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class FinishQuiz extends AppCompatActivity {

    private ProgressBar circleScore;
    private TextView scoreText;
    private TextView textFelicitari;
    private TextView restartNivel;
    private TextView nextNivel;
    int levelCompleted;
    int scoreLevelCompleted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish_quiz);

        levelCompleted = getIntent().getIntExtra("level_number",-1);
        scoreLevelCompleted = getIntent().getIntExtra("score",-1);

        Toolbar toolbar = findViewById(R.id.custom_toolbar_finishquiz);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("You completed level "+levelCompleted);

        circleScore = findViewById(R.id.progress_circle);
        scoreText = findViewById(R.id.score_tv_finish_quiz);
        textFelicitari = findViewById(R.id.felicitari_tv);
        restartNivel = findViewById(R.id.restart_level_finish);
        nextNivel = findViewById(R.id.next_level_finish);

        Retrofit retrofit = new Retrofit.Builder().
                addConverterFactory(ScalarsConverterFactory.create()).
                baseUrl("http://10.0.2.2:5000").build();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i =0 ;i<30;i++)
            list.add(0);

        list.set(levelCompleted,scoreLevelCompleted);

        PlayClient playClient = retrofit.create(PlayClient.class);
        Call<String> call = playClient.postScore(list);
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                Toast.makeText(FinishQuiz.this,"Updated",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Toast.makeText(FinishQuiz.this,"Problema tehnica",Toast.LENGTH_SHORT).show();
            }
        });

        if (scoreLevelCompleted<8) {
            nextNivel.setClickable(false);
            nextNivel.setVisibility(View.INVISIBLE);
        }

        if (scoreLevelCompleted>=8)
            textFelicitari.setText("Felicitari ai trecut nivelul "+levelCompleted+" !");
        else
            textFelicitari.setText("Nu ai trecut nivelul "+levelCompleted+" :(");
        scoreText.setText(scoreLevelCompleted+"/10");
        circleScore.setProgress(scoreLevelCompleted*10);


    }

    @Override
    public boolean onSupportNavigateUp() {
        super.onBackPressed();
        return super.onSupportNavigateUp();
    }

    public void restartLevel(View view) {
        Intent intent = new Intent(this,LearnLevel.class);
        intent.putExtra("level_number",levelCompleted);
        startActivity(intent);
        finish();
    }

    public void nextLevel(View view) {
        Intent intent = new Intent(this,LearnLevel.class);
        intent.putExtra("level_number",levelCompleted+1);
        startActivity(intent);
        finish();
    }
}
