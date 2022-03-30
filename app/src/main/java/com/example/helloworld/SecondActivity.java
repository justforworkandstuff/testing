package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private TextView text;
    private Button secondButton, thirdButton;
    private ImageView imageVViewer;
    private RadioButton yes, no;
    private Boolean check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        text = findViewById(R.id.secondActivityText);
        secondButton = findViewById(R.id.goBackMainButton);
        imageVViewer = findViewById(R.id.imageView);
        thirdButton = findViewById(R.id.goClick);
        yes = findViewById(R.id.yesradio);
        no = findViewById(R.id.noradio);

        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                radiobutton();
            }
        });

        thirdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                thatthingg();
            }
        });
    }

    public void sometthing() {
        text.setText("changing picture");
        imageVViewer.setImageResource(R.drawable.card_back);
    }

    private void radiobutton()
    {
        if(yes.isChecked())
        {
            text.setText("blablabla");
            Toast.makeText(this, "something", Toast.LENGTH_SHORT).show();
        }
        else if(no.isChecked())
        {
            text.setText("nonono");
            Toast.makeText(this, "that t", Toast.LENGTH_SHORT).show();
        }
    }

    private void thatthingg() {
        imageVViewer.setImageDrawable(null);
    }
}