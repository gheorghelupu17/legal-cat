package com.wakatech.invatarejuridica;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainMenu extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    private TextView textView;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        drawerLayout = findViewById(R.id.drawer_layout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close);
        navigationView = findViewById(R.id.navigation_view_list);

        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                int id = item.getItemId();
                switch (id)
                {
                    case R.id.nav_account:
                        Intent i = new Intent(MainMenu.this,ProfileMenu.class);
                        startActivity(i);

                        break;

                    case R.id.settings:
                        Intent intent = new Intent(MainMenu.this,Setari.class);
                        startActivity(intent);

                        break;

                    case R.id.logout:
                        //apasa pe "Exit"
                        break;
                }
                return false;
            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (actionBarDrawerToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    public void openPlayMode(View view) {
        Intent intent = new Intent(this,PlayMode.class);
        startActivity(intent);
    }

    public void openStiatiCa(View view) {
        Intent intent = new Intent(this,Stiatica.class);
        startActivity(intent);
    }

    public void openLideri(View view) {
        Intent intent = new Intent(this,Lideri.class);
        startActivity(intent);
    }

    public void openSpecialist(View view) {
        Intent intent = new Intent(this,Specialist.class);
        startActivity(intent);
    }

    public void openDictionar(View view) {
        Intent intent = new Intent(this,Dictionar.class);
        startActivity(intent);
    }


}
