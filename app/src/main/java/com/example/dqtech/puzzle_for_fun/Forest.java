package com.example.dqtech.puzzle_for_fun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Forest extends AppCompatActivity {
Button for1,for2,for3,for4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forest);
        for1= (Button) findViewById(R.id.fore1);
        for2= (Button) findViewById(R.id.fore2);
        for3= (Button) findViewById(R.id.fore3);
        for4= (Button) findViewById(R.id.fore4);
    }
}
