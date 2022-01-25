package com.example.simpleparadox.listycity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        TextView t1 = findViewById(R.id.city);
        Button b1 = findViewById(R.id.back);
        Intent new_intent = getIntent();
        t1.setText(new_intent.getStringExtra("key"));
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(ShowActivity.this, MainActivity.class);
                ShowActivity.this.startActivity(in);
            }
        });
    }
}