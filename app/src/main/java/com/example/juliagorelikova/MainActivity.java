package com.example.juliagorelikova.musicalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView russiatextView = (TextView)findViewById(R.id.russia_text_view);
        russiatextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent russiaIntent = new Intent(MainActivity.this, RussiaActivity.class);
                startActivity(russiaIntent);
            }
        });

        TextView germanyTextView = (TextView)findViewById(R.id.germany_text_view);
        germanyTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent germanyIntent = new Intent(MainActivity.this, GermanyActivity.class);
                startActivity(germanyIntent);
            }
        });

        TextView franceTextView = (TextView)findViewById(R.id.france_text_view);
        franceTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent franceIntent = new Intent(MainActivity.this, FranceActivity.class);
                startActivity(franceIntent);
            }
        });
    }
}
