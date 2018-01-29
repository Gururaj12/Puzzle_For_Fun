package com.example.dqtech.puzzle_for_fun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Film_18 extends AppCompatActivity {

    TextView film18tv;
    Button film18a,film18b,film18c,film18d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_film_18);

        film18tv = (TextView) findViewById(R.id.film18tv);
        film18a = (Button) findViewById(R.id.film18a);
        film18b = (Button) findViewById(R.id.film18b);
        film18c = (Button) findViewById(R.id.film18c);
        film18d = (Button) findViewById(R.id.film18d);


        film18a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        film18b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        film18c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        film18d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
}
