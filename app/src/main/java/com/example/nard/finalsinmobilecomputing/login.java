package com.example.nard.finalsinmobilecomputing;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class login extends AppCompatActivity {

    Button thbtn,hehe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        thbtn = (Button) findViewById(R.id.tchbtn);
        hehe=(Button) findViewById(R.id.quad);

        thbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this,OnTouchActivity.class);
                startActivity(intent);

            }
        });

        thbtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Intent intent = new Intent(login.this,OnTouchActivity.class);
                startActivity(intent);
                return false;
            }
        });
        hehe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this,quadrant.class);
                startActivity(intent);
            }
        });
        hehe.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Intent intent = new Intent(login.this,quadrant.class);
                startActivity(intent);
                return false;
            }
        });
    };
}
