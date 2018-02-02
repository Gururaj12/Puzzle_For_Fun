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

public class SOCRATES extends AppCompatActivity {

    Button soc1a,soc2b,soc3c,soc4d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_socrates);

        soc1a= (Button) findViewById(R.id.soc1);
        soc2b= (Button) findViewById(R.id.soc2);
        soc3c= (Button) findViewById(R.id.soc3);
        soc4d= (Button) findViewById(R.id.soc4);


        soc1a.setOnClickListener(new View.OnClickListener() {
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

        soc2b.setOnClickListener(new View.OnClickListener() {
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

        soc3c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(SOCRATES.this,Worldeconomyforum.class);
                Toast.makeText(SOCRATES.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                startActivity(i);

            }
        });

        soc4d.setOnClickListener(new View.OnClickListener() {
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
