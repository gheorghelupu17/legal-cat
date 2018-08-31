package com.wakatech.invatarejuridica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private EditText usernameText;
    private EditText passwordText;
    private Button logInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
            Toast.makeText(this,"Introdu datele",Toast.LENGTH_SHORT).show();
        } else {
            UserDetails.setName(user);
            UserDetails.setSchool("Costache Negruzzi Iasi");
            UserDetails.setEmail("g_agache@yahoo.com");
            grantAcces();
        }

    }

    private void grantAcces() {
        Intent intent = new Intent(this,MainMenu.class);
        startActivity(intent);
        finish();
    }}
