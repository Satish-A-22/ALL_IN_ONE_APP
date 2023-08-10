package com.example.all_in_onensb;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class BUS_PASS extends AppCompatActivity {
    ImageView bmtc,ksrtc;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_pass);
        bmtc = findViewById(R.id.imageView);
        ksrtc = findViewById(R.id.imageView2);
        ksrtc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://sevasindhuservices.karnataka.gov.in/");
            }
        });
        bmtc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("http://student.mybmtc.com:8280/bmtc/login/secure");
            }
        });
    }
    private void gotoUrl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}