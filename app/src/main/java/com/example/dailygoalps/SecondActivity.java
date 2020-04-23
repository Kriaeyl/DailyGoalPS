package com.example.dailygoalps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button b1 = findViewById(R.id.button2);
        TextView tv1 = findViewById(R.id.textView8);

        Intent i = getIntent();
        ArrayList<String> info = i.getStringArrayListExtra("info");
        tv1.setText("");
        String message = "";
        for (String j:info) {
            message += j + "\n";
        }
        tv1.setText(message);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                return;
            }
        });
    }
}
