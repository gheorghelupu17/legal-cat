package com.wakatech.invatarejuridica;

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
                                    baseUrl("http://10.0.2.2:5000").
                                    addConverterFactory(GsonConverterFactory.create());

        Retrofit retrofit = builder.build();

        LeadersClient client = retrofit.create(LeadersClient.class);
        Call<List<Leader>> call = client.getAllLeaders();

        call.enqueue(new Callback<List<Leader>>() {
            @Override
            public void onResponse(Call<List<Leader>> call, Response<List<Leader>> response) {
                List<Leader> lideriList = (ArrayList<Leader>) response.body();

                for (int i=0;i<100;i++) {
                    lideriList.add(new Leader("gigica",14));
                }

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
