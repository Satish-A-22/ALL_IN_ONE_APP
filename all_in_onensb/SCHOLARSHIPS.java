package com.example.all_in_onensb;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SCHOLARSHIPS extends AppCompatActivity {
    ImageView ssp,nsp,seva,prize,buddy;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scholarships);
        ssp = findViewById(R.id.imageView);
        nsp = findViewById(R.id.imageView2);
        seva = findViewById(R.id.imageView3);
        prize = findViewById(R.id.imageView4);
        buddy = findViewById(R.id.imageView5);
        ssp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://ssp.postmatric.karnataka.gov.in/");
            }
        });
        nsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://scholarships.gov.in/");
            }
        });
        seva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://sevasindhuservices.karnataka.gov.in/");
            }
        });
        prize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://sw.kar.nic.in/swprizemoney/Home.aspx?ReturnUrl=%2Fswprizemoney%2F");
            }
        });
        buddy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.buddy4study.com/");
            }
        });
    }
    private void gotoUrl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}