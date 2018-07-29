package com.example.aluminumiron.mobileadhoc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class New_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_list);

        Button btnsave = findViewById(R.id.saveBtns);
        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNextpage();
            }
        });
    }

    public void openNextpage() {
        Intent inthent = new Intent(this, Edit_dep_head.class);
        startActivity(inthent);
    }
}
