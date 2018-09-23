package com.wakatech.invatarejuridica;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.wakatech.invatarejuridica.helper.Intrebare;
import com.wakatech.invatarejuridica.helper.IntrebareFactory;
import com.wakatech.invatarejuridica.helper.RandomGenerator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PlayLevel extends AppCompatActivity {

    private TextView intrebare;
    private CheckBox raspuns1;
    private CheckBox raspuns2;
    private CheckBox raspuns3;
    private boolean userSelect1 = false;
    private boolean userSelect2 = false;
    private boolean userSelect3 = false;
    private int indexQuestion = 0;
    private Button buttonAnswer;
    private Context context;
    private TextView scoreDisplay;
    private List<Intrebare> listaIntrebari;
    int curentScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_level);


        intrebare = findViewById(R.id.play_level_intrebare);
        raspuns1 = findViewById(R.id.raspuns1);
        raspuns2 = findViewById(R.id.raspuns2);
        raspuns3 = findViewById(R.id.raspuns3);
        buttonAnswer = findViewById(R.id.buttonAnswer);
        scoreDisplay = findViewById(R.id.score_tv_play_mode);
        context = this;


        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        final int levelNumber = getIntent().getIntExtra("level_number",-1);
        actionBar.setTitle("Play level: "+levelNumber);
        scoreDisplay.setText("Score: 0");

        IntrebareFactory factory = new IntrebareFactory(levelNumber);
        listaIntrebari = new ArrayList<>();
        while (listaIntrebari.size()<10)
        {
            int randomNumber = RandomGenerator.generateInt(20);
            if (!listaIntrebari.contains(factory.question[randomNumber]))
                listaIntrebari.add(factory.question[randomNumber]);
        }

        setContent(indexQuestion);

        buttonAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ++indexQuestion;
                if (checkQuestion())
                    curentScore++;
                if (indexQuestion==10) {

                    Intent i = new Intent(context,FinishQuiz.class);
                    i.putExtra("score",curentScore);
                    i.putExtra("level_number",levelNumber);
                    startActivity(i);
                    finish();
                } else {

                    animateEverything();
                    setContent(indexQuestion);

                }

            }

        });




    }

    private boolean checkQuestion() {
        Intrebare deVerificat = listaIntrebari.get(indexQuestion-1);
        if (userSelect1 != deVerificat.isCorect1())
            return false;
        if (userSelect2 != deVerificat.isCorect2())
            return false;
        if (userSelect3 != deVerificat.isCorect3())
            return false;
        return true;
    }

    private void animateEverything() {
        YoYo.with(Techniques.BounceInDown).duration(1000).playOn(intrebare);
        YoYo.with(Techniques.BounceInDown).duration(1000).playOn(raspuns1);
        YoYo.with(Techniques.BounceInDown).duration(1000).playOn(raspuns2);
        YoYo.with(Techniques.BounceInDown).duration(1000).playOn(raspuns3);
    }

    @Override
    public boolean onSupportNavigateUp() {
        super.onBackPressed();
        return super.onSupportNavigateUp();
    }

    public void switchUserSelect(View view) {
        int viewId = view.getId();
        switch (viewId) {
            case R.id.raspuns1: userSelect1=!userSelect1; break;
            case R.id.raspuns2: userSelect2=!userSelect2; break;
            case R.id.raspuns3: userSelect3=!userSelect3; break;
            default: break;
        }
    }

    public void setContent(int indexQuestion) {
        userSelect1 = false;
        userSelect2 = false;
        userSelect3 = false;
        raspuns1.setChecked(false);
        raspuns2.setChecked(false);
        raspuns3.setChecked(false);
        intrebare.setText(listaIntrebari.get(indexQuestion).getIntrebare());
        raspuns1.setText(listaIntrebari.get(indexQuestion).getRaspuns1());
        raspuns2.setText(listaIntrebari.get(indexQuestion).getRaspuns2());
        raspuns3.setText(listaIntrebari.get(indexQuestion).getRaspuns3());
        scoreDisplay.setText(curentScore+"/10");
    }
}
