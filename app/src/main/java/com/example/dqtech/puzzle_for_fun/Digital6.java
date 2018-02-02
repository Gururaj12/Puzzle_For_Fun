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

public class Digital6 extends AppCompatActivity {
    RadioButton r61, r62, r63, r64;
    RadioGroup rr16;
    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer);
        rr16 = (RadioGroup) findViewById(R.id.rr16);
        r61 = (RadioButton) findViewById(R.id.ry61);
        r62 = (RadioButton) findViewById(R.id.ry62);
        r63 = (RadioButton) findViewById(R.id.ry63);
        r64 = (RadioButton) findViewById(R.id.ry64);
        b2 = (Button) findViewById(R.id.n1);
        rr16.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                switch (checkedId) {
                    case R.id.ry61:
                        Toast.makeText(getApplicationContext(), "correct", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.ry62:
                        Toast.makeText(getApplicationContext(), "wrong", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.ry63:
                        Toast.makeText(getApplicationContext(), "wrong", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.ry64:
                        Toast.makeText(getApplicationContext(), "wrong", Toast.LENGTH_SHORT).show();
                        break;
                }
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent j = new Intent(Digital6.this, Digital7.class);
                        startActivity(j);
                    }
                });
            }
        });
    }
}