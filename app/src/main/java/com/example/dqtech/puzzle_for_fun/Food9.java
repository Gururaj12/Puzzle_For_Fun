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

public class Food9 extends AppCompatActivity {

    RadioButton rb9a,rb9b,rb9c;
    Button food9;
    RadioGroup rg9;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food9);


        rg9=(RadioGroup)findViewById(R.id.rg9);

        rb9a =(RadioButton)findViewById(R.id.rb9a);
        rb9b =(RadioButton)findViewById(R.id.rb9b);
        rb9c =(RadioButton)findViewById(R.id.rb9c);
        food9 =(Button) findViewById(R.id.food9);

        rg9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int Id) {



                switch(Id){

                    case R.id.rb9a:
                        Toast.makeText(getApplicationContext(),"wrong",Toast.LENGTH_LONG).show();
                        break;

                    case R.id.rb9b:
                        Toast.makeText(getApplicationContext(),"correct",Toast.LENGTH_LONG).show();
                        break;

                    case R.id.rb9c:
                        Toast.makeText(getApplicationContext(),"wrong",Toast.LENGTH_LONG).show();
                        break;



                }




            }
        });



        food9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k=new Intent(Food9.this,Food10.class);
                startActivity(k);
            }
        });



    }
}
