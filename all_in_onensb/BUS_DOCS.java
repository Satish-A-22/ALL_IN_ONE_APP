package com.example.all_in_onensb;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BUS_DOCS extends AppCompatActivity {
    TextView textView14,textView15,textView16,textView17,textView18,textView19,textView20,textView21,textView22,textView23,textView24,textView26,
            textView27,textView28, textView29;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_docs);
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
        textView29 = findViewById(R.id.textView29);
        button2  = findViewById(R.id.button2);
        textView26.setText("REQUIRED DOCUMENTS");
        textView14.setText("1. ONLINE FORM");
        textView23.setText("2. ADHAAR ATHUNICATION  [adhaar consent form]");
        textView22.setText("3. INCOME CERTIFICATE");
        textView21.setText("4. CASTE CERTIFICATE");
        textView19.setText("5. SSLC MARKS CARD");
        textView15.setText("6. PUC MARKS CARD");
        textView17.setText("7. ADHAR CARD  [students and parents]");
        textView20.setText("8. RATION CARD");
        textView16.setText("9. LAST YEAR MARKS CARD [last 2sems]");
        textView18.setText("10. BANK PASS BOOK XEROX");
        textView27.setText("11. FEE RECEIPT");
        textView28.setText("12. E-ATTESTION COPIES");
        textView29.setText("13. PHOTOE-3");
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BUS_DOCS.this, SCHOLARSHIPS.class);
                startActivity(intent);

            }
        });



    }
}