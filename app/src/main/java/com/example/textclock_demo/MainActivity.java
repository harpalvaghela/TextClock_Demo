package com.example.textclock_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextClock tClock;
    private TextView tView;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        tClock = findViewById(R.id.textClock1);
        tView = findViewById(R.id.textview1);
        btn = findViewById(R.id.btnGetTime);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tView.setText("Time : "+tClock.getText());
            }
        });
    }
}
