package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView abc, abc2;
    private Button ddd;
    private Boolean tesing1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        abc = findViewById(R.id.testingView);
        abc2 = findViewById(R.id.testingView2);
        ddd = findViewById(R.id.firstButton);
        tesing1 = false;

        ddd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tesing1 = !tesing1;
                abc.setText(tesing1.toString());
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(i);
            }
        });
    }
}