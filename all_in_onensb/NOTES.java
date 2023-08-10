package com.example.all_in_onensb;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class NOTES extends AppCompatActivity {
    ImageView az,back,easy,sai,plus,vtu,vtu1;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);
        az = findViewById(R.id.imageView);
        back = findViewById(R.id.imageView2);
        easy = findViewById(R.id.imageView3);
        sai = findViewById(R.id.imageView4);
        plus = findViewById(R.id.imageView5);
        vtu = findViewById(R.id.imageView6);
        vtu1 = findViewById(R.id.vtu1);
        az.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.azdocuments.in/");
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://backbencher.club/");
            }
        });
        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://takeiteasyengineers.com/");
            }
        });
        sai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://saividya.ac.in/study-material-cse.html");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.vtupulse.com/vtu-notes/computer-science-and-engineering-notes/");
            }
        });
        vtu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://hemanthrajhemu.github.io/CSE7/17SCHEME/17CS73/");
            }
        });
        vtu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://givology.org/~vtuboss/");
            }
        });



    }
    private void gotoUrl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}
