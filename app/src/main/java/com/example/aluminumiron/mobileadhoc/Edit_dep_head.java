package com.example.aluminumiron.mobileadhoc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Edit_dep_head extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_dep_head);

        Button btnn = findViewById(R.id.savebtn1);
        btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editDepentz();
            }
        });

        Spinner spinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> Myadapter = new ArrayAdapter<String>(Edit_dep_head.this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.Gender));

        Spinner spinner1 = (Spinner)findViewById(R.id.spinner1);
        ArrayAdapter<String> Otheradapter = new ArrayAdapter<String>(Edit_dep_head.this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.relationship_type));

        Spinner spinner2 = (Spinner)findViewById(R.id.spinner3);
        ArrayAdapter<String> Theadapter = new ArrayAdapter<String>(Edit_dep_head.this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.hhold_type));

        Myadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(Myadapter);

        Otheradapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(Otheradapter);

        Theadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(Theadapter);
    }

    public void editDepentz(){
        Intent intent = new Intent(this, Edit_Dependent.class);
        startActivity(intent);
    }

}
