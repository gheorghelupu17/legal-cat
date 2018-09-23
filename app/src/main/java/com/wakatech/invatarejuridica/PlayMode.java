package com.wakatech.invatarejuridica;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toolbar;

public class PlayMode extends AppCompatActivity {

    private LinearLayout rootLinearLayout;
    private Context context;
    private TextView levelDescription;
    private CardView card;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_mode);
        context = this;

        ActionBar toolbar = getSupportActionBar();
        toolbar.setTitle("Play");
        toolbar.setDisplayHomeAsUpEnabled(true);

        rootLinearLayout = findViewById(R.id.root_linear_layout);
        card = findViewById(R.id.cardcard);
        card.addView(getLayoutInflater().inflate(R.layout.cardview_design,null));


        for (int index = 1 ; index < rootLinearLayout.getChildCount(); index++)
        {
            LinearLayout layout = (LinearLayout) rootLinearLayout.getChildAt(index);
            for (int index_j=0 ; index_j < layout.getChildCount(); index_j++)
            {
                final int levelNumber =  index*3 + index_j+1;
                Button button = (Button) layout.getChildAt(index_j);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(context,LearnLevel.class);
                        intent.putExtra("level_number",levelNumber);
                        startActivity(intent);
                    }
                });
                button.setText(index*3+index_j+1+"");
            }
        }



    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }


}
