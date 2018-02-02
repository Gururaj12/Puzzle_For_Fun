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

public class Digital3 extends AppCompatActivity {
    RadioButton r49, r50, r51, r52;
    RadioGroup rr13;
    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer);
        rr13 = (RadioGroup) findViewById(R.id.rr13);
        r49 = (RadioButton) findViewById(R.id.ry49);
        r50 = (RadioButton) findViewById(R.id.ry50);
        r51 = (RadioButton) findViewById(R.id.ry51);
        r52 = (RadioButton) findViewById(R.id.ry52);
        b2 = (Button) findViewById(R.id.n1);
        rr13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                switch (checkedId) {
                    case R.id.ry49:
                        Toast.makeText(getApplicationContext(), "correct", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.ry50:
                        Toast.makeText(getApplicationContext(), "wrong", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.ry51:
                        Toast.makeText(getApplicationContext(), "wrong", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.ry52:
                        Toast.makeText(getApplicationContext(), "wrong", Toast.LENGTH_SHORT).show();
                        break;
                }
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent j = new Intent(Digital3.this, Digital4.class);
                        startActivity(j);
                    }
                });
            }
        });
    }
}