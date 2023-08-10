package com.example.all_in_onensb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Sign_in extends AppCompatActivity {
    ImageView notes,scholarship,bus,Calculator,chatgpt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        notes = findViewById(R.id.imageView);
        bus = findViewById(R.id.imageView3);
        scholarship = findViewById(R.id.imageView2);
        Calculator = findViewById(R.id.imageView4);
        chatgpt = findViewById(R.id.imageView5);


        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sign_in.this,NOTES.class);
                startActivity(intent);
                Toast.makeText(Sign_in.this, "U clicked on notes", Toast.LENGTH_SHORT).show();            }
        });
        bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sign_in.this,SCHOLARSHIP_DOCS.class);
                startActivity(intent);
                Toast.makeText(Sign_in.this, "U clicked on Bus Information", Toast.LENGTH_SHORT).show();            }
        });

        scholarship.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sign_in.this,BUS_DOCS.class);
                startActivity(intent);
                Toast.makeText(Sign_in.this, "U clicked on ScholarShip", Toast.LENGTH_SHORT).show();            }
        });
        Calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sign_in.this,CALCULATOR.class);
                startActivity(intent);
                Toast.makeText(Sign_in.this, "U clicked on Calculator", Toast.LENGTH_SHORT).show();            }
        });
        chatgpt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sign_in.this,chatgpt.class);
                startActivity(intent);
                Toast.makeText(Sign_in.this, "U clicked on Chatgpt", Toast.LENGTH_SHORT).show();            }
        });
    }
}