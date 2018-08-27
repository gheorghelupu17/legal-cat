package com.wakatech.invatarejuridica;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Stiatica extends AppCompatActivity {

    private RelativeLayout background;
    private TextView factTextView;
    private Button buttonMaiArata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stiatica);

        background = findViewById(R.id.relativeLayout);
        factTextView = findViewById(R.id.factTextView);
        buttonMaiArata = findViewById(R.id.showFactButton);

        background.setBackgroundColor(RandomGenerator.generateColor());
        factTextView.setText(RandomGenerator.generateFact());

        buttonMaiArata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color = RandomGenerator.generateColor();
                background.setBackgroundColor(color);
                buttonMaiArata.setTextColor(color);
                factTextView.setText(RandomGenerator.generateFact());
            }
        });
    }

    public void exitStiatica(View view) {
        finish();
    }
}
