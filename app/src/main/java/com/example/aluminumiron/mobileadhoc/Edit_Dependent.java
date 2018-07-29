package com.example.aluminumiron.mobileadhoc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Edit_Dependent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit__dependent);

        Button btnsave = (Button) findViewById(R.id.savebtn);
        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginpage();
            }
        });

        Spinner spinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> Myadapter = new ArrayAdapter<String>(Edit_Dependent.this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.Gender));

        Spinner spinner3 = (Spinner)findViewById(R.id.spinner3);
        ArrayAdapter<String> Otheradapter = new ArrayAdapter<String>(Edit_Dependent.this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.relationship_type));

        Myadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(Myadapter);

        Otheradapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(Otheradapter);

    }

    public void loginpage(){
        Intent intent = new Intent(this, Loading_part.class);
        startActivity(intent);
    }
}
