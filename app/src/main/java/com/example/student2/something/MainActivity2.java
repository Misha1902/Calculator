package com.example.student2.something;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView A2t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        Intent intent = this.getIntent();
        intent.getStringExtra("number1");
        A2t = (TextView) findViewById(R.id.A2t);
        String number1Text = intent.getStringExtra("number1Text");
        A2t.setText(number1Text);
    }

}
