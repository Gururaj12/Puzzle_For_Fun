package com.example.dqtech.puzzle_for_fun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Findword extends AppCompatActivity {
Button fi1,fi2,fi3,fi4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_findword);

        fi1= (Button) findViewById(R.id.find1);
        fi2= (Button) findViewById(R.id.find2);
        fi3= (Button) findViewById(R.id.find3);
        fi4= (Button) findViewById(R.id.find4);
    }
}
