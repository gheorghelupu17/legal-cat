package com.wakatech.invatarejuridica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class SignUp extends AppCompatActivity {

    private Spinner judetSpinner;
    private AutoCompleteTextView scoalaAutoComplete;
    private Spinner clasaSpinner;
    private EditText varstaEt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        judetSpinner  = findViewById(R.id.judet_spinner);
        scoalaAutoComplete = findViewById(R.id.scoala_auto_tv);
        clasaSpinner  = findViewById(R.id.clasa_spinner);
        varstaEt      = findViewById(R.id.varsta_ed);

        ArrayAdapter<CharSequence> judetAdapter = ArrayAdapter.createFromResource(this,R.array.judete,android.R.layout.simple_spinner_item);
        judetAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        judetSpinner.setAdapter(judetAdapter);

        String[] scoli = getResources().getStringArray(R.array.scoli);
        ArrayAdapter<String> scoalaAdapter = new ArrayAdapter<String>(this, R.layout.spinner_item_layout, R.id.spinner_custom_text_view_item, scoli);
        scoalaAutoComplete.setAdapter(scoalaAdapter);

        ArrayAdapter<CharSequence> clasaAdapter = ArrayAdapter.createFromResource(this,R.array.clase,android.R.layout.simple_spinner_item);
        clasaAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        clasaSpinner.setAdapter(clasaAdapter);



    }

    public void registUser(View view) {
        String user = scoalaAutoComplete.getText().toString();
        String pass = judetSpinner.getSelectedItem().toString();
        Retrofit retrofit = new Retrofit.Builder().
                addConverterFactory(ScalarsConverterFactory.create()).
                baseUrl("http://10.0.2.2:5000").build();

        LoginClient loginClient = retrofit.create(LoginClient.class);
        Call<String> call = loginClient.signUpUser(user,pass);
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                if (!response.body().equals("Error")) {
                    openApp(null);
                } else {
                    Toast.makeText(SignUp.this,"User-ul deja exista",Toast.LENGTH_LONG);
                }

            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Toast.makeText(SignUp.this,"Eroare tehnica",Toast.LENGTH_LONG);
            }
        });
    }

    public void openApp(View view) {
        Intent intent = new Intent(this,MainMenu.class);
        startActivity(intent);
        finish();
    }

}
