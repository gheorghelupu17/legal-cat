package com.wakatech.invatarejuridica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.wakatech.invatarejuridica.helper.UserDetails;

public class ProfileMenu extends AppCompatActivity {

    private TextView profileName;
    private TextView profileEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_menu);

        profileName = findViewById(R.id.text_name_profile_menu);
        profileEmail = findViewById(R.id.profile_email);

        profileName.setText(UserDetails.getName());
        profileEmail.setText(UserDetails.getEmail());

    }

    public void backButton(View view) {
        super.onBackPressed();
    }
}
