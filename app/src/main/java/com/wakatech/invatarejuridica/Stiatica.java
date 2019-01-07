package com.wakatech.invatarejuridica;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.wakatech.invatarejuridica.helper.RandomGenerator;

public class Stiatica extends AppCompatActivity {

    private ConstraintLayout background;
    private TextView factTextView;
    private Button buttonMaiArata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stiatica);

        Toolbar toolbar = findViewById(R.id.custom_toolbar_stiatica);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Stiați că?");

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

    @Override
    public boolean onSupportNavigateUp() {
        super.onBackPressed();
        return super.onSupportNavigateUp();
    }
}
