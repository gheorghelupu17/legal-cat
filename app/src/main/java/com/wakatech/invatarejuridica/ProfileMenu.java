package com.wakatech.invatarejuridica;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.wakatech.invatarejuridica.helper.UserDetails;
import com.wakatech.invatarejuridica.networking.ProfilClient;
import com.wakatech.invatarejuridica.networking.ProfileInfo;

import org.w3c.dom.Text;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ProfileMenu extends AppCompatActivity {

    private TextView profileName;
    private TextView profileEmail;
    private TextView scoreTv;
    private TextView rankTv;
    private TextView scoalaTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_menu);

        profileName = findViewById(R.id.text_name_profile_menu);
        profileEmail = findViewById(R.id.profile_email);
        scoreTv = findViewById(R.id.score_text_view);
        rankTv = findViewById(R.id.text_rank);
        scoalaTv = findViewById(R.id.scoala_text);

        Retrofit.Builder builder = new Retrofit.Builder().
                baseUrl("https://legal-cat.wakatech.ro/").
                addConverterFactory(GsonConverterFactory.create());

        Retrofit retrofit = builder.build();

        SharedPreferences sharedPref = this.getSharedPreferences("login_info",MODE_PRIVATE);
        String token = sharedPref.getString("token",null);
        String email = sharedPref.getString("username", null);
        ProfilClient client = retrofit.create(ProfilClient.class);
        Call<ProfileInfo> call = client.getProfile(token, email);

        call.enqueue(new Callback<ProfileInfo>() {
            @Override
            public void onResponse(Call<ProfileInfo> call, Response<ProfileInfo> response) {
                ProfileInfo info = response.body();
                int score = getScore(info.intrebari);
                profileEmail.setText(info.email);
                profileName.setText(info.name);
                scoreTv.setText(score+" ");
                scoalaTv.setText(info.scoala);
                if (score<10)
                    rankTv.setText("Incepator");
                else if (score<30)
                    rankTv.setText("Interesat");
                else if (score<50)
                    rankTv.setText("Mediu");
                else if (score<80)
                    rankTv.setText("Avansat");
                else
                    rankTv.setText("Pro");

            }

            @Override
            public void onFailure(Call<ProfileInfo> call, Throwable t) {
                Toast.makeText(ProfileMenu.this, "ALSKJD", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public int getScore(String intrebari) {
        char chars[] = intrebari.toCharArray();
        int score = 0;
        for (char c : chars)
        {
            switch (c)
            {
                case '1':
                    score+=8;
                    break;
                case '2':
                    score+=9;
                    break;
                case '3':
                    score+=10;
                    break;
            }
        }
        return score;
    }

    public void backButton(View view) {
        super.onBackPressed();
    }
}
