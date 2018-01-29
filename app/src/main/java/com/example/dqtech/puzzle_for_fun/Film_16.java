package com.example.dqtech.puzzle_for_fun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Film_16 extends AppCompatActivity {

    TextView film16tv;
    Button film16a,film16b,film16c,film16d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_film_16);

        film16tv = (TextView) findViewById(R.id.film16tv);
        film16a = (Button) findViewById(R.id.film16a);
        film16b = (Button) findViewById(R.id.film16b);
        film16c = (Button) findViewById(R.id.film16c);
        film16d = (Button) findViewById(R.id.film16d);



        film16a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        film16b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        film16c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        film16d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



    }
}
