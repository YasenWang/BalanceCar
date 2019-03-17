package com.yasenonline.balancecar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.yasenonline.balancecar.Activity.ControlKeyboard;

public class MainActivity extends AppCompatActivity {

    private Button btn_control_keyboard;

    private void initial(){
        btn_control_keyboard = (Button)findViewById(R.id.btn_main_controlkeyboard);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initial();

        btn_control_keyboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, ControlKeyboard.class);
                startActivity(intent);
            }
        });
    }
}
