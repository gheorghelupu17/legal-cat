package com.wakatech.invatarejuridica;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.wakatech.invatarejuridica.helper.Intrebare;
import com.wakatech.invatarejuridica.helper.Intrebare2;
import com.wakatech.invatarejuridica.helper.IntrebareFactory;
import com.wakatech.invatarejuridica.helper.RandomGenerator;
import com.wakatech.invatarejuridica.helper.WordDictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PlayLevel2 extends AppCompatActivity {

    private TextView intrebare;
    private CheckBox raspuns1;
    private CheckBox raspuns2;
    private boolean userSelect1 = false;
    private boolean userSelect2 = false;
    private int indexQuestion = 0;
    private Button buttonAnswer;
    private Context context;
    private TextView scoreDisplay;
    private List<Intrebare2> listaIntrebari;
    int curentScore = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_level2);


        intrebare = findViewById(R.id.play_level_intrebare2);
        raspuns1 = findViewById(R.id.raspuns12);
        raspuns2 = findViewById(R.id.raspuns22);
        buttonAnswer = findViewById(R.id.buttonAnswer2);
        scoreDisplay = findViewById(R.id.score_tv_play_mode2);
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
            int randomNumber = RandomGenerator.generateInt(factory.numberOfQuestions);
            if (!listaIntrebari.contains(factory.question2[randomNumber]))
                listaIntrebari.add(factory.question2[randomNumber]);
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

    private void animateEverything() {
        YoYo.with(Techniques.BounceInDown).duration(1000).playOn(intrebare);
        YoYo.with(Techniques.BounceInDown).duration(1000).playOn(raspuns1);
        YoYo.with(Techniques.BounceInDown).duration(1000).playOn(raspuns2);
    }

    public void switchUserSelect(View view) {
        buttonAnswer.setEnabled(true);
        int viewId = view.getId();
        switch (viewId) {
            case R.id.raspuns12:
                if (userSelect1) buttonAnswer.setEnabled(false);
                userSelect1=!userSelect1;
                if (userSelect1) {
                    raspuns2.setChecked(false);
                    userSelect2 = false;
                }
                break;
            case R.id.raspuns22:
                if (userSelect2) buttonAnswer.setEnabled(false);
                userSelect2=!userSelect2;
                if (userSelect2) {
                    raspuns1.setChecked(false);
                    userSelect1 = false;
                }
                break;
            default: break;
        }
    }

    public void setContent(int indexQuestion) {
        userSelect1 = false;
        userSelect2 = false;
        raspuns1.setChecked(false);
        raspuns2.setChecked(false);
        intrebare.setText(listaIntrebari.get(indexQuestion).intrebare);
        raspuns1.setText(listaIntrebari.get(indexQuestion).raspuns1);
        raspuns2.setText(listaIntrebari.get(indexQuestion).raspuns2);
        scoreDisplay.setText(curentScore+"/10");
        buttonAnswer.setEnabled(false);

        setLinks();
    }

    private boolean checkQuestion() {
        Intrebare2 deVerificat = listaIntrebari.get(indexQuestion-1);
        if ( (deVerificat.corect1==1) != userSelect1)
            return false;
        if ( (deVerificat.corect2==1) != userSelect2)
            return false;
        return true;
    }

    public boolean onSupportNavigateUp() {
        super.onBackPressed();
        return super.onSupportNavigateUp();
    }

    public void setLinks()
    {
        SpannableString spannableStringIntrebare = new SpannableString(listaIntrebari.get(indexQuestion).intrebare);
        SpannableString spannableStringRaspuns1 = new SpannableString(listaIntrebari.get(indexQuestion).raspuns1);
        SpannableString spannableStringRaspuns2 = new SpannableString(listaIntrebari.get(indexQuestion).raspuns2);
        String intrebareText = listaIntrebari.get(indexQuestion).intrebare;
        String raspuns1Text = listaIntrebari.get(indexQuestion).raspuns1;
        String raspuns2Text = listaIntrebari.get(indexQuestion).raspuns2;
        WordDictionary dic = new WordDictionary();
        HashMap<String, String > map = dic.descrieri;
        for (final String key: map.keySet())
        {
            ClickableSpan clickableSpan = new ClickableSpan() {
                @Override
                public void onClick(@NonNull View widget) {
                    //open boottom sheet
                    BottomSheetDictionar bottomSheetDictionar = new BottomSheetDictionar();
                    Bundle args = new Bundle();
                    args.putString("word",key);
                    bottomSheetDictionar.setArguments(args);
                    bottomSheetDictionar.show(getSupportFragmentManager(),"bs");
                }
            };
            int positionFound = intrebareText.toLowerCase().indexOf(key.toLowerCase());
            if (positionFound!=-1) {
                int positionEnd = intrebareText.toLowerCase().indexOf(' ', positionFound);
                if (positionEnd!=-1)
                    spannableStringIntrebare.setSpan(clickableSpan,positionFound,positionEnd, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            }


            positionFound = raspuns1Text.toLowerCase().indexOf(key.toLowerCase());
            if (positionFound!=-1) {
                int positionEnd = raspuns1Text.toLowerCase().indexOf(' ',positionFound);
                if (positionEnd!=-1)
                    spannableStringRaspuns1.setSpan(clickableSpan,positionFound,positionEnd, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            }

            positionFound = raspuns2Text.toLowerCase().indexOf(key.toLowerCase());
            if (positionFound!=-1) {
                int positionEnd = raspuns2Text.toLowerCase().indexOf(' ', positionFound);
                if (positionEnd!=-1)
                    spannableStringRaspuns2.setSpan(clickableSpan,positionFound,positionEnd, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            }
        }


        intrebare.setText(spannableStringIntrebare);
        raspuns1.setText(spannableStringRaspuns1);
        raspuns2.setText(spannableStringRaspuns2);

        intrebare.setMovementMethod(LinkMovementMethod.getInstance());
        intrebare.setHighlightColor(Color.TRANSPARENT);

        raspuns1.setMovementMethod(LinkMovementMethod.getInstance());
        raspuns1.setHighlightColor(Color.TRANSPARENT);

        raspuns2.setMovementMethod(LinkMovementMethod.getInstance());
        raspuns2.setHighlightColor(Color.TRANSPARENT);

    }

}
