package com.example.all_in_onensb;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SCHOLARSHIP_DOCS extends AppCompatActivity {
    TextView textView14,textView15,textView16,textView17,textView18,textView19,textView20,textView21,textView22,textView23,textView24,textView26,
            textView27,textView28, textView29;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scholarship_docs);
        textView14= findViewById(R.id.textView14);
        textView15 = findViewById(R.id.textView15);
        textView16 = findViewById(R.id.textView16);
        textView17 = findViewById(R.id.textView17);
        textView18 = findViewById(R.id.textView18);
        textView19 = findViewById(R.id.textView19);
        textView20 = findViewById(R.id.textView20);
        textView21 = findViewById(R.id.textView21);
        textView22 = findViewById(R.id.textView22);
        textView23 = findViewById(R.id.textView23);
        textView24 = findViewById(R.id.textView24);
        textView26 = findViewById(R.id.textView26);
        textView27 = findViewById(R.id.textView27);
        textView28 = findViewById(R.id.textView28);
        button2  = findViewById(R.id.button2);
        textView26.setText("REQUIRED DOCUMENTS");
        textView14.setText("1. ONLINE FORM");
        textView23.setText("2. ADHAAR ATHUNICATION  [adhaar consent form]");
        textView22.setText("3. INCOME CERTIFICATE");
        textView21.setText("4. CASTE CERTIFICATE");
        textView19.setText("5. ADMISSION NUMBER");
        textView15.setText("6. INSTITUTION ADDRESS");
        textView17.setText("7. STUDENT AADHAR NUMBER");
        textView20.setText("8. RATION CARD");
        textView16.setText("9. STUDENTS EMAIL");
        textView18.setText("10. TRAVEL ROUTE DETAILS( FROM , TOSTOP");
        textView27.setText("11. APPLICANT PHOTO");
        textView28.setText("12. SCHOOL/COLLEGE FEE RECEIPT");

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SCHOLARSHIP_DOCS.this, BUS_PASS.class);
                startActivity(intent);

            }
        });

    }
}