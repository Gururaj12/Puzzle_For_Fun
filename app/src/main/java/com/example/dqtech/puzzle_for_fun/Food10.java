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

    public class Food10 extends AppCompatActivity {

    RadioButton rb10a,rb10b,rb10c;
    Button food10;
    RadioGroup rg10;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food10);


        rg10=(RadioGroup)findViewById(R.id.rg10);


        rb10a =(RadioButton)findViewById(R.id.rb10a);
        rb10b =(RadioButton)findViewById(R.id.rb10b);
        rb10c =(RadioButton)findViewById(R.id.rb10c);
        food10 =(Button) findViewById(R.id.food10);


        rg10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

            }
        });


        food10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent r=new Intent(Food10.this,Food10.class);
                startActivity(r);
            }
        });



    }
}
