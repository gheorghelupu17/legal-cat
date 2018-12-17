package com.wakatech.invatarejuridica;

import android.content.SharedPreferences;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Lideri extends AppCompatActivity {

    private ListView listaLideri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lideri);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Lideri");
        actionBar.setDisplayHomeAsUpEnabled(true);

        listaLideri = findViewById(R.id.lista_lideri);

        Retrofit.Builder builder = new Retrofit.Builder().
                                    baseUrl("https://legal-cat.wakatech.ro/").
                                    addConverterFactory(GsonConverterFactory.create());

        Retrofit retrofit = builder.build();

        SharedPreferences sharedPref = this.getSharedPreferences("login_info",MODE_PRIVATE);
        String token = sharedPref.getString("token",null);
        LeadersClient client = retrofit.create(LeadersClient.class);
        Call<List<Leader>> call = client.getAllLeaders(token);

        call.enqueue(new Callback<List<Leader>>() {
            @Override
            public void onResponse(Call<List<Leader>> call, Response<List<Leader>> response) {
                List<Leader> lideriList = (ArrayList<Leader>) response.body();
                LeaderboardsAdapter adapter = new LeaderboardsAdapter(Lideri.this,lideriList);

                listaLideri.setAdapter(adapter);

            }

            @Override
            public void onFailure(Call<List<Leader>> call, Throwable t) {
                Toast.makeText(Lideri.this, "eroare", Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
