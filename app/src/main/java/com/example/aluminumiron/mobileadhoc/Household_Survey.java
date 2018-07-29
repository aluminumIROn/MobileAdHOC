package com.example.aluminumiron.mobileadhoc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Household_Survey extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_household__survey);

        Spinner spinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> Myadapter = new ArrayAdapter<String>(Household_Survey.this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.Gender));
        Myadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(Myadapter);

        Spinner spinner1 = (Spinner)findViewById(R.id.spinner1);
        ArrayAdapter<String> nextAdapter = new ArrayAdapter<String>(Household_Survey.this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.civil_status));
        nextAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(nextAdapter);

        Spinner spinner2 = (Spinner)findViewById(R.id.spinner2);
        ArrayAdapter<String> endAdapter = new ArrayAdapter<String>(Household_Survey.this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.hhold_type));
        endAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(endAdapter);


        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dependents();
            }
        });

    }

    public void dependents(){
        Intent intent2 = new Intent(this, Add_Dependents.class);
        startActivity(intent2);
    }
}
