package com.wakatech.invatarejuridica;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Lideri extends AppCompatActivity {

    private LinearLayout listaLideri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lideri);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Lideri");
        actionBar.setDisplayHomeAsUpEnabled(true);

        listaLideri = findViewById(R.id.lista_lideri);

        for (int i =0;i<30;i++)
        {
            Button button = new Button(this);
            button.setText("Lider "+(i+1));
            button.setTextSize(16);
            listaLideri.addView(button);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
