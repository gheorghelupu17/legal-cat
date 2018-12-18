package com.wakatech.invatarejuridica;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.wakatech.invatarejuridica.helper.Intrebare;
import com.wakatech.invatarejuridica.helper.IntrebareFactory;
import com.wakatech.invatarejuridica.helper.RandomGenerator;
import com.wakatech.invatarejuridica.helper.WordDictionary;

import java.util.ArrayList;
import java.util.HashMap;
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
    int levelNumber;

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

        levelNumber = getIntent().getIntExtra("level_number",-1);
        actionBar.setTitle(IntrebareFactory.getLevelNameByNumber(levelNumber-1));
        scoreDisplay.setText("Score: 0");

        IntrebareFactory factory = new IntrebareFactory(levelNumber);
        listaIntrebari = new ArrayList<>();
        while (listaIntrebari.size()<10)
        {
            int randomNumber = RandomGenerator.generateInt(factory.numberOfQuestions);
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
        /*backdoor
        Intent i = new Intent(context,FinishQuiz.class);
        i.putExtra("score",10);
        i.putExtra("level_number",levelNumber);
        startActivity(i);
        finish();*/

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
        buttonAnswer.setEnabled(true);
        int viewId = view.getId();
        switch (viewId) {
            case R.id.raspuns1:
                if (userSelect1) buttonAnswer.setEnabled(false);
                userSelect1=!userSelect1;
                if (userSelect1) {
                    raspuns2.setChecked(false);
                    raspuns3.setChecked(false);
                    userSelect2 = false;
                    userSelect3 = false;
                }
                break;
            case R.id.raspuns2:
                if (userSelect2) buttonAnswer.setEnabled(false);
                userSelect2=!userSelect2;
                if (userSelect2) {
                    raspuns1.setChecked(false);
                    raspuns3.setChecked(false);
                    userSelect1 = false;
                    userSelect3 = false;
                }
                break;
            case R.id.raspuns3:
                if (userSelect3) buttonAnswer.setEnabled(false);
                userSelect3=!userSelect3;
                if (userSelect3) {
                    raspuns1.setChecked(false);
                    raspuns2.setChecked(false);
                    userSelect1 = false;
                    userSelect2 = false;
                }
                break;
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
        buttonAnswer.setEnabled(false);
        setLinks();
    }

    public void setLinks()
    {
        SpannableString spannableStringIntrebare = new SpannableString(listaIntrebari.get(indexQuestion).getIntrebare());
        SpannableString spannableStringRaspuns1 = new SpannableString(listaIntrebari.get(indexQuestion).getRaspuns1());
        SpannableString spannableStringRaspuns2 = new SpannableString(listaIntrebari.get(indexQuestion).getRaspuns2());
        SpannableString spannableStringRaspuns3 = new SpannableString(listaIntrebari.get(indexQuestion).getRaspuns3());
        String intrebareText = listaIntrebari.get(indexQuestion).getIntrebare();
        String raspuns1Text = listaIntrebari.get(indexQuestion).getRaspuns1();
        String raspuns2Text = listaIntrebari.get(indexQuestion).getRaspuns2();
        String raspuns3Text = listaIntrebari.get(indexQuestion).getRaspuns3();
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
            if (positionFound!=-1)
            {
                int positionEnd = intrebareText.toLowerCase().indexOf(' ',positionFound);
                if (positionEnd!=-1) {
                    if (positionFound == 0)
                        spannableStringIntrebare.setSpan(clickableSpan, positionFound, positionEnd, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    else if (intrebareText.charAt(positionFound - 1) == ' ')
                        spannableStringIntrebare.setSpan(clickableSpan, positionFound, positionEnd, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                }
            }


            positionFound = raspuns1Text.toLowerCase().indexOf(key.toLowerCase());
            if (positionFound!=-1) {
                int positionEnd = raspuns1Text.toLowerCase().indexOf(' ',positionFound);
                if (positionEnd!=-1)
                    if (positionFound==0)
                        spannableStringRaspuns1.setSpan(clickableSpan,positionFound,positionEnd, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    else
                    if(raspuns1Text.charAt(positionFound-1)==' ')
                        spannableStringRaspuns1.setSpan(clickableSpan,positionFound,positionEnd, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            }


            positionFound = raspuns2Text.toLowerCase().indexOf(key.toLowerCase());
            if (positionFound!=-1) {
                int positionEnd = raspuns2Text.toLowerCase().indexOf(' ', positionFound);
                if (positionEnd!=-1)
                    if (positionFound==0)
                        spannableStringRaspuns2.setSpan(clickableSpan,positionFound,positionEnd, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    else
                        if(raspuns2Text.charAt(positionFound-1)==' ')
                            spannableStringRaspuns2.setSpan(clickableSpan,positionFound,positionEnd, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            }


            positionFound = raspuns3Text.toLowerCase().indexOf(key.toLowerCase());
            if (positionFound!=-1) {
                int positionEnd = raspuns3Text.toLowerCase().indexOf(' ', positionFound);
                if (positionEnd!=-1)
                    if (positionFound==0)
                        spannableStringRaspuns3.setSpan(clickableSpan,positionFound,positionEnd, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    else
                    if(raspuns3Text.charAt(positionFound-1)==' ')
                        spannableStringRaspuns3.setSpan(clickableSpan,positionFound,positionEnd, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            }

        }


        intrebare.setText(spannableStringIntrebare);
        raspuns1.setText(spannableStringRaspuns1);
        raspuns2.setText(spannableStringRaspuns2);
        raspuns3.setText(spannableStringRaspuns3);

        intrebare.setMovementMethod(LinkMovementMethod.getInstance());
        intrebare.setHighlightColor(Color.TRANSPARENT);

        raspuns1.setMovementMethod(LinkMovementMethod.getInstance());
        raspuns1.setHighlightColor(Color.TRANSPARENT);

        raspuns2.setMovementMethod(LinkMovementMethod.getInstance());
        raspuns2.setHighlightColor(Color.TRANSPARENT);

        raspuns3.setMovementMethod(LinkMovementMethod.getInstance());
        raspuns3.setHighlightColor(Color.TRANSPARENT);

    }

}
