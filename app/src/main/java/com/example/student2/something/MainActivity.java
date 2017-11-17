package com.example.student2.something;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
int a;
    TextView result;
    EditText number1;
    EditText number2;
    Button plus;
    Button minus;
    Button multiplication;
    Button division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        a = (int) (Math.random()*5+1);
        super.onCreate(savedInstanceState);

        switch (a) {
            case 1: setContentView(R.layout.activity_main); break;
            case 2: setContentView(R.layout.activity_main2); break;
            case 3: setContentView(R.layout.activity_main3); break;
            case 4: setContentView(R.layout.activity_main4); break;
            case 5: setContentView(R.layout.activity_main5); break;
        }
        result = (TextView) findViewById(R.id.NumOut);
        number1 = (EditText) findViewById(R.id.Num1);
        number2 = (EditText) findViewById(R.id.Num2);
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        multiplication = (Button) findViewById(R.id.multiplication);
        division = (Button) findViewById(R.id.division);
        final View.OnClickListener oclButton = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText Num1;
                String Num1Text;
                EditText Num2;
                String Num2Text;
                TextView NumOut;

                switch (v.getId()) {
                    case R.id.plus:
                        Num1 = number1;
                        Num1Text = Num1.getText().toString();
                        Num2 = number2;
                        Num2Text = Num2.getText().toString();
                        NumOut = result;
                        NumOut.setText("" + (Double.parseDouble(Num1Text) + Double.parseDouble(Num2Text)));
                    break;
                    case R.id.minus:
                        Num1 = number1;
                        Num1Text = Num1.getText().toString();
                        Num2 = number2;
                        Num2Text = Num2.getText().toString();
                        NumOut = result;
                        NumOut.setText("" + (Double.parseDouble(Num1Text) - Double.parseDouble(Num2Text)));
                    break;
                    case R.id.multiplication:
                        Num1 = number1;
                        Num1Text = Num1.getText().toString();
                        Num2 = number2;
                        Num2Text = Num2.getText().toString();
                        NumOut = result;
                        NumOut.setText("" + (Double.parseDouble(Num1Text) * Double.parseDouble(Num2Text)));
                    break;
                    case R.id.division:
                        Num1 = number1;
                        Num1Text = Num1.getText().toString();
                        Num2 = number2;
                        Num2Text = Num2.getText().toString();
                        NumOut = result;
                        NumOut.setText("" + (Double.parseDouble(Num1Text) / Double.parseDouble(Num2Text)));
                    break;
                }
            }
        };
        plus.setOnClickListener(oclButton);
        minus.setOnClickListener(oclButton);
        multiplication.setOnClickListener(oclButton);
        division.setOnClickListener(oclButton);
    }

}
