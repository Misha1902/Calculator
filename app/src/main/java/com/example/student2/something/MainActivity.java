package com.example.student2.something;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout layout;

    Button general;
    Button settingsButton;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        layout = (LinearLayout) findViewById(R.id.layout);
        settingsButton = (Button) findViewById(R.id.settingsButton);
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.settingsButton:
                        i = new Intent(MainActivity.this, Settings.class);
                        startActivity(i);
                break;
                }
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences preferences = getSharedPreferences("button", MODE_PRIVATE);
        String side = preferences.getString("button_side", "");
        Toast.makeText(this, side, Toast.LENGTH_SHORT).show();
        switch(side){
            case "TOP": layout.setGravity(Gravity.TOP);
            break;
            case "RIGHT": layout.setGravity(Gravity.RIGHT);
            break;
            case "LEFT": layout.setGravity(Gravity.LEFT);
            break;
            case "BOTTOM": layout.setGravity(Gravity.BOTTOM);
            break;
        }
    }

}
