package com.example.aluminumiron.mobileadhoc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Add_new_dependent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_dependent);

        Button btn = (Button) findViewById(R.id.buttonYes);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newdependent();
            }
        });

        Button btn1 = (Button) findViewById(R.id.buttonNo);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cancelNewdep();
            }
        });
    }

    public void newdependent(){
        Intent intent = new Intent(this, Add_Dependents.class);
        startActivity(intent);
    }

    public void cancelNewdep(){
        Intent intent2 = new Intent(this, New_list.class);
        startActivity(intent2);
    }
}
