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

public class Food7 extends AppCompatActivity {

    RadioButton rb7a,rb7b,rb7c;
    Button food7;

    RadioGroup rg7;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food7);


        rg7=(RadioGroup)findViewById(R.id.rg7);

        rb7a =(RadioButton)findViewById(R.id.rb7a);
        rb7b =(RadioButton)findViewById(R.id.rb7b);
        rb7c =(RadioButton)findViewById(R.id.rb7c);
        food7 =(Button) findViewById(R.id.food7);


        rg7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

            }
        });



        food7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(Food7.this,Food8.class);
                startActivity(a);
            }
        });


    }
}
