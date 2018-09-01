package com.wakatech.invatarejuridica;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class Specialist extends AppCompatActivity {

    private Spinner spinner;
    private Button askButton;
    private EditText intrebare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specialist);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Intreaba un specialist");
        actionBar.setDisplayHomeAsUpEnabled(true);

        spinner = findViewById(R.id.category_select);
        askButton = findViewById(R.id.askbutton);
        intrebare = findViewById(R.id.intrebare);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.categories, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = String.valueOf(intrebare.getText());
                if (str == null || str.equals("")) {
                    //Validam ca intrebarea sa nu fie goala
                    Toast.makeText(Specialist.this,"Scrie o intrebare",Toast.LENGTH_SHORT).show();
                } else {
                    Retrofit.Builder builder = new Retrofit.Builder().addConverterFactory(ScalarsConverterFactory.create()).baseUrl("http://10.0.2.2:5000");
                    Retrofit retrofit = builder.build();

                    SpecialistClient specialistClient = retrofit.create(SpecialistClient.class);
                    Call<String> call = specialistClient.askQuestion(str);

                    call.enqueue(new Callback<String>() {
                        @Override
                        public void onResponse(Call<String> call, Response<String> response) {
                            Toast.makeText(Specialist.this, response.body(), Toast.LENGTH_SHORT).show();
                        }

                        @Override
                        public void onFailure(Call<String> call, Throwable t) {
                            Toast.makeText(Specialist.this,"Intrebarea nu s-a putut trimite :(",Toast.LENGTH_LONG).show();
                        }
                    });


                    intrebare.setText("");
                }
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
