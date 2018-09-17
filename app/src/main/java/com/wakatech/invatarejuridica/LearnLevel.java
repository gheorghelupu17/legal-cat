package com.wakatech.invatarejuridica;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LearnLevel extends AppCompatActivity {

    private TextView levelDescription;
    private Button startLevelButton;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_level);
        context = this;

        levelDescription = findViewById(R.id.invatare_nivel_tv);
        startLevelButton = findViewById(R.id.start_level_button);
        levelDescription.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam turpis libero, congue in lacinia nec, pretium vel diam. Suspendisse laoreet, augue sed viverra congue, ligula purus hendrerit erat, eu tincidunt enim augue ut odio. Vestibulum vestibulum vitae nunc sit amet tristique. Nunc varius accumsan tempus. Quisque cursus sapien ac ipsum convallis efficitur. Aenean pellentesque, leo a venenatis suscipit, mi erat aliquam velit, at interdum mauris purus eget nibh. Donec sagittis ante in nulla commodo, quis imperdiet felis feugiat. Phasellus ullamcorper nunc eget libero rutrum, eu auctor ante semper. Morbi dapibus arcu velit, et consequat justo bibendum ut. Pellentesque quis vulputate purus. Suspendisse potenti. Vivamus egestas nibh diam, ut luctus tellus mattis quis. Ut placerat magna vel leo imperdiet imperdiet. Morbi quis lectus elementum, ornare dolor eu, sollicitudin lorem. Cras ornare id leo in elementum. Quisque risus erat, lacinia eu arcu semper, dictum finibus odio.");

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        final int levelNumber = getIntent().getIntExtra("level_number",-1);
        actionBar.setTitle("Learn level: "+ levelNumber);

        startLevelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,PlayLevel.class);
                intent.putExtra("level_number",levelNumber);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        super.onBackPressed();
        return super.onSupportNavigateUp();
    }
}
