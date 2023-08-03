package com.example.unitconverter;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner sp1,sp2;
    EditText ed1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp1 = findViewById(R.id.spFrom);
        sp2 = findViewById(R.id.spTo);
        ed1 = findViewById(R.id.txtAmount);
        b1 = findViewById(R.id.btn1);


        String[] from = {"USD"};
        ArrayAdapter<String> ad = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, from);
        sp1.setAdapter(ad);


        String[] to = {"Indian Rupees","Srilankan Rupees"};
        ArrayAdapter<String> ad1 = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, to);
        sp2.setAdapter(ad1);



        b1.setOnClickListener(v -> {

            double tot;

            double amt = Double.parseDouble(ed1.getText().toString());

            if(sp1.getSelectedItem().toString().equals("USD") && sp2.getSelectedItem().toString().equals("Indian Rupees"))
            {
                tot = amt * 70.0;
                Toast.makeText(getApplicationContext(), Double.toString(tot),Toast.LENGTH_LONG).show();
            }
            else if(sp1.getSelectedItem().toString().equals("USD") && sp2.getSelectedItem().toString().equals("Srilankan Rupees"))
            {
                tot = amt * 179.0;
                Toast.makeText(getApplicationContext(), Double.toString(tot),Toast.LENGTH_LONG).show();
            }
        });
    }
}


