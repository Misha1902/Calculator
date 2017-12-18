package com.example.student2.something;

import android.content.SharedPreferences;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Settings extends AppCompatActivity {
    private RadioGroup RadioGroup;
    RadioButton top;
    RadioButton right;
    RadioButton left;
    RadioButton bottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        top = (RadioButton) findViewById(R.id.radioTop);
        right = (RadioButton) findViewById(R.id.radioRight);
        left = (RadioButton) findViewById(R.id.radioLeft);
        bottom = (RadioButton) findViewById(R.id.radioBottom);
        RadioGroup = (RadioGroup) findViewById(R.id.RGroup);
        RadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                String side = "";
                switch(checkedId){
                    case R.id.radioTop: side = "TOP";
                    break;
                    case R.id.radioLeft: side = "LEFT";
                    break;
                    case R.id.radioBottom: side = "BOTTOM";
                    break;
                    case R.id.radioRight: side = "RIGHT";
                    break;
                }
                SharedPreferences preferences = getSharedPreferences("button", MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("button_side",  side);
                editor.apply();
            }
        });
    }
}
