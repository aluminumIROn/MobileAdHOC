package com.example.aluminumiron.mobileadhoc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Loading_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_page);

        Button btnlast = (Button)findViewById(R.id.btn_last);
        btnlast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendPost();
            }
        });
    }

    public void sendPost(){
        Intent intnz = new Intent(this, Sendpost_page.class);
        startActivity(intnz);
    }
}
