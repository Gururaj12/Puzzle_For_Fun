package com.example.dqtech.puzzle_for_fun;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Digital8 extends AppCompatActivity {
    RadioButton r69, r70, r71, r72;
    RadioGroup rr18;
    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer);
        rr18 = (RadioGroup) findViewById(R.id.r1);
        r69 = (RadioButton) findViewById(R.id.ry69);
        r70 = (RadioButton) findViewById(R.id.ry70);
        r71 = (RadioButton) findViewById(R.id.ry71);
        r72 = (RadioButton) findViewById(R.id.ry72);
        b2 = (Button) findViewById(R.id.n1);
        rr18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                switch (checkedId) {
                    case R.id.ry69:
                        Toast.makeText(getApplicationContext(), "correct", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.ry70:
                        Toast.makeText(getApplicationContext(), "wrong", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.ry71:
                        Toast.makeText(getApplicationContext(), "wrong", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.ry72:
                        Toast.makeText(getApplicationContext(), "wrong", Toast.LENGTH_SHORT).show();
                        break;
                }
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent j = new Intent(Digital8.this, Digital9.class);
                        startActivity(j);
                    }
                });
            }
        });
    }
}