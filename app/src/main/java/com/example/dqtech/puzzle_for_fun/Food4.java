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

public class Food4 extends AppCompatActivity {


    RadioButton rb4a,rb4b,rb4c;
    Button food4;
    RadioGroup rg4;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food4);



        rb4a =(RadioButton)findViewById(R.id.rb4a);
        rb4b =(RadioButton)findViewById(R.id.rb4b);
        rb4c =(RadioButton)findViewById(R.id.rb4c);

        rg4=(RadioGroup)findViewById(R.id.rg4);


        food4 =(Button)findViewById(R.id.food4);


        rg4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int Id) {


                switch(Id){

                    case R.id.rb4a:
                        Toast.makeText(getApplicationContext(),"correct",Toast.LENGTH_LONG).show();
                        break;

                    case R.id.rb4b:
                        Toast.makeText(getApplicationContext(),"wrong",Toast.LENGTH_LONG).show();
                        break;

                    case R.id.rb4c:
                        Toast.makeText(getApplicationContext(),"wrong",Toast.LENGTH_LONG).show();
                        break;



                }


            }
        });


        food4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Food4.this,Food5.class);
                startActivity(i);
            }
        });



    }
}
