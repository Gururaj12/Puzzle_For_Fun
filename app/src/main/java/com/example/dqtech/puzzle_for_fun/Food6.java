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

public class Food6 extends AppCompatActivity {


    RadioButton rb6a,rb6b,rb6c;
    Button food6;
    RadioGroup rg6;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food6);



        rg6=(RadioGroup)findViewById(R.id.rg6);

        rb6a =(RadioButton)findViewById(R.id.rb6a);
        rb6b =(RadioButton)findViewById(R.id.rb6b);
        rb6c =(RadioButton)findViewById(R.id.rb6c);

        food6 =(Button) findViewById(R.id.food6);


        rg6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

            }
        });



        food6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h=new Intent(Food6.this,Food7.class);
                startActivity(h);
            }
        });



    }
}
