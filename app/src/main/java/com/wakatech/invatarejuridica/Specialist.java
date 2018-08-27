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
                    Toast.makeText(Specialist.this,"Scrie o intrebare",Toast.LENGTH_SHORT).show();
                } else {
                    intrebare.setText("");
                    Toast.makeText(Specialist.this,"Intrebarea a fost trimisa",Toast.LENGTH_SHORT).show();
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
