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

public class Digital5 extends AppCompatActivity {
    RadioButton r57, r58, r59, r60;
    RadioGroup rr15;
    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer);
        rr15 = (RadioGroup) findViewById(R.id.rr15);
        r57 = (RadioButton) findViewById(R.id.ry57);
        r58 = (RadioButton) findViewById(R.id.ry58);
        r59 = (RadioButton) findViewById(R.id.ry59);
        r60 = (RadioButton) findViewById(R.id.ry60);
        b2 = (Button) findViewById(R.id.n1);
        rr15.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                switch (checkedId) {
                    case R.id.ry57:
                        Toast.makeText(getApplicationContext(), "correct", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.ry58:
                        Toast.makeText(getApplicationContext(), "wrong", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.ry59:
                        Toast.makeText(getApplicationContext(), "wrong", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.ry60:
                        Toast.makeText(getApplicationContext(), "wrong", Toast.LENGTH_SHORT).show();
                        break;
                }
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent j = new Intent(Digital5.this, Digital6.class);
                        startActivity(j);
                    }
                });
            }
        });
    }
}