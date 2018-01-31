package com.example.dqtech.puzzle_for_fun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Questionr7 extends AppCompatActivity {

    Button question7a,question7b,question7c,question7d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionr7);
        question7a=(Button)findViewById(R.id.question1a);
        question7b=(Button)findViewById(R.id.question1b);
        question7c=(Button)findViewById(R.id.question1c);
        question7d=(Button)findViewById(R.id.question1d);

        question7a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast newToast = Toast.makeText(getApplicationContext(), R.string.app_name, Toast.LENGTH_LONG);
                newToast.setGravity(Gravity.CENTER, 0, 0);
                LayoutInflater inflater = getLayoutInflater();
                View tastyToast = inflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.tastyLayout));
                TextView toastText = (TextView) tastyToast.findViewById(R.id.textView1);
                newToast.setView(tastyToast);
                newToast.show();

            }
        });

        question7b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(Questionr7.this,Questionr2.class);
                Toast.makeText(Questionr7.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                startActivity(i);



            }
        });

        question7c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast newToast = Toast.makeText(getApplicationContext(), R.string.app_name, Toast.LENGTH_LONG);
                newToast.setGravity(Gravity.CENTER, 0, 0);
                LayoutInflater inflater = getLayoutInflater();
                View tastyToast = inflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.tastyLayout));
                TextView toastText = (TextView) tastyToast.findViewById(R.id.textView1);
                newToast.setView(tastyToast);
                newToast.show();
                //ut

            }
        });

        question7d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast newToast = Toast.makeText(getApplicationContext(), R.string.app_name, Toast.LENGTH_LONG);
                newToast.setGravity(Gravity.CENTER, 0, 0);
                LayoutInflater inflater = getLayoutInflater();
                View tastyToast = inflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.tastyLayout));
                TextView toastText = (TextView) tastyToast.findViewById(R.id.textView1);
                newToast.setView(tastyToast);
                newToast.show();

            }
        });


    }
}

