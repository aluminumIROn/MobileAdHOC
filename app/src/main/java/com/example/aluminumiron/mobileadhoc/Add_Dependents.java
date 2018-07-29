package com.example.aluminumiron.mobileadhoc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Add_Dependents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__dependents);

        Spinner spinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> Myadapter = new ArrayAdapter<String>(Add_Dependents.this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.Gender));

        Spinner spinner3 = (Spinner)findViewById(R.id.spinner3);
        ArrayAdapter<String> Otheradapter = new ArrayAdapter<String>(Add_Dependents.this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.relationship_type));

        Myadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(Myadapter);

        Otheradapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(Otheradapter);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                otherdependent();
            }
        });
    }

    public void otherdependent(){
        Intent intent3 = new Intent(this, Add_new_dependent.class);
        startActivity(intent3);
    }
}
