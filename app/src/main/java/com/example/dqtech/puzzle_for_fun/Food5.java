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

public class Food5 extends AppCompatActivity {

    RadioButton rb5a,rb5b,rb5c;
    Button food5;
    RadioGroup rg5;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food5);


        rb5a =(RadioButton)findViewById(R.id.rb5a);
        rb5b =(RadioButton)findViewById(R.id.rb5b);
        rb5c =(RadioButton)findViewById(R.id.rb5c);

        rg5=(RadioGroup)findViewById(R.id.rg5);


        food5 =(Button)findViewById(R.id.food5);


        rg5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

            }
        });



        food5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s=new Intent(Food5.this,Food6.class);
                startActivity(s);
            }
        });



    }
}
