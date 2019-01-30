package com.wakatech.invatarejuridica;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toolbar;

public class Setari extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setari);

        ActionBar toolbar = getSupportActionBar();
        toolbar.setTitle("Despre noi");
        toolbar.setDisplayHomeAsUpEnabled(true);

        String htmlText = " %s ";
        String myData = "<p align=\"justify\"> Proiect civic-juridic realizat de Asociația pentru Dialog în Justiție, cofinanțat de Primăria Municipiului Iași prin programul anual de finanțare nerambursabilă pentru organizații neguvernamentale. </br>Informațiile prezentate aparțin specialiștilor implicați în elaborarea testelor de educație civică și juridică.</p>";
        WebView webView = (WebView) findViewById(R.id.webView1);
        webView.loadData(String.format(htmlText, myData), "text/html", "utf-8");
    }

    @Override
    public boolean onSupportNavigateUp() {
        super.onBackPressed();
        return true;
    }
}