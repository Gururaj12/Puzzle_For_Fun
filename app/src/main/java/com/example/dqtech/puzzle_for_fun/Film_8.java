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

public class Film_8 extends AppCompatActivity {
Button f8a,f8b,f8c,f8d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_film_8);
        f8a= (Button) findViewById(R.id.film8_1);
        f8b= (Button) findViewById(R.id.film8_2);
        f8c= (Button) findViewById(R.id.film8_3);
        f8d= (Button) findViewById(R.id.film8_4);
        f8a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast newToast = Toast.makeText(getApplicationContext(), R.string.app_name, Toast.LENGTH_LONG);
                newToast.setGravity(Gravity.CENTER, 0, 0);
                LayoutInflater inflater = getLayoutInflater();
                View tastyToast = inflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.tastyLayout));
                TextView toastText = (TextView) tastyToast.findViewById(R.id.textView1);
                newToast.setView(tastyToast);
                newToast.show();
            }
        });
        f8b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast newToast = Toast.makeText(getApplicationContext(), R.string.app_name, Toast.LENGTH_LONG);
                newToast.setGravity(Gravity.CENTER, 0, 0);
                LayoutInflater inflater = getLayoutInflater();
                View tastyToast = inflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.tastyLayout));
                TextView toastText = (TextView) tastyToast.findViewById(R.id.textView1);
                newToast.setView(tastyToast);
                newToast.show();
            }
        });
        f8c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast newToast = Toast.makeText(getApplicationContext(), R.string.app_name, Toast.LENGTH_LONG);
                newToast.setGravity(Gravity.CENTER, 0, 0);
                LayoutInflater inflater = getLayoutInflater();
                View tastyToast = inflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.tastyLayout));
                TextView toastText = (TextView) tastyToast.findViewById(R.id.textView1);
                newToast.setView(tastyToast);
                newToast.show();
            }
        });
        f8d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Correct answer",Toast.LENGTH_SHORT).show();
                Intent film8=new Intent(Film_8.this,Film_9.class);
                startActivity(film8);
            }
        });
    }
}
