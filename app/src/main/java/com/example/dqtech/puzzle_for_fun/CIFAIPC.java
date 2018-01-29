package com.example.dqtech.puzzle_for_fun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class CIFAIPC extends AppCompatActivity {
Button cifb1,cifb2,cifb3,cifb4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cifaipc);

        cifb1= (Button) findViewById(R.id.cif1);
        cifb2= (Button) findViewById(R.id.cif2);
        cifb3= (Button) findViewById(R.id.cif3);
        cifb4= (Button) findViewById(R.id.cif4);
    }
}
