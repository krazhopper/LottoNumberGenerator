package com.example.lottonumbergenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button fiveFiftyBtn = (Button) findViewById(R.id.fivefiftybtn);
        Button twoTwelveBtn = (Button) findViewById(R.id.twotwelvebtn);
        TextView lottoNbrTextView = (TextView) findViewById(R.id.lottoNbrTextView);

        fiveFiftyBtn.setOnClickListener(view -> {

        });

        twoTwelveBtn.setOnClickListener(view -> {

        });
    }
}