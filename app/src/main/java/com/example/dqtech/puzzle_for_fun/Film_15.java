package com.example.dqtech.puzzle_for_fun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Film_15 extends AppCompatActivity {
    TextView film15tv;
    Button film15a,film15b,film15c,film15d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_film_15);

        film15tv = (TextView) findViewById(R.id.film15tv);
        film15a = (Button) findViewById(R.id.film15a);
        film15b = (Button) findViewById(R.id.film15b);
        film15c = (Button) findViewById(R.id.film15c);
        film15d = (Button) findViewById(R.id.film15d);

        film15a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        film15b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        film15c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        film15d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



    }
}
