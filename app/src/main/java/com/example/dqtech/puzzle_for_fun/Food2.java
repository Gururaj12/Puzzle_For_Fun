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

public class Food2 extends AppCompatActivity {
    RadioButton rb2a,rb2b,rb2c;
    Button food2;
    RadioGroup rg2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food2);

        rb2a =(RadioButton)findViewById(R.id.rb2a);
        rb2b =(RadioButton)findViewById(R.id.rb2b);
        rb2c =(RadioButton)findViewById(R.id.rb2c);

        food2 =(Button)findViewById(R.id.food2);

        rg2=(RadioGroup)findViewById(R.id.rg2);


        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

            }
        });



        food2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(Food2.this,Food3.class);
                startActivity(a);
            }
        });


    }
}
