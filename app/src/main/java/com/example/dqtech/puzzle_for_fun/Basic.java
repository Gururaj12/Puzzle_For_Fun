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

import java.util.ArrayList;

public class Basic extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,text;

    TextView t1,t2,t3,t4,t5;

    String button1;

    ArrayList<String> mylist =new ArrayList<String>();
    TextView []tv=new TextView[8];



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);
        b1= (Button) findViewById(R.id.l);
        b2= (Button) findViewById(R.id.b);
        b3= (Button) findViewById(R.id.c);
        b4= (Button) findViewById(R.id.s);
        b5= (Button) findViewById(R.id.u);
        b6= (Button) findViewById(R.id.a);
        b7= (Button) findViewById(R.id.m);
        b8= (Button) findViewById(R.id.i);
        text= (Button) findViewById(R.id.text);


        t1= (TextView) findViewById(R.id.tv1);
        t2= (TextView) findViewById(R.id.tv2);
        t3= (TextView) findViewById(R.id.tv3);
        t4= (TextView) findViewById(R.id.tv4);
        t5= (TextView) findViewById(R.id.tv5);

text.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        add();
    }
});

    }
    public void l(View v){
       button1=b1.getText().toString();

        mylist.add(button1);


      //  b1.setVisibility(View.INVISIBLE);
        //tv[0].setText(mylist.get(0));
    }
    public void b(View v){

        mylist.add(b2.getText().toString());

     //   b2.setVisibility(View.GONE);
    }
    public void c(View v){
        mylist.add(b3.getText().toString());

      //  b3.setVisibility(View.GONE);
    }
    public void s(View v){
        mylist.add(b4.getText().toString());

      //  b4.setVisibility(View.GONE);


    }
    public void u(View v){
        mylist.add(b5.getText().toString());
    }
    public void a(View v){
        mylist.add(b6.getText().toString());
    }
    public void m(View v){
        mylist.add(b7.getText().toString());

    }
    public void i(View v){
        mylist.add(b8.getText().toString());
        Toast.makeText(this, b8.getText().toString(), Toast.LENGTH_SHORT).show();
    }
    public void add(){
        t1.setText(mylist.get(0));
        t2.setText(mylist.get(1));
        t3.setText(mylist.get(2));
        t4.setText(mylist.get(3));
        t5.setText(mylist.get(4));

        if (mylist.get(0).equals("b") && mylist.get(1).equals("a") &&
                mylist.get(2).equals("s") && mylist.get(3).equals("i") &&
                mylist.get(4).equals("c") ){
            Toast.makeText(this, "|Answer correct", Toast.LENGTH_SHORT).show();
        }else
        {
           showTastyToast();
            mylist.clear();
            Intent intent = getIntent();
            finish();
            startActivity(intent);
        }
    }

    public void showTastyToast() {
        Toast newToast = Toast.makeText(getApplicationContext(), R.string.app_name, Toast.LENGTH_LONG);
        newToast.setGravity(Gravity.CENTER, 0, 0);
        LayoutInflater inflater = getLayoutInflater();
        View tastyToast = inflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.tastyLayout));
        TextView toastText = (TextView) tastyToast.findViewById(R.id.textView1);
        newToast.setView(tastyToast);
        newToast.show();
    }




}
