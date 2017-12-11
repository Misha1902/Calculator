package com.example.student2.something;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        spinner =  (Spinner) findViewById(R.id.spinner);
        editText = (EditText) findViewById(R.id.editText);
        textView = (TextView) findViewById(R.id.textView);
        editText.setText("0");
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String choise = adapterView.getItemAtPosition(i).toString();
                String num = editText.getText().toString();
                String res = Integer.toBinaryString(Integer.parseInt(num));
                try {
                    switch (choise) {
                        case "8":
                            res = Integer.toOctalString(Integer.parseInt(num));
                            break;
                        case "16":
                            res = Integer.toHexString(Integer.parseInt(num));
                            break;
                    }
                    editText.setText(res);
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Только числа!", Toast.LENGTH_LONG).show();
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
