package com.wakatech.invatarejuridica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.wakatech.invatarejuridica.helper.Auth;
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
    private EditText scoalaAutoComplete;
    private Spinner clasaSpinner;
    private EditText varstaEt;
    private EditText numeEt;
    private EditText emailEt;
    private EditText passwordEt;
    private EditText confirmPasswordEt;
    private CheckBox checkAccept;
    private TextView textAccept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        judetSpinner        = findViewById(R.id.judet_spinner);
        scoalaAutoComplete  = findViewById(R.id.scoala_auto_tv);
        clasaSpinner        = findViewById(R.id.clasa_spinner);
        varstaEt            = findViewById(R.id.varsta_ed);
        numeEt              = findViewById(R.id.nume_inregistrare_et);
        emailEt             = findViewById(R.id.email_inregistrare_et);
        passwordEt          = findViewById(R.id.parola_inregistrare_et);
        confirmPasswordEt   = findViewById(R.id.confirmare_parola_et);
        checkAccept         = findViewById(R.id.checkboxAccept);
        textAccept          = findViewById(R.id.textAccept);

        textAccept.setMovementMethod(LinkMovementMethod.getInstance());

        ArrayAdapter<CharSequence> judetAdapter = ArrayAdapter.createFromResource(this,R.array.judete,android.R.layout.simple_spinner_item);
        judetAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        judetSpinner.setAdapter(judetAdapter);


        ArrayAdapter<CharSequence> clasaAdapter = ArrayAdapter.createFromResource(this,R.array.clase,android.R.layout.simple_spinner_item);
        clasaAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        clasaSpinner.setAdapter(clasaAdapter);

    }

    //se apeleaza cand user-ul apasa pe inregistrare
    public void registerUser(UserSignUp userData) {

        Retrofit retrofit = new Retrofit.Builder().
                baseUrl("https://legal-cat.wakatech.ro/").
                addConverterFactory(GsonConverterFactory.create())
                .build();

        LoginClient loginClient = retrofit.create(LoginClient.class);
        Call<Auth> call = loginClient.signUpUser(
                userData.email, userData.password,
                userData.nume, userData.judet,
                userData.scoala, userData.clasa,
                userData.varsta);

        call.enqueue(new Callback<Auth>() {
            @Override
            public void onResponse(Call<Auth> call, Response<Auth> response) {
                //assert (response.toString().equals(""));
                if (response.body().msg)
                    openApp();
                else
                    Toast.makeText(SignUp.this,"User-ul exista deja!!",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<Auth> call, Throwable t) {
                Toast.makeText(SignUp.this,"EROR",Toast.LENGTH_LONG).show();
            }
        });
    }


    private UserSignUp getFormsData() {
        String nume = numeEt.getText().toString();
        String email = emailEt.getText().toString();
        String pass = passwordEt.getText().toString();
        String judet = judetSpinner.getSelectedItem().toString();
        String scoala = scoalaAutoComplete.getText().toString();
        String clasa = clasaSpinner.getSelectedItem().toString();
        int varsta = Integer.parseInt(varstaEt.getText().toString());
        int nr_clasa = getNrClasa(clasa);
        System.out.println(nume+email+pass+judet+scoala);

        return new UserSignUp(nume,email,pass,judet,scoala,nr_clasa,varsta);
    }

    private int getNrClasa(String clasa) {
        switch(clasa) {
            case"I":
                return 1;
            case"II":
                return 2;

            case"III":
                return 3;

            case"IV":
                return 4;

            case"V":
                return 5;

            case"VI":
                return 6;

            case"VII":
                return 7;

            case"VIII":
                return 8;

            case"IX":
                return 9;

            case"X":
                return 10;

            case"XI":
                return 11;

            case"XII":
                return 12;

            default:
                return 0;

        }
    }

    public void openApp() {
        Toast.makeText(SignUp.this,"Inregistrare facuta cu succes",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this,Login.class);
        startActivity(intent);
        finish();
    }

    public  boolean isValidEmail(String target) {
        if (TextUtils.isEmpty(target)) {
            return false;
        } else {
            return android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
        }
    }

    public void checkData(View view)
    {
        boolean validData = true;
        if (!isValidEmail(emailEt.getText().toString())) {
            Toast.makeText(SignUp.this, "Email Invalid", Toast.LENGTH_LONG).show();
            validData = false;
        }
        else if (!passwordEt.getText().toString().equals(confirmPasswordEt.getText().toString()))
        {
            Toast.makeText(SignUp.this, "Parolele nu coincid", Toast.LENGTH_LONG).show();
            validData = false;
        }
        else if (passwordEt.getText().toString().length()<6) {
            Toast.makeText(SignUp.this, "Parola trebuie sa contina minim 6 caractere", Toast.LENGTH_LONG).show();
            validData = false;
        }
        else {
            String nume =   numeEt.getText().toString();
            String email =  emailEt.getText().toString();
            String pass =   passwordEt.getText().toString();
            String judet =  judetSpinner.getSelectedItem().toString();
            String scoala = scoalaAutoComplete.getText().toString();
            String clasa =  clasaSpinner.getSelectedItem().toString();
            int varsta = Integer.parseInt(varstaEt.getText().toString());
            if (nume.equals("")||email.equals("")||judet.equals("")||scoala.equals("")||clasa.equals("")||varsta==0)
                Toast.makeText(SignUp.this, "Completeaza toate datele", Toast.LENGTH_LONG).show();
            else if (!checkAccept.isChecked())
                Toast.makeText(SignUp.this, "Trebuie sa fii de acord cu termenele si conditiile", Toast.LENGTH_LONG).show();
            else
                registerUser(getFormsData());
        }
    }

}
