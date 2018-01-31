package com.example.dqtech.puzzle_for_fun;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/**
 * Created by ADMIN on 1/25/2018.
 */

public class Food8 extends AppCompatActivity {

    RadioButton rb8a,rb8b,rb8c;
    Button food8;

    RadioGroup rg8;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food8);


        rg8=(RadioGroup)findViewById(R.id.rg8);

        rb8a =(RadioButton)findViewById(R.id.rb8a);
        rb8b =(RadioButton)findViewById(R.id.rb8b);
        rb8c =(RadioButton)findViewById(R.id.rb8c);
        food8 =(Button) findViewById(R.id.food8);


        rg8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

            }
        });



        food8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n=new Intent(Food8.this,Food9.class);
                startActivity(n);
            }
        });

    }
}
