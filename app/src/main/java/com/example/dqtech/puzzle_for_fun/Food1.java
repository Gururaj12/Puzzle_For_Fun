package com.example.dqtech.puzzle_for_fun;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by ADMIN on 1/25/2018.
 */

public class Food1 extends AppCompatActivity {

      RadioButton rba,rbb,rbc;
      Button food1;
      RadioGroup rg1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food1);



        rba=(RadioButton) findViewById(R.id.rba);
        rbb=(RadioButton)findViewById(R.id.rbb);
        rbc=(RadioButton)findViewById(R.id.rbc);

        rg1=(RadioGroup)findViewById(R.id.rg1);

        food1=(Button)findViewById(R.id.food1);

        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if(rba.isChecked()){


                }
                else if (rbb.isChecked()){

                }

                if (rbc.isChecked()){



                }


            }
        });




        food1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent r=new Intent(Food1.this,Food2.class);
                startActivity(r);

            }
        });

    }
}
