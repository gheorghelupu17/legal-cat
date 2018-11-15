package com.wakatech.invatarejuridica;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.wakatech.invatarejuridica.helper.Auth;
import com.wakatech.invatarejuridica.helper.UserDetails;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

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
        String user = usernameText.getText().toString();
        String pass = passwordText.getText().toString();
        usernameText.setText(null);
        passwordText.setText(null);
        if (user.equals("") || pass.equals("")) {
            grantAcces();
        } else {

            Retrofit retrofit = new Retrofit.Builder().
                    baseUrl("http://legal-cat.wakatech.ro/").
                    addConverterFactory(GsonConverterFactory.create())
                    .build();

            LoginClient loginClient = retrofit.create(LoginClient.class);
            Call<Auth> call = loginClient.logInUser(new Auth(user,pass,null));

            call.enqueue(new Callback<Auth>() {
                @Override
                public void onResponse(Call<Auth> call, Response<Auth> response) {
                    //assert (response.toString().equals(""));

                    Auth mesaj = response.body();
                    UserDetails.setEmail(mesaj.email);
                    UserDetails.setName(mesaj.password);
                    Toast.makeText(Login.this,mesaj.msg, Toast.LENGTH_LONG).show();
                    grantAcces();
                }

                @Override
                public void onFailure(Call<Auth> call, Throwable t) {
                    Toast.makeText(Login.this,"ERR",Toast.LENGTH_LONG).show();
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
