package com.example.student2.something;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //setContentView(R.layout.activity_main2);
        //setContentView(R.layout.activity_main3);
        setContentView(R.layout.activity_main4);
        //setContentView(R.layout.activity_main5);
    }
    public void plus(View v){
        EditText Num1 = (EditText) this.findViewById(R.id.Num1);
        String Num1Text = Num1.getText().toString();

        EditText Num2 = (EditText) this.findViewById(R.id.Num2);
        String Num2Text = Num2.getText().toString();

        TextView NumOut = (TextView) this.findViewById(R.id.NumOut);
        NumOut.setText("" + (Double.parseDouble(Num1Text) + Double.parseDouble(Num2Text)));

    }

    public void minus(View view) {
        EditText Num1 = (EditText) this.findViewById(R.id.Num1);
        String Num1Text = Num1.getText().toString();

        EditText Num2 = (EditText) this.findViewById(R.id.Num2);
        String Num2Text = Num2.getText().toString();

        TextView NumOut = (TextView) this.findViewById(R.id.NumOut);
        NumOut.setText("" + (Double.parseDouble(Num1Text) - Double.parseDouble(Num2Text)));
    }
    public void multiplication(View view) {
        EditText Num1 = (EditText) this.findViewById(R.id.Num1);
        String Num1Text = Num1.getText().toString();

        EditText Num2 = (EditText) this.findViewById(R.id.Num2);
        String Num2Text = Num2.getText().toString();

        TextView NumOut = (TextView) this.findViewById(R.id.NumOut);
        NumOut.setText("" + (Double.parseDouble(Num1Text) * Double.parseDouble(Num2Text)));
    }
    public void division(View view) {
        EditText Num1 = (EditText) this.findViewById(R.id.Num1);
        String Num1Text = Num1.getText().toString();

        EditText Num2 = (EditText) this.findViewById(R.id.Num2);
        String Num2Text = Num2.getText().toString();

        TextView NumOut = (TextView) this.findViewById(R.id.NumOut);
        NumOut.setText("" + (Double.parseDouble(Num1Text) / Double.parseDouble(Num2Text)));
    }
}
