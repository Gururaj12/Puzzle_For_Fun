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

public class Food3 extends AppCompatActivity {

    RadioButton rb3a,rb3b,rb3c;
    Button food3;
    RadioGroup rg3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food3);



        rb3a =(RadioButton)findViewById(R.id.rb3a);
        rb3b =(RadioButton)findViewById(R.id.rb3b);
        rb3c =(RadioButton)findViewById(R.id.rb3c);

        rg3=(RadioGroup)findViewById(R.id.rg3);

        food3 =(Button)findViewById(R.id.food3);

        rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

            }
        });



        food3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent v=new Intent(Food3.this,Food4.class);
                startActivity(v);
            }
        });



    }
}
