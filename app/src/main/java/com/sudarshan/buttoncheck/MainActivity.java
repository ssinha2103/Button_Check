package com.sudarshan.buttoncheck;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    TextView textview;
    ConstraintLayout abcd;

    public void press(View v)
    {
        button1.setEnabled(false);
        button2.setEnabled(true);
        textview.setText("Button 2 enabled");
        abcd.setBackgroundColor(Color.DKGRAY);

    }
    public void press2(View v)
    {
        button1.setEnabled(true);
        button2.setEnabled(false);
        textview.setText("Button 1 enabled");
        abcd.setBackgroundColor(Color.GRAY);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        textview = findViewById(R.id.textView);
        abcd =  findViewById(R.id.abcd);

        button1.setEnabled(true);
        button2.setEnabled(false);
        textview.setText("Button 1 enabled");
        abcd.setBackgroundColor(Color.GRAY);
    }
}
