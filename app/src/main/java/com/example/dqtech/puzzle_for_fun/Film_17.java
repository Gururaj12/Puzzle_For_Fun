package com.example.dqtech.puzzle_for_fun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Film_17 extends AppCompatActivity {

    TextView film17tv;
    Button film17a,film17b,film17c,film17d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_film_17);

        film17tv = (TextView) findViewById(R.id.film17tv);
        film17a = (Button) findViewById(R.id.film17a);
        film17b = (Button) findViewById(R.id.film17b);
        film17c = (Button) findViewById(R.id.film17c);
        film17d = (Button) findViewById(R.id.film17d);


        film17a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        film17b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        film17c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        film17d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
}
