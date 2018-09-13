package com.wakatech.invatarejuridica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class SignUp extends AppCompatActivity {

    private Spinner judetSpinner;
    private Spinner scoalaSpinner;
    private Spinner clasaSpinner;
    private EditText varstaEt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        judetSpinner  = findViewById(R.id.judet_spinner);
        scoalaSpinner = findViewById(R.id.scoala_spinner);
        clasaSpinner  = findViewById(R.id.clasa_spinner);
        varstaEt      = findViewById(R.id.varsta_ed);

        ArrayAdapter<CharSequence> judetAdapter = ArrayAdapter.createFromResource(this,R.array.judete,android.R.layout.simple_spinner_item);
        judetAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        judetSpinner.setAdapter(judetAdapter);

        ArrayAdapter<CharSequence> scoalaAdapter = ArrayAdapter.createFromResource(this,R.array.scoli,android.R.layout.simple_spinner_item);
        scoalaAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        scoalaSpinner.setAdapter(scoalaAdapter);

        ArrayAdapter<CharSequence> clasaAdapter = ArrayAdapter.createFromResource(this,R.array.clase,android.R.layout.simple_spinner_item);
        clasaAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        clasaSpinner.setAdapter(clasaAdapter);

    }

    public void openApp(View view) {
        Intent intent = new Intent(this,MainMenu.class);
        startActivity(intent);
        finish();
    }

}
