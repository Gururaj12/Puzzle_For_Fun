package com.example.dqtech.puzzle_for_fun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Film_21 extends AppCompatActivity {

    TextView film21tv;
    Button film21a,film21b,film21c,film21d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_film_21);

        film21tv = (TextView) findViewById(R.id.film21tv);
        film21a = (Button) findViewById(R.id.film21a);
        film21b = (Button) findViewById(R.id.film21b);
        film21c = (Button) findViewById(R.id.film21c);
        film21d = (Button) findViewById(R.id.film21d);


        film21a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        film21b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        film21c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        film21d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });




    }
}
