package com.wakatech.invatarejuridica;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toolbar;

public class PlayMode extends AppCompatActivity {

    private LinearLayout rootLinearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_mode);

        ActionBar toolbar = getSupportActionBar();
        toolbar.setTitle("Play");
        toolbar.setDisplayHomeAsUpEnabled(true);

        rootLinearLayout = findViewById(R.id.root_linear_layout);

        for (int index=0 ; index < rootLinearLayout.getChildCount(); index++)
        {
            LinearLayout layout = (LinearLayout) rootLinearLayout.getChildAt(index);
            for (int index_j=0 ; index_j < layout.getChildCount(); index_j++)
            {
                Button button = (Button) layout.getChildAt(index_j);
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
