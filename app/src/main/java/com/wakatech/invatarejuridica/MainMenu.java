package com.wakatech.invatarejuridica;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.wakatech.invatarejuridica.helper.UserDetails;

import java.util.List;

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
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.settings:
                        Intent intent = new Intent(MainMenu.this,Setari.class);
                        startActivity(intent);
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.logout:
                        SharedPreferences sharedPreferences= MainMenu.this.getSharedPreferences("login_info",MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putInt("is_logged",0);
                        editor.commit();
                        Intent logoutIntent = new Intent(MainMenu.this,Login.class);
                        startActivity(logoutIntent);
                        finish();
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
            TextView navigationName = findViewById(R.id.name_navigation_display);
            navigationName.setText(UserDetails.getName());
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
