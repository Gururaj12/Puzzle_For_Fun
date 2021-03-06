package com.example.dqtech.puzzle_for_fun;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Five extends AppCompatActivity {
    RadioButton r17,r18,r19,r20;
    RadioGroup rr5;
    Button b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);
        rr5= (RadioGroup) findViewById(R.id.r5);
        r17= (RadioButton) findViewById(R.id.ry17);
        r18= (RadioButton) findViewById(R.id.ry18);
        r19= (RadioButton) findViewById(R.id.ry19);
        r20= (RadioButton) findViewById(R.id.ry20);
        b6= (Button) findViewById(R.id.n5);
        rr5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                switch (checkedId) {
                    case R.id.ry17:
                        Toast.makeText(getApplicationContext(), "wrong", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.ry18:
                        Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.ry19:
                        Toast.makeText(getApplicationContext(), "wrong", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.ry20:
                        Toast.makeText(getApplicationContext(), "wrong", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p=new Intent(Five.this,Six.class);
                startActivity(p);
            }
        });
    }
}
