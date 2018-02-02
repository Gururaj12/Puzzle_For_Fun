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

public class Digital2 extends AppCompatActivity {
    RadioButton r45, r46, r47, r48;
    RadioGroup rr2;
    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer);
        rr2 = (RadioGroup) findViewById(R.id.rr12);
        r45 = (RadioButton) findViewById(R.id.ry45);
        r46 = (RadioButton) findViewById(R.id.ry46);
        r47 = (RadioButton) findViewById(R.id.ry47);
        r48 = (RadioButton) findViewById(R.id.ry48);
        b2 = (Button) findViewById(R.id.n1);
        rr2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                switch (checkedId) {
                    case R.id.ry45:
                        Toast.makeText(getApplicationContext(), "correct", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.ry46:
                        Toast.makeText(getApplicationContext(), "wrong", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.ry47:
                        Toast.makeText(getApplicationContext(), "wrong", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.ry48:
                        Toast.makeText(getApplicationContext(), "wrong", Toast.LENGTH_SHORT).show();
                        break;
                }
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent j = new Intent(Digital2.this, Digital3.class);
                        startActivity(j);
                    }
                });
            }
        });
    }
}