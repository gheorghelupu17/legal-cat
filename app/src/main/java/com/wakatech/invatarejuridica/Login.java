package com.wakatech.invatarejuridica;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.wakatech.invatarejuridica.helper.UserDetails;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class Login extends AppCompatActivity {

    private EditText usernameText;
    private EditText passwordText;
    private Button logInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedPreferences sharedPref = this.getSharedPreferences("login_info",MODE_PRIVATE);
        if (sharedPref.getInt("is_logged",0)==1)
        {
            grantAcces();
        }

        setContentView(R.layout.activity_login);



        usernameText = findViewById(R.id.textUsername);
        passwordText = findViewById(R.id.textPassword);
        logInButton = findViewById(R.id.buttonLogIn);

    }

    public void checkInfo(View view) {
        final String user = usernameText.getText().toString();
        String pass = passwordText.getText().toString();
        usernameText.setText(null);
        passwordText.setText(null);
        if (user.equals("") || pass.equals("")) {
            Toast.makeText(this,"Introdu datele",Toast.LENGTH_SHORT).show();
        } else {

            Retrofit retrofit = new Retrofit.Builder().
                    addConverterFactory(ScalarsConverterFactory.create()).
                    baseUrl("http://10.0.2.2:5000").build();

            LoginClient loginClient = retrofit.create(LoginClient.class);
            Call<Integer> call = loginClient.logInUser(user,pass);

            call.enqueue(new Callback<Integer>() {
                @Override
                public void onResponse(Call<Integer> call, Response<Integer> response) {
                    if (response.body()!=-1)
                    {
                        UserDetails.setName(user);
                        UserDetails.setSchool("Costache Negruzzi Iasi");
                        UserDetails.setEmail("g_agache@yahoo.com");
                        grantAcces();
                    }
                    else
                        Toast.makeText(Login.this,"Date incorecte",Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onFailure(Call<Integer> call, Throwable t) {
                    Toast.makeText(Login.this,"Problema tehnica",Toast.LENGTH_SHORT).show();
                }
            });

        }

    }

    private void grantAcces() {
        SharedPreferences sharedPref = this.getSharedPreferences("login_info",MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("is_logged",1);
        editor.apply();
        Intent intent = new Intent(this,MainMenu.class);
        startActivity(intent);
        finish();
    }




    public void startSignUp(View view) {
        Intent i = new Intent(this, SignUp.class);
        startActivity(i);
    }
}
