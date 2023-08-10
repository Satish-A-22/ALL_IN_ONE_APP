package com.example.all_in_onensb;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CALCULATOR extends AppCompatActivity {
    ImageView sgpa,cgpa,sc;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        sgpa = findViewById(R.id.imageView);
        cgpa = findViewById(R.id.imageView2);
        sc = findViewById(R.id.imageView3);
        sgpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://calc.takeiteasyengineers.com/sem");
            }
        });
        cgpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://calc.takeiteasyengineers.com/cgpacalc");
            }
        });
        sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.desmos.com/scientific");
            }
        });
    }
        private void gotoUrl(String s){
            Uri uri = Uri.parse(s);
            startActivity(new Intent(Intent.ACTION_VIEW,uri));
        }
    }
