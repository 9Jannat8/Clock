package com.example.clock;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.TextClock;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextClock textClock;
    private AnalogClock analogClock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        analogClock = findViewById(R.id.analogclockId);
        textClock = findViewById(R.id.textclockId);

        analogClock.setOnClickListener(this);
        //textClock supports only api level 17 or 17+
        textClock.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.analogclockId) {
            Toast.makeText(MainActivity.this, "Analog clock", Toast.LENGTH_SHORT).show();
        } if(v.getId() == R.id.textclockId) {
            Toast.makeText(MainActivity.this, "Text clock", Toast.LENGTH_SHORT).show();
        }

    }
}