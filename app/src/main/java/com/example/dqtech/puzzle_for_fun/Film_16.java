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

public class Film_16 extends AppCompatActivity {

    TextView film16tv;
    Button film16a,film16b,film16c,film16d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_film_16);

        film16tv = (TextView) findViewById(R.id.film16tv);
        film16a = (Button) findViewById(R.id.film16a);
        film16b = (Button) findViewById(R.id.film16b);
        film16c = (Button) findViewById(R.id.film16c);
        film16d = (Button) findViewById(R.id.film16d);



        film16a.setOnClickListener(new View.OnClickListener() {
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

        film16b.setOnClickListener(new View.OnClickListener() {
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

        film16c.setOnClickListener(new View.OnClickListener() {
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

        film16d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Correct answer",Toast.LENGTH_SHORT).show();
                Intent film16=new Intent(Film_16.this,Film_17.class);
                startActivity(film16);
            }
        });
    }
}