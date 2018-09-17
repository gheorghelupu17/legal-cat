package com.wakatech.invatarejuridica;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

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
    private int userSelect1 = 0;
    private int userSelect2 = 0;
    private int userSelect3 = 0;
    private int indexQuestion = 0;
    private Button buttonAnswer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_level);

        intrebare = findViewById(R.id.play_level_intrebare);
        raspuns1 = findViewById(R.id.raspuns1);
        raspuns2 = findViewById(R.id.raspuns2);
        raspuns3 = findViewById(R.id.raspuns3);
        buttonAnswer = findViewById(R.id.buttonAnswer);


        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        int levelNumber = getIntent().getIntExtra("level_number",-1);
        actionBar.setTitle("Play level: "+levelNumber);

        IntrebareFactory factory = new IntrebareFactory(levelNumber);
        final TreeSet<Intrebare> listaIntrebari = new TreeSet<>();
        while (listaIntrebari.size()<10)
        {
            int randomNumber = RandomGenerator.generateInt(20);
            listaIntrebari.add(factory.question[randomNumber]);
        }

        intrebare.setText(listaIntrebari.first().getIntrebare());
        raspuns1.setText(listaIntrebari.first().getRaspuns1());
        raspuns2.setText(listaIntrebari.first().getRaspuns2());
        raspuns3.setText(listaIntrebari.first().getRaspuns3());


        buttonAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                intrebare.setText(listaIntrebari.first().getIntrebare());
                raspuns1.setText(listaIntrebari.first().getRaspuns1());
                raspuns2.setText(listaIntrebari.first().getRaspuns2());
                raspuns3.setText(listaIntrebari.first().getRaspuns3());

            }
        });


    }

    @Override
    public boolean onSupportNavigateUp() {
        super.onBackPressed();
        return super.onSupportNavigateUp();
    }

    public void switchUserSelect(View view) {
        int viewId = view.getId();
        switch (viewId) {
            case R.id.raspuns1: userSelect1=1-userSelect1; break;
            case R.id.raspuns2: userSelect2=1-userSelect2; break;
            case R.id.raspuns3: userSelect3=1-userSelect3; break;
            default: break;
        }
    }
}
