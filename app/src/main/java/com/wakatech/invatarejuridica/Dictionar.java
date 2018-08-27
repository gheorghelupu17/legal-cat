package com.wakatech.invatarejuridica;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

public class Dictionar extends AppCompatActivity {

    private ListView listOfWords;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dictionar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Dictionar");
        actionBar.setDisplayHomeAsUpEnabled(true);

        listOfWords = findViewById(R.id.list_of_dictionary_words);
        ArrayList<String> searchWords = new ArrayList<>();
        addWords(searchWords);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,searchWords);

        listOfWords.setAdapter(adapter);

        listOfWords.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String word = String.valueOf(parent.getItemAtPosition(position));
                BottomSheetDictionar bottomSheetDictionar = new BottomSheetDictionar();
                Bundle args = new Bundle();
                args.putString("word",word);
                bottomSheetDictionar.setArguments(args);
                bottomSheetDictionar.show(getSupportFragmentManager(),"bs");
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    private void addWords(ArrayList<String> arrayList) {
        arrayList.add("gigi");
        arrayList.add("liil");
        arrayList.add("mcdonalds");
        arrayList.add("kfc");
        arrayList.add("andrei");
        arrayList.add("curea");
        arrayList.add("abac");
        arrayList.add("gigi");
        arrayList.add("liil");
        arrayList.add("mcdonalds");
        arrayList.add("kfc");
        arrayList.add("andrei");
        arrayList.add("curea");
        arrayList.add("abac");
        arrayList.add("gigi");
        arrayList.add("liil");
        arrayList.add("mcdonalds");
        arrayList.add("kfc");
        arrayList.add("andrei");
        arrayList.add("curea");
        arrayList.add("abac");
        arrayList.add("gigi");
        arrayList.add("liil");
        arrayList.add("mcdonalds");
        arrayList.add("kfc");
        arrayList.add("andrei");
        arrayList.add("curea");
        arrayList.add("abac");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.search_menu,menu);
        MenuItem item = menu.findItem(R.id.search_button);
        SearchView searchView = (SearchView) item.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }
}
