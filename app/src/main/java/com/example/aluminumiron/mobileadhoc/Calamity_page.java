package com.example.aluminumiron.mobileadhoc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Calamity_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calamity_page);

        Button btnn = (Button)findViewById(R.id.btnnext);
        btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listfambers();
            }
        });

        Spinner spinner = (Spinner)findViewById(R.id.spinner4);
        ArrayAdapter<String> Myadapter = new ArrayAdapter<String>(Calamity_page.this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.cal_type));

        Spinner spinner6 = (Spinner)findViewById(R.id.spinner6);
        ArrayAdapter<String> Anadapter = new ArrayAdapter<String>(Calamity_page.this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.dmg_type));

        Myadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(Myadapter);

        Anadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner6.setAdapter(Anadapter);

    }

    public void listfambers(){
        Intent intent = new Intent(this, Listfam.class);
        startActivity(intent);
    }
}
