package com.wakatech.invatarejuridica;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
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
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameText = findViewById(R.id.textUsername);
        passwordText = findViewById(R.id.textPassword);
        logInButton = findViewById(R.id.buttonLogIn);
        context = this;



        SharedPreferences data = this.getSharedPreferences("login_info",MODE_PRIVATE);
        final String username = data.getString("username", null);
        final String password = data.getString("password",null);
        if (username!=null && password != null)
        {
            Retrofit retrofit = new Retrofit.Builder().
                    baseUrl("https://legal-cat.ro/").
                    addConverterFactory(GsonConverterFactory.create())
                    .build();

            LoginClient loginClient = retrofit.create(LoginClient.class);
            Call<Auth> call = loginClient.logInUser(username, password);
            call.enqueue(new Callback<Auth>() {
                @Override
                public void onResponse(Call<Auth> call, Response<Auth> response) {
                    Auth auth = response.body();
                    if (auth.msg)
                        grantAcces(username, password, auth.token);
                    else
                        Toast.makeText(Login.this,"User nu a fost gasit",Toast.LENGTH_LONG).show();
                }

                @Override
                public void onFailure(Call<Auth> call, Throwable t) {

                }
            });
        }


    }

    public void checkInfo(View view) {
        final String user = usernameText.getText().toString();
        final String pass = passwordText.getText().toString();
        usernameText.setText(null);
        passwordText.setText(null);
        if (!user.equals("")  && !pass.equals(""))
        {
            Retrofit retrofit = new Retrofit.Builder().
                    baseUrl("https://legal-cat.wakatech.ro/").
                    addConverterFactory(GsonConverterFactory.create())
                    .build();

            LoginClient loginClient = retrofit.create(LoginClient.class);
            Call<Auth> call = loginClient.logInUser(user, pass);

            call.enqueue(new Callback<Auth>() {
                @Override
                public void onResponse(Call<Auth> call, Response<Auth> response) {
                    //assert (response.toString().equals(""));
                    if (response.body().msg)
                        grantAcces(user, pass, response.body().token);
                    else
                        Toast.makeText(Login.this,"User nu a fost gasit",Toast.LENGTH_LONG).show();
                }

                @Override
                public void onFailure(Call<Auth> call, Throwable t) {
                    Toast.makeText(Login.this,"EROR",Toast.LENGTH_LONG).show();
                }
            });

        }

    }

    private void grantAcces(String user, String pass, String token) {
        SharedPreferences sharedPref = context.getSharedPreferences("login_info",MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("username",user);
        editor.putString("password",pass);
        editor.putString("token",token);
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
