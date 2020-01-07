package com.example.customview26112019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    EdittextRedPointWidget widget;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        widget = findViewById(R.id.edt);

        Log.d("BBB",widget.getmTextLabel());
    }
}
