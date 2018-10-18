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

import com.wakatech.invatarejuridica.helper.UserDetails;
import com.wakatech.invatarejuridica.helper.UserSignUp;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class SignUp extends AppCompatActivity {

    private Spinner judetSpinner;
    private AutoCompleteTextView scoalaAutoComplete;
    private Spinner clasaSpinner;
    private EditText varstaEt;
    private EditText numeEt;
    private EditText emailEt;
    private EditText passwordEt;
    private EditText confirmPasswordEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        judetSpinner = findViewById(R.id.judet_spinner);
        scoalaAutoComplete = findViewById(R.id.scoala_auto_tv);
        clasaSpinner = findViewById(R.id.clasa_spinner);
        varstaEt = findViewById(R.id.varsta_ed);
        numeEt = findViewById(R.id.nume_inregistrare_et);
        emailEt = findViewById(R.id.email_inregistrare_et);
        passwordEt = findViewById(R.id.parola_inregistrare_et);
        confirmPasswordEt = findViewById(R.id.confirmare_parola_et);

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

    //se apeleaza cand user-ul apasa pe inregistrare
    public void registUser(View view) {
        String pass = passwordEt.getText().toString();
        String confirmPass = confirmPasswordEt.getText().toString();

        if (pass.equals(confirmPass))
        {
            Retrofit retrofit = new Retrofit.Builder().
                    addConverterFactory(GsonConverterFactory.create()).
                    baseUrl("http://10.0.2.2:5000").build();

            LoginClient loginClient = retrofit.create(LoginClient.class);
            UserSignUp userSignUp = getFormsData();
            Call<UserSignUp> call = loginClient.signUpUser(userSignUp);
            call.enqueue(new Callback<UserSignUp>() {
                @Override
                public void onResponse(Call<UserSignUp> call, Response<UserSignUp> response) {
                    UserSignUp details = response.body();
                    UserDetails.setName(details.getNume());
                    UserDetails.setEmail(details.getEmail());
                    UserDetails.setSchool(details.getScoala());
                    openApp(null);
                }

                @Override
                public void onFailure(Call<UserSignUp> call, Throwable t) {
                    Toast.makeText(SignUp.this ,"parolele nu conincid",Toast.LENGTH_LONG).show();
                }
            });
        } else {
            Toast.makeText(SignUp.this ,"parolele nu conincid",Toast.LENGTH_LONG).show();
        }


    }

    private UserSignUp getFormsData() {
        String nume = numeEt.getText().toString();
        String email = emailEt.getText().toString();
        String pass = passwordEt.getText().toString();
        String judet = judetSpinner.getSelectedItem().toString();
        String scoala = scoalaAutoComplete.getText().toString();
        String clasa = clasaSpinner.getSelectedItem().toString();
        int varsta = Integer.parseInt(varstaEt.getText().toString());

        System.out.println(nume+email+pass+judet+scoala);

        return new UserSignUp(nume,email,pass,judet,scoala,clasa,varsta);
    }

    public void openApp(View view) {
        Intent intent = new Intent(this,MainMenu.class);
        startActivity(intent);
        finish();
    }

}
